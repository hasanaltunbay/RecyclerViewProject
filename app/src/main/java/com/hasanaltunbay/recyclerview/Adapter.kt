package com.hasanaltunbay.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasanaltunbay.recyclerview.databinding.RecyclerRowBinding

class Adapter(val hayvanlarList:ArrayList<Hayvanlar>):RecyclerView.Adapter<Adapter.HayvanlarTutucu>() {

    class HayvanlarTutucu(val binding:RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HayvanlarTutucu {

        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HayvanlarTutucu(binding)
    }

    override fun getItemCount(): Int {
       return hayvanlarList.size
    }

    override fun onBindViewHolder(holder: HayvanlarTutucu, position: Int) {

        holder.binding.recyclerViewText.text=hayvanlarList.get(position).isim

        holder.itemView.setOnClickListener {

            val intent=Intent(holder.itemView.context,DetayActivity::class.java)
            intent.putExtra("hayvan",hayvanlarList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}