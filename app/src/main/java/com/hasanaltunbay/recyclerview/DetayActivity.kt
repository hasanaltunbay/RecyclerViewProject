package com.hasanaltunbay.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanaltunbay.recyclerview.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDetayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=getIntent()

        val secilenHayvan=intent.getSerializableExtra("hayvan") as Hayvanlar

        binding.toolbar2.title="Hayvan Özellikleri"

        binding.hayvanIsmi.text=secilenHayvan.hayvanIsmi
        binding.isim.text="Adı: "+secilenHayvan.isim
        binding.yas.text=secilenHayvan.yas.toString()+" yaşında"
        binding.imageView.setImageResource(secilenHayvan.resim)



    }
}