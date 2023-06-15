package com.example.navigationcompenent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcompenent.databinding.ActivityMainBinding
import com.example.navigationcompenent.databinding.FragmentOyunEkraniBinding



class OyunEkraniFragment : Fragment() {


    lateinit var binding:FragmentOyunEkraniBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentOyunEkraniBinding.inflate(layoutInflater)
      // val tasarim=inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)
        val bundle:OyunEkraniFragmentArgs by navArgs()
        val gelenAd=bundle.isim
        val gelenYas=bundle.yas
        val gelenBoy=bundle.boy
        val gelenBekarMi=bundle.bekarMi
        Log.e("gelen ad:",gelenAd)
        Log.e("gelen yas:",gelenYas.toString())
        Log.e("gelen boy:",gelenBoy.toString())
        Log.e("gelen bekarmi:",gelenBekarMi.toString())

        binding.buttonBitir.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)
        }
        return binding.root

    }


}