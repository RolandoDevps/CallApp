package com.example.callapp

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import com.example.callapp.model.Contact


/**
 * A fragment representing a list of Items.
 */
class ContactFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //This is where we initialize the data. Normally this would be from a remote server

    }

    lateinit var mPhoneNumber: String
    private val MY_PERMISSION_REQUEST_CODE_CALL_PHONE = 555
    private val LOG_TAG = "Roland-CallApp"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.contact_fragment_item_list, container, false)
        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MycontactRecyclerViewAdapter(defaultContact()) {
                    mPhoneNumber = it.getPhoneNumber().toString()
                    Log.d("Roland:clicked", mPhoneNumber)
                    Log.d("Roland:Activity", activity.toString())
                    askPermissionAndCall();
                }
            }
        }
        return view
    }

    private fun askPermissionAndCall() {

        // With Android Level >= 23, you have to ask the user
        // for permission to Call.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { // 23

            // Check if we have Call permission
            val sendSmsPermisson = activity?.let {
                ActivityCompat.checkSelfPermission(
                    it.baseContext,
                    Manifest.permission.CALL_PHONE
                )
            }
            if (sendSmsPermisson != PackageManager.PERMISSION_GRANTED) {
                // If don't have permission so prompt the user.
                requestPermissions(
                    arrayOf(Manifest.permission.CALL_PHONE),
                    MY_PERMISSION_REQUEST_CODE_CALL_PHONE
                )
                return
            }
        }
        this.callNow()
    }

    @SuppressLint("MissingPermission")
    private fun callNow() {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:$mPhoneNumber")
        try {
            this.startActivity(callIntent)
        } catch (ex: Exception) {
            Toast.makeText(
                ApplicationProvider.getApplicationContext<Context>(),
                "Your call failed... " + ex.message,
                Toast.LENGTH_LONG
            ).show()
            ex.printStackTrace()
        }
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