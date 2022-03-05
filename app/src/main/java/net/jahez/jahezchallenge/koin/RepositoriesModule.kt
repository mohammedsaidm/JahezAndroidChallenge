package com.arheb.user.koin

import com.arheb.user.service.repository.remotes.*
import org.koin.dsl.module.module

@JvmField
val DependencyModule = module {

    single { MainRepository() }
    single { RestaurantDetailsRepository() }
    single { AboutUsRepository() }
    single { PrivacyPolicyRepository() }
    single { ShopCartRepository() }


//    factory { OrderRequest(Parcel.obtain()) }


}