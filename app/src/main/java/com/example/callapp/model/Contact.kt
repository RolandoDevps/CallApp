package com.example.callapp.model

class Contact(name: String, imageTitle: Int, phoneNumber: Number) {

    private var mImageTitle: Int = imageTitle
    private var mName: String = name
    private var mPhoneNumber: Number = phoneNumber

    fun setName(name: String){
        this.mName = name
    }
    fun getName(): String{
        return this.mName
    }

    fun setImageTitle(imageTitle: Int){
        this.mImageTitle = imageTitle
    }
    fun getImageTitle(): Int{
        return this.mImageTitle
    }

    fun setPhoneNumber(phoneNumber: Number){
        this.mPhoneNumber = phoneNumber
    }
    fun getPhoneNumber(): Number{
        return this.mPhoneNumber
    }


}