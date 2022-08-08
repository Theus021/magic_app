package com.generation.superapp

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.generation.superapp.databinding.FragmentImc2Binding

class Imc2Fragment : Fragment() {

    private lateinit var binding: FragmentImc2Binding

    private var genero: String = ""
    private var altura: Int = 0
    private var idade = 0
    private var peso = 60

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View {

        binding = FragmentImc2Binding.inflate(layoutInflater, container, false)

        getUserGenero()
        getUserAltura()
        getUserIdade()
        getUserPeso()
        btnClick()

        return binding.root


    }

    private fun getUserAltura() {

        binding.seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {

                binding.resultadoAltura.text = progress.toString()
                altura = progress

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

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

        val resultado = Calculo().toString()
        val categoria: String

        binding.buttonCalcular.setOnClickListener {

            findNavController().navigate(R.id.action_imc2Fragment_to_resultadoImc, Bundle().apply {
                putString ("valorImc", resultado as String?)

            })

        }
    }

    private fun Calculo(): Double {

        val imc = (peso/(altura).toDouble())*1000

        return imc

    }

}
