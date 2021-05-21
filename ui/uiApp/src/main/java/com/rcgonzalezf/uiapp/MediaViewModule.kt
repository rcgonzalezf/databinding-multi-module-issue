package com.rcgonzalezf.uiapp

import com.rcgonzalezf.ui.media.PlayerFactory
import com.rcgonzalezf.uiimpl.media.SomePlayerFactory
import dagger.Binds
import dagger.Module

@Module
abstract class MediaViewModule {

    @Binds
    abstract fun bindSomePlayerFactory(somePlayerFactory: SomePlayerFactory): PlayerFactory
}
