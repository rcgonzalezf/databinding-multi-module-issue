package com.rcgonzalezf.databindingissueapp.component

import androidx.databinding.DataBindingComponent
import com.rcgonzalezf.ui.adapter.SomeViewBindingAdapter
import javax.inject.Inject

class SomeViewComponent @Inject constructor(private val someViewBindingAdapter: SomeViewBindingAdapter) :
    DataBindingComponent {

    override fun getSomeViewBindingAdapter(): SomeViewBindingAdapter {
        return someViewBindingAdapter
    }
}
