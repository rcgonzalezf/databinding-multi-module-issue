package com.rcgonzalezf.ui.adapter

import android.widget.TextView
import androidx.databinding.BindingAdapter
import javax.inject.Inject

class SomeViewBindingAdapter @Inject constructor() {

    private val defaultValue = mapOf(1 to "one", 2 to "two")

    @BindingAdapter(value = ["uxSrc", "uxMediaType"], requireAll = false)
    fun bindTextWithNumber(view: TextView, source: String?, type: MediaType?) {
        when (type) {
            null -> {
                view.text = "Not Found"
            }
            MediaType.IMAGE -> {
                throw NotImplementedError("Use other stuff")
            }
            MediaType.VIDEO -> {
                view.text = defaultValue[1] + source
                view.contentDescription = defaultValue[2] + source
            }
        }
    }

}
