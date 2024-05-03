package com.galileo.semana10.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miempresa.semana10.R
import com.miempresa.semana10.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuBinding.inflate(inflater, container, false)
        binding.btnVerListado.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_listadoFragment)
        }
        return binding.root
    }

}