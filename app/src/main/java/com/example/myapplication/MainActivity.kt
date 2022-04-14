package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.interfaceas.ICommunicator

class MainActivity : AppCompatActivity(), ICommunicator{
    private lateinit var binding: ActivityMainBinding
    private val firstFragment= FirstFragment()
    private val secondFragment= SecondFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_framelayout,firstFragment)
            commit()
        }
        binding.btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_framelayout,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_framelayout,secondFragment)
                addToBackStack(null)
                commit()
            }
        }

    }

    override fun passData(editTextInput: String) {

        val bundle= Bundle()
        bundle.putString("message", editTextInput)
        secondFragment.arguments=bundle
        this.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_framelayout, secondFragment)
            .commit()
    }
}