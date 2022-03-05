package com.arheb.user.koin

import com.arheb.user.viewmodel.*
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

@JvmField
val ViewModelModule = module {

    viewModel { LoginActivityViewModel(androidApplication()) }
    viewModel { MainActivityViewModel(androidApplication()) }
    viewModel { RestaurantDetailsActivityViewModel(androidApplication()) }
    viewModel { AboutUsViewModel(androidApplication()) }
    viewModel { PrivacyPolicyViewModel(androidApplication()) }
    viewModel { ShopCartViewModel(androidApplication()) }


}