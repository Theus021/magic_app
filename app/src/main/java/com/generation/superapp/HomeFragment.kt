package com.generation.superapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.superapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        binding.cardImc.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_imc2Fragment)
        }

        binding.cardGasolina.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_gasolinaFragment2)
        }
        return binding.root
    }


}