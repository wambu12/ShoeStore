package com.udacity.shoestore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListingViewModel:ViewModel(){



    //var ShoeList:MutableList<String> = mutableListOf()



    val ShoeList =MutableLiveData<MutableList<String>>()
}