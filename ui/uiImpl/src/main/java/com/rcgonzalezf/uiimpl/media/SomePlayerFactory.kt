package com.rcgonzalezf.uiimpl.media

import android.content.Context
import android.widget.Toast
import com.rcgonzalezf.ui.media.PlayerFactory
import com.rcgonzalezf.ui.media.SomePlayer
import javax.inject.Inject

class SomePlayerFactory @Inject constructor(val context: Context): PlayerFactory {

    override fun create(): SomePlayer {
        return ToastPlayer(context)
    }
}
