package com.rcgonzalezf.databindingissueapp.app

import android.app.Application
import com.rcgonzalezf.databindingissueapp.dagger.DaggerSampleApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class SampleApplication: Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> =
        dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerSampleApplicationComponent.builder()
            .withApplication(this)
            .build()
            .inject(this)

    }

}
