package com.mz.kmpstudy.client.counter.di

import org.koin.dsl.module
import com.mz.kmpstudy.client.counter.CounterRepository

val clientCounterModule = module {
    single {
        CounterRepository()
    }
}