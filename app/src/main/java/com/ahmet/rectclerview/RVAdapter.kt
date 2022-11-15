package com.ahmet.rectclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val mContext:Context,private val ulkelerDisaridanGelenListe:List<Ulkeler>)
    : RecyclerView.Adapter<RVAdapter.CardViewTasarimNesneleriniTutucu>()
{

        inner class CardViewTasarimNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){

            var satirCardView:CardView
            var satirYazi:TextView
            var noktaResim:ImageView

            init {
                satirCardView = view.findViewById(R.id.satirCardView)
                satirYazi = view.findViewById(R.id.satirYazi)
                noktaResim = view.findViewById(R.id.noktaResim)
            }
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewTasarimNesneleriniTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarimi,parent,false)

        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardViewTasarimNesneleriniTutucu, position: Int) {
        val ulke = ulkelerDisaridanGelenListe[position]

        holder.satirYazi.text = ulke.UlkeAdi

        holder.satirCardView.setOnClickListener{

            Toast.makeText(mContext,"Sectiğiniz ülke : ${ulke.UlkeAdi}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return ulkelerDisaridanGelenListe.size
    }
}