package com.example.callapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.callapp.model.Contact


/**
 * A fragment representing a list of Items.
 */
class ContactFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //This is where we initialize the data. Normally this would be from a remote server

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.contact_fragment_item_list, container, false)
        var mPhoneNumber: String
        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MycontactRecyclerViewAdapter(defaultContact()) {
                    mPhoneNumber = it.getPhoneNumber().toString()
                    Log.d("Roland:clicked", mPhoneNumber)
                }
            }
        }
        return view
    }


    private fun defaultContact(): ArrayList<Contact>{
        val contact1 = Contact(
            "Roland KUATE 1",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact2 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact3 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact4 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact5 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact6 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact7 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact8 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact9 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        val contact10 = Contact(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            657784708
        )
        return ArrayList(listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10))
    }

}