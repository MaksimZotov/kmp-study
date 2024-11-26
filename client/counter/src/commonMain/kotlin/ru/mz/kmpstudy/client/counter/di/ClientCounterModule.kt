package ru.mz.kmpstudy.client.counter.di

import org.koin.dsl.module
import ru.mz.kmpstudy.client.counter.CounterRepository

val clientCounterModule = module {
    single {
        CounterRepository()
    }
}