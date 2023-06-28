package com.hasanaltunbay.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hasanaltunbay.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var hayvanListe:ArrayList<Hayvanlar>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        hayvanListe=ArrayList<Hayvanlar>()


        val case=Hayvanlar("Türü: Köpek","Case",4,R.drawable.kopek)
        val hircin=Hayvanlar("Türü: Aslan","Hırçın",8,R.drawable.aslan)
        val ruzgar=Hayvanlar("Türü: At","Rüzgar",6,R.drawable.at)
        val ekim=Hayvanlar("Türü: Kedi","Ekim",3,R.drawable.kedi)
        val jelly=Hayvanlar("Türü: Martı","Jelly",5,R.drawable.marti)
        val sivan=Hayvanlar("Türü: Papağan","Şivan",15,R.drawable.papagan)

        hayvanListe.add(case)
        hayvanListe.add(hircin)
        hayvanListe.add(ruzgar)
        hayvanListe.add(ekim)
        hayvanListe.add(jelly)
        hayvanListe.add(sivan)

        binding.toolbar.title="HAYVANLAR"

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=Adapter(hayvanListe)
        binding.recyclerView.adapter=adapter
    }
}