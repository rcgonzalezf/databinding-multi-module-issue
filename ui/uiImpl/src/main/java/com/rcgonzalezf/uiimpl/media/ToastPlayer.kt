package com.rcgonzalezf.uiimpl.media

import android.content.Context
import android.widget.Toast
import com.rcgonzalezf.ui.media.SomePlayer
import javax.inject.Inject

class ToastPlayer constructor(private val context: Context) : SomePlayer {
    override fun play() {
        Toast.makeText(context, "Now Playing!", Toast.LENGTH_SHORT).show()
    }
}