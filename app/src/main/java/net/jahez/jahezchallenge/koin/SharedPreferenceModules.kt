package com.arheb.user.koin

import com.arheb.user.utilities.SharedPreferenceHandler
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

@JvmField
val SharedPreferenceModule = module {
    single { SharedPreferenceHandler(androidContext()) }
}