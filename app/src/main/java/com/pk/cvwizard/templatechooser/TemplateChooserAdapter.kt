package com.pk.cvwizard.templatechooser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.pk.cvwizard.R
import kotlinx.android.synthetic.main.template_chooser_item.view.*

class TemplateChooserAdapter(
    private val resDataset: ArrayList<Int>
):
RecyclerView.Adapter<TemplateChooserAdapter.TemplateItem>()
{


    class TemplateItem (val cardItem:CardView ): RecyclerView.ViewHolder(cardItem){
        var imageView = cardItem.template_image!!
    }

    private lateinit var mClickListener: ClickListener

    fun setOnItemClickListener(aClickListener: ClickListener) {
        mClickListener = aClickListener
    }

    interface ClickListener {
        fun onClick(pos: Int, aView: View)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemplateItem {
        val cardItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.template_chooser_item,parent,false) as CardView

        return TemplateItem(cardItem)
    }

    override fun getItemCount(): Int {
       return resDataset.size

    }

    override fun onBindViewHolder(holder: TemplateItem, position: Int) {
        holder.imageView.setImageResource(resDataset[position])
        holder.imageView.setOnClickListener {
            mClickListener.onClick(position,it)
        }
    }



}