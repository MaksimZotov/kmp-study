package com.mz.kmpstudy.core.koin

import com.mz.kmpstudy.core.routing.di.coreRoutingModule
import com.mz.kmpstudy.feature.counter.di.featureCounterModule
import com.mz.kmpstudy.feature.home.di.featureHomeModule
import org.koin.core.module.Module
import ru.mz.kmpstudy.client.counter.di.clientCounterModule

object ModulesProvider {
    fun getModules(): List<Module> {
        return listOf(
            coreRoutingModule,
            clientCounterModule,
            featureHomeModule,
            featureCounterModule,
        )
    }
}