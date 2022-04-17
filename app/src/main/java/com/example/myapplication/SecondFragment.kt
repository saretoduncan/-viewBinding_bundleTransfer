package com.example.myapplication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.databinding.FragmentSecondBinding


/**
 * A simple [Fragment] subclass.

 */
class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    //    private var _binding: FragmentSecondBinding?=null
//    private val binding get()= _binding!!
//    private var displayMessage: String?=""
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding= FragmentSecondBinding.inflate(inflater,container,false)
//       var view= binding.root
//        displayMessage= arguments?.getString("message")
//        binding.tvtextview.text= displayMessage
//    return view
//    }
//// to avoid leakage
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    )=   FragmentSecondBinding.inflate(inflater, container, false)

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        binding.tvtextview.text= arguments?.getString("message")
//    }

    //onActivityCreated is deprecated. use onViewCreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvtextview.text= arguments?.getString("message")
    }



}