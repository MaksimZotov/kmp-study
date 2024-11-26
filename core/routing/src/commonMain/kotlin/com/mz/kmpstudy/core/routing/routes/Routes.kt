package com.mz.kmpstudy.core.routing.routes

object Routes {

    const val HOME = "home"
    const val COUNTER = "counter?$COUNTER_NAME={$COUNTER_NAME}"

    fun getCounterRoute(
        counterName: String
    ) = COUNTER.replace(
        oldValue = "{$COUNTER_NAME}",
        newValue = counterName
    )
}