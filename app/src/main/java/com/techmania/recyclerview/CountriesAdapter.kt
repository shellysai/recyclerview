package com.techmania.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var detaisList: ArrayList<String>,
    var imageList: ArrayList<Int>,
     var context: Context):RecyclerView.Adapter<CountriesAdapter.countryViewHolder>()
{

class  countryViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
{
    var textViewCountryname: TextView =itemView.findViewById(R.id.textViewCountryName)
    var textViewDetails:TextView=itemView.findViewById(R.id.textViewDetails)
    var imageView : CircleImageView = itemView.findViewById(R.id.imageView)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return countryViewHolder(view)

    }

    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {

        holder.textViewCountryname.text=countryNameList.get(position)
        holder.textViewDetails.text=detaisList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }

}