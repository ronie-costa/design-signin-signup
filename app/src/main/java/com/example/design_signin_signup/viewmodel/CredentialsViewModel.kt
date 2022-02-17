package com.example.design_signin_signup.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CredentialsViewModel: ViewModel() {

    private var _startSignIn = MutableLiveData<Boolean>()
    val startSignIn: LiveData<Boolean> = _startSignIn

    private var _startSignUp = MutableLiveData<Boolean>()
    val startSignUp: LiveData<Boolean> = _startSignUp

    fun navigationSignIn() {
        _startSignIn.postValue(true)
    }

    fun navigationSignUp() {
        _startSignUp.postValue(true)
    }
}