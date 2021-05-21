package com.rcgonzalezf.databindingissueapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.inflate
import com.rcgonzalezf.databindingissueapp.component.SomeViewComponent
import com.rcgonzalezf.databindingissueapp.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {//, HasAndroidInjector {

//    @Inject
//    lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var someViewComponent: SomeViewComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

         val viewBinding:ActivityMainBinding
         = inflate(layoutInflater, R.layout.activity_main, null, false, someViewComponent)
        viewBinding.lifecycleOwner = this

        //setContentView(R.layout.activity_main)
        setContentView(viewBinding.root)
    }

//    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector
}
