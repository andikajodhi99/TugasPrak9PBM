package com.example.prakpbm9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel: ViewModel() {
    //tambahan

    private val mNim = MutableLiveData<String>()
    val nim: LiveData<String>
        get() = mNim
    fun setNim(nim: String) {
        mNim.value = nim
    }

    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}