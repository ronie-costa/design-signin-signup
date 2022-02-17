package com.example.design_signin_signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.design_signin_signup.databinding.FragmentSignInBinding
import com.example.design_signin_signup.viewmodel.CredentialsViewModel

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    private lateinit var viewModel: CredentialsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)

        viewModel = activity?.let {
            ViewModelProvider(it)[CredentialsViewModel::class.java]
        }!!

        return binding.root
    }
}