package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentShoeListingBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ShoeListingFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)



            viewModel.ShoeList.observe(this, Observer { newShoeList->
                UPdateShoeList(newShoeList)
            })
        }
    }

    private fun UPdateShoeList(newShoeList: MutableList<String>?) {

    }

    private lateinit var viewModel:ShoeListingViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_shoe_listing, container, false)


        viewModel = ViewModelProvider(this).get(ShoeListingViewModel::class.java)


        val binding: FragmentShoeListingBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_listing, container, false)



        binding.floatingActionButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_shoeListingFragment_to_shoeDetailFragment)
        }




        return binding.root
    }



    }
