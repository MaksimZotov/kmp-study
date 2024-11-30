package com.mz.kmpstudy.client.counter

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapNotNull

class CounterRepository {

    private companion object {
        const val COUNTER_NAME_PREFIX = "COUNTER: "
    }

    private val counters = MutableStateFlow(emptyMap<String, Int>())

    fun getCountersFlow(): Flow<Map<String, Int>> {
        return counters.asStateFlow()
    }

    fun getCounterFlow(name: String): Flow<Int> {
        return getCountersFlow().mapNotNull { map ->
            map[name] ?: run {
                val newMap = map.toMutableMap()
                newMap[name] = 0
                counters.value = newMap
                0
            }
        }
    }

    fun addNewCounter(): String {
        val maxKeyNumber = counters.value.map { mapEntry ->
            mapEntry.key.substringAfter(COUNTER_NAME_PREFIX).toIntOrNull() ?: 0
        }.maxOrNull() ?: 0
        val nextKey = "$COUNTER_NAME_PREFIX${maxKeyNumber + 1}"
        val newMap = counters.value.toMutableMap()
        newMap[nextKey] = 0
        counters.value = newMap
        return nextKey
    }

    fun increment(name: String) {
        addToCurrentCounter(name, 1)
    }

    fun decrement(name: String) {
        addToCurrentCounter(name, -1)
    }

    private fun addToCurrentCounter(name: String, toAdd: Int) {
        val newMap = counters.value.toMutableMap()
        newMap[name] = newMap.getOrPut(name) { 0 } + toAdd
        counters.value = newMap
    }
}