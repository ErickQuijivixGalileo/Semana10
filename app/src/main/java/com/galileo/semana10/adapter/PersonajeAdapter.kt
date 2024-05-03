package com.galileo.semana10.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miempresa.semana10.R
import com.miempresa.semana10.databinding.PersonajeRowLayoutBinding
import com.galileo.semana10.models.Personaje


class PersonajeAdapter(val list: ArrayList<Personaje>): RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder>() {

    class PersonajeViewHolder(val binding: PersonajeRowLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PersonajeRowLayoutBinding.inflate(inflater, parent, false)
        return PersonajeViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PersonajeViewHolder, position: Int) {
        val currentPersonaje = list[position]
        holder.binding.txtNombre.text = currentPersonaje.name
        holder.binding.txtEspecie.text = currentPersonaje.species
        holder.binding.txtStatus.text = currentPersonaje.status

        val imageResource = if (currentPersonaje.gender == "MALE") {
            R.drawable.male
        } else {
            R.drawable.fem
        }

        holder.binding.image.setImageResource(imageResource)
    }

    fun showNewData(newList :ArrayList<Personaje>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}