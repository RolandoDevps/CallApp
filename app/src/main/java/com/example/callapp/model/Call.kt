package com.example.callapp.model

import java.util.*

class Call {

    private var mImageTitle: Int
    private var mName: String
    private var mDuration: Int
    private var mDate: Date

    constructor(name: String, imageTitle: Int, duration: Int, date: Date){
        this.mName = name
        this.mDate = date
        this.mDuration = duration
        this.mImageTitle = imageTitle
    }

    public fun setName(name: String){
        this.mName = name
    }
    public fun getName(): String{
        return this.mName
    }

    public fun setImageTitle(imageTitle: Int){
        this.mImageTitle = imageTitle
    }
    public fun getImageTitle(): Int{
        return this.mImageTitle
    }

    public fun setDuration(duration: Int){
        this.mDuration = duration
    }
    public fun getDuration(): Int{
        return this.mDuration
    }

    public fun setDate(date: Date){
        this.mDate = date
    }
    public fun getDate(): Date{
        return this.mDate
    }
}