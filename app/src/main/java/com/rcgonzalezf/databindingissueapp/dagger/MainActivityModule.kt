package com.rcgonzalezf.databindingissueapp.dagger

import android.app.Activity
import com.rcgonzalezf.databindingissueapp.MainActivity
import com.rcgonzalezf.uiapp.MediaViewModule
import dagger.Binds
import dagger.Module

@Module(includes = [MediaViewModule::class])
abstract class MainActivityModule {

    @Binds
    abstract fun bindsMainActivityToActivity(activity: MainActivity): Activity
}
