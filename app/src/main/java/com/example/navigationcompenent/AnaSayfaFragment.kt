package com.example.navigationcompenent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcompenent.databinding.FragmentAnaSayfaBinding
import com.example.navigationcompenent.databinding.FragmentOyunEkraniBinding


class AnaSayfaFragment : Fragment(R.layout.fragment_ana_sayfa) {
    lateinit var binding:FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val tasarim=inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
        binding = FragmentAnaSayfaBinding.inflate(layoutInflater)

        binding.buttonBasla.setOnClickListener {
            val gecis=AnaSayfaFragmentDirections.oyunEkraninaGecis("ahmet",1.80f,18,false)

            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }


}