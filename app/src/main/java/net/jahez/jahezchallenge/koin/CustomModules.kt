package com.arheb.user.koin


import com.arheb.user.utilities.ConnectionReceiver
import com.arheb.user.utilities.CustomUtils
import org.koin.dsl.module.module

@JvmField
val CustomModules= module {

    single { ConnectionReceiver() }
    single { CustomUtils() }
}