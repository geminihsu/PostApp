package com.gemini.postapp.base

import androidx.lifecycle.ViewModel
import com.gemini.postapp.injection.component.ViewModelInjector
import com.gemini.postapp.injection.component.DaggerViewModelInjector
import com.gemini.postapp.injection.module.NetworkModule
import com.gemini.postapp.ui.post.PostListViewModel

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}