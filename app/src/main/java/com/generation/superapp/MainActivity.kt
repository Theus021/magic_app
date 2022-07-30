package com.generation.superapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.generation.superapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Comunicador {

    private lateinit var binding: ActivityMainBinding
    private  val navController: NavController by lazy {

        supportFragmentManager.findFragmentById(R.id.fragmentContainerView)!!.findNavController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    override fun passData(editDataResult: String) {
        val bundle = Bundle()
        bundle.putString("input", editDataResult)


        val transicao = this.supportFragmentManager.beginTransaction()
        val fragmentB = ResultadoImc()

        fragmentB.arguments = bundle

        transicao.replace(R.id.fragmentContainerView, fragmentB).commit()
    }



}