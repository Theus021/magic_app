package com.generation.superapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.superapp.databinding.FragmentGasolinaBinding

class GasolinaFragment : Fragment() {

    private lateinit var binding: FragmentGasolinaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {

    binding = FragmentGasolinaBinding.inflate(layoutInflater, container, false)
    return binding.root

    }
}