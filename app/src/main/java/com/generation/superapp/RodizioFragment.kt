package com.generation.superapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.generation.superapp.databinding.FragmentRodizioBinding


class RodizioFragment : Fragment() {

    private lateinit var binding: FragmentRodizioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {

        binding = FragmentRodizioBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}