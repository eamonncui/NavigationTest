package com.example.navigationtest.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.example.navigationtest.R
import kotlinx.android.synthetic.main.fragment_pass_data.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private const val DATA_STRING = "data from PassDataFragment"

/**
 * A simple [Fragment] subclass.
 * Use the [PassDataFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class PassDataFragment : androidx.fragment.app.Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pass_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_passData_bundle.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_passDataFragment_to_receiveDataFragment
                    , bundleOf(ARG_PARAM1 to DATA_STRING))
        }

        btn_passData_safeArg.setOnClickListener { Navigation.findNavController(view).navigate(PassDataFragmentDirections.actionPassDataFragmentToReceiveDataFragment(DATA_STRING)) }

        btn_passData_safeArg_defaultValue.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_passDataFragment_to_receiveDataFragment
            )
        }
        super.onViewCreated(view, savedInstanceState)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PassDataFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                PassDataFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
