package com.rcgonzalezf.databindingissueapp.dagger

import android.app.Application
import android.content.Context
import com.rcgonzalezf.databindingissueapp.MainActivity
import com.rcgonzalezf.uiapp.MediaViewModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SampleApplicationModule {

    @Binds
    abstract fun provideContext(application: Application): Context

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity
}
