package com.example.design_signin_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.design_signin_signup.databinding.ActivityCredentialsBinding
import com.example.design_signin_signup.viewmodel.CredentialsViewModel

class CredentialsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCredentialsBinding
    private lateinit var viewModel: CredentialsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCredentialsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        viewModel = ViewModelProvider(this)[CredentialsViewModel::class.java]


    }
}