package com.mz.kmpstudy.core.app.koin

import com.mz.kmpstudy.client.counter.clientCounterModule
import com.mz.kmpstudy.core.app.di.coreAppModule
import com.mz.kmpstudy.core.routing.di.coreRoutingModule
import com.mz.kmpstudy.feature.counter.featureCounterModule
import com.mz.kmpstudy.feature.home.di.featureHomeModule
import org.koin.core.module.Module
import org.koin.dsl.module

object ModulesProvider {
    fun getModules(): List<Module> {
        return listOf(
            coreRoutingModule,
            coreAppModule,
            featureHomeModule,
            testCommonModule,
        )
    }
}

private val testCommonModule = module {
    includes(clientCounterModule, featureCounterModule)
}