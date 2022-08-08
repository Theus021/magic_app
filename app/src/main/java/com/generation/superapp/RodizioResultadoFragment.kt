package com.generation.superapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.superapp.databinding.FragmentResultadoRodizioBinding


class RodizioResultadoFragment : Fragment() {

    private lateinit var binding: FragmentResultadoRodizioBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentResultadoRodizioBinding.inflate(layoutInflater, container, false)

        return binding.root

    }


    }
