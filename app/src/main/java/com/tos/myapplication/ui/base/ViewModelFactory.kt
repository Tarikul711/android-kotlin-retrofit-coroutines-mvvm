package com.tos.myapplication.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tos.myapplication.data.api.ApiHelper
import com.tos.myapplication.data.repository.MainRepository
import com.tos.myapplication.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

/**
 *Created by tarikul on 5/9/20
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}