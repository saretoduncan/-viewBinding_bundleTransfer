package com.example.myapplication

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.interfaceas.ICommunicator


/**
 * A simple [Fragment] subclass.

 */
class FirstFragment : Fragment(R.layout.fragment_first) {
//     private lateinit var binding: FragmentFirstBinding
    private lateinit var communicator:ICommunicator
    private var _binding: FragmentFirstBinding?=null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
       communicator= activity as ICommunicator
           val view = binding.root
            binding.btnsend.setOnClickListener{
            communicator.passData(binding.edEditText.text.toString());
        }
        return view
    }





}