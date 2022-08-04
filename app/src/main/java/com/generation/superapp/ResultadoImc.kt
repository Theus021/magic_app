package com.generation.superapp

import android.R
import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.generation.superapp.databinding.FragmentResultadoImcBinding
import org.w3c.dom.Text

class ResultadoImc: DialogFragment() {

    private lateinit var binding: FragmentResultadoImcBinding
    private lateinit var comunicador : Comunicador

    var output: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultadoImcBinding.inflate(layoutInflater, container, false)

        var textView : TextView = binding.resultadoPesoDg


        output = arguments?.getString("input")


        textView.text = output

        return binding.root

    }




}