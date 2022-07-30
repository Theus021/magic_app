package com.generation.superapp

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.generation.superapp.databinding.FragmentResultadoImcBinding

class ResultadoImc: DialogFragment() {

    private lateinit var binding: FragmentResultadoImcBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultadoImcBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    val resultado = requireArguments().getSerializable("resultadoImc")

}