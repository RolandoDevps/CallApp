package com.example.callapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.callapp.databinding.CallFragmentItemBinding
import com.example.callapp.model.Call

/**
 */
class MycallRecyclerViewAdapter(
    private val callList: ArrayList<Call>
) : RecyclerView.Adapter<MycallRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            CallFragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = callList[position]
        holder.titleImage.setImageResource(currentItem.getImageTitle())
        holder.callerName.text = currentItem.getName()
        holder.callSpentTime.text = currentItem.getDuration().toString()
    }

    override fun getItemCount(): Int = callList.size

    inner class ViewHolder(binding: CallFragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val titleImage: ImageView = binding.callAvatar
        val callerName: TextView = binding.callName
        val callSpentTime: TextView = binding.callSpentTime

    }

}