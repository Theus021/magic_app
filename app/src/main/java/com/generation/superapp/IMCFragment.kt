package com.generation.superapp

import android.R.attr.defaultValue
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.generation.superapp.databinding.FragmentImcBinding


class IMCFragment : Fragment() {

    private lateinit var binding: FragmentImcBinding
    private lateinit var comunicador: Comunicador

    private var genero: String = ""
    private var altura: Int = 0
    private var idade: Int = 18
    private var peso: Int = 60

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {

        binding = FragmentImcBinding.inflate(layoutInflater, container, false)


        getUserGenero()
        getUserAltura()
        getUserIdade()
        getUserPeso()
        btnClick()

        return binding.root


    }

    private fun getUserAltura() {
        binding.seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                binding.resultadoAltura.text = progress.toString()
                altura = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

    }

    private fun getUserGenero() {
        binding.buttonMulher.setOnClickListener {
            binding.buttonMulher.setBackgroundResource(R.drawable.ic_mulher_clicked)
            binding.buttonHomem.setBackgroundResource(R.drawable.ic_homem_)
            genero = "Mulher"
        }

            binding.buttonHomem.setOnClickListener {
                binding.buttonHomem.setBackgroundResource(R.drawable.ic_homem_clicked)
                binding.buttonMulher.setBackgroundResource(R.drawable.ic_mulher_)
                genero = "Homem"
        }
    }

    private fun getUserIdade() {
        binding.buttonMaisID.setOnClickListener{
            idade++
            binding.resultadoIdade.text = idade.toString()
        }

        binding.buttonenosID.setOnClickListener {
            idade--
            binding.resultadoIdade.text = idade.toString()
        }
    }

    private fun getUserPeso(){
        binding.buttonMaisKg.setOnClickListener {
            peso++
            binding.resultadoPeso.text = peso.toString()
        }

        binding.buttonMenosKg.setOnClickListener {
            peso--
            binding.resultadoPeso.text = peso.toString()
        }
    }

    private fun btnClick(){

        val textView = binding.resultadoPeso

        comunicador = activity as Comunicador

        binding.buttonCalcular.setOnClickListener {
            comunicador.passData(textView.text.toString())

        }
    }
}



