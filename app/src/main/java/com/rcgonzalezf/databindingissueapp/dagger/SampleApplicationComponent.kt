package com.rcgonzalezf.databindingissueapp.dagger

import android.app.Application
import com.rcgonzalezf.databindingissueapp.app.SampleApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        SampleApplicationModule::class
    ]
)
interface SampleApplicationComponent {

    fun inject(application: SampleApplication)

    @Component.Builder
    interface Builder {

        fun build(): SampleApplicationComponent

        @BindsInstance
        fun withApplication(provided: Application): Builder
    }
}
