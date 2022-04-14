package com.example.callapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.callapp.model.Call
import java.util.*

/**
 * A fragment representing a list of Items.
 */
class CallFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.call_fragment_item_list, container, false)

        /*recyclerView = view.findViewById(R.id.lisCall)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)

        //initData();
        recyclerView.adapter = MycallRecyclerViewAdapter(defaultCall())*/

        //Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MycallRecyclerViewAdapter(defaultCall())
            }
        }
        return view
    }

    private fun defaultCall(): ArrayList<Call>{
        val call1 = Call(
            "Roland KUATE 1",
            R.mipmap.avatar_foreground,
            1,
            Date()
        )
        val call2 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            2,
            Date()
        )
        val call3 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            3,
            Date()
        )
        val call4 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call5 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call6 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call7 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call8 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call9 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        val call10 = Call(
            "Roland KUATE 2",
            R.mipmap.avatar_foreground,
            4,
            Date()
        )
        return ArrayList(listOf(call1, call2, call3, call4, call5, call6, call7, call8, call9, call10))
    }
}