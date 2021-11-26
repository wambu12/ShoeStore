package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentShoeListingBinding
import kotlinx.android.synthetic.main.fragment_shoe_detail.*



class ShoeListingFragment : Fragment() {
    // TODO: Rename and change types of parameters





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_shoe_listing, container, false)


        val args=  ShoeListingFragmentArgs.fromBundle(arguments!!)
        var text=args.description


        Toast.makeText(context, "Description: ${text}, ", Toast.LENGTH_LONG).show()

        val binding: FragmentShoeListingBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_listing, container, false)



        binding.floatingActionButton.setOnClickListener { view: View ->
            view.findNavController().navigate(ShoeListingFragmentDirections.actionShoeListingFragmentToShoeDetailFragment())
            //view.findNavController().navigate(R.id.action_shoeListingFragment_to_shoeDetailFragment)
        }

       // val text:String?=args.description




        return binding.root
    }



    }
