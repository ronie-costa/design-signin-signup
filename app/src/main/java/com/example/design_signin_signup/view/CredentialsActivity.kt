package com.example.design_signin_signup.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.design_signin_signup.databinding.ActivityCredentialsBinding
import com.example.design_signin_signup.services.adapter.CredentialsFragmentAdapter
import com.example.design_signin_signup.view.fragment.InitialFragment
import com.example.design_signin_signup.view.fragment.SignInFragment
import com.example.design_signin_signup.view.fragment.SignUpFragment
import com.example.design_signin_signup.viewmodel.CredentialsViewModel

class CredentialsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCredentialsBinding
    private lateinit var viewModel: CredentialsViewModel
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCredentialsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        viewModel = ViewModelProvider(this)[CredentialsViewModel::class.java]

        val listFragments = mutableListOf(
            SignInFragment(),
            InitialFragment(),
            SignUpFragment()
        )

        val adapterFragment = CredentialsFragmentAdapter(
            supportFragmentManager,
            lifecycle,
            listFragments
        )
        viewPager = binding.viewPagerCredentials
        viewPager.adapter = adapterFragment
        viewPager.setCurrentItem(1, false)

        observers()
    }

    private fun observers() {

    }
}