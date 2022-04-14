package com.example.callapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.callapp.databinding.ContactFragmentItemBinding
import com.example.callapp.model.Contact

/**
 */
class MycontactRecyclerViewAdapter(
    private val contactList: List<Contact>,
    private val mListener: (Contact) -> Unit
) : RecyclerView.Adapter<MycontactRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ContactFragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = contactList[position]

        holder.contactImage.setImageResource(currentItem.getImageTitle())
        holder.contactName.text = currentItem.getName()


        holder.itemView.setOnClickListener {
            currentItem?.let { it1 -> mListener.invoke(it1) }
        }
    }

    override fun getItemCount(): Int = contactList.size

    inner class ViewHolder(binding: ContactFragmentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val contactImage: ImageView = binding.contactAvatar
        val contactName: TextView = binding.contactName

    }

}