package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.databinding.FragmentSecondBinding


/**
 * A simple [Fragment] subclass.

 */
class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding?=null
    private val binding get()= _binding!!
    private var displayMessage: String?=""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentSecondBinding.inflate(inflater,container,false)
       var view= binding.root
        displayMessage= arguments?.getString("message")
        binding.tvtextview.text= displayMessage
    return view
    }
// to avoid leakage
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}