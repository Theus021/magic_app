package com.generation.superapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.generation.superapp.databinding.FragmentGasolinaBinding

class GasolinaFragment : Fragment() {

    private lateinit var binding: FragmentGasolinaBinding

    private var gasolina: Double = 0.0
    private var etanol: Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {


    binding = FragmentGasolinaBinding.inflate(layoutInflater, container, false)

        botaoCalcular()


    return binding.root

    }

    private fun botaoCalcular(){
        binding.BtCalcularGas.setOnClickListener{
            mostrarcalculo()
        }
    }

    private fun mostrarcalculo() {



        val gasolina = binding.inputGasolina.text.toString().toDouble()
        val etanol = binding.inputEtanol.text.toString().toDouble()

        val resultado = etanol/gasolina

        if (resultado >= 0.7){
            Toast.makeText(activity as AppCompatActivity, "Abasteça com GASOLINA", Toast.LENGTH_LONG).show()
            binding.cardGasolina.setBackgroundResource(R.drawable.card_vantajoso)
            binding.cardEtanol.setBackgroundResource(R.drawable.card_menos_vantajoso)

        }
        else{
            Toast.makeText(activity as AppCompatActivity, "Abasteça com ETANOL", Toast.LENGTH_SHORT).show()
            binding.cardGasolina.setBackgroundResource(R.drawable.card_menos_vantajoso)
            binding.cardEtanol.setBackgroundResource(R.drawable.card_vantajoso)
        }

    }

}