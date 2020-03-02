package com.example.motionlayoutplayground

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*


class MainAdapter(private val context: Context, private val arrayList: ArrayList<String>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    lateinit var itemClickListener: ItemClickListener

    inner class ViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var tvContent: TextView? = itemView.tvContent

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            v?.apply {
                itemClickListener.onItemClick(v,adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val content = arrayList[position]
        holder.tvContent?.text = content

    }

    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }
}