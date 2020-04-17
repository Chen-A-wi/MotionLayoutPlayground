package com.example.motionlayoutplayground

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.main_fragment.*


class MainFragment : Fragment() {


    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        setupRecycleView()
    }

    private fun setupRecycleView() {
        rcvMain.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rcvMain.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

//        val adapter = MainAdapter(this@MainFragment.context, viewModel.arrayList)
//        adapter.itemClickListener = this
//        rcvMain.adapter = adapter
    }

//    override fun onItemClick(view: View, position: Int) {
//        val intent = Intent(this, DemoActivity::class.java).apply {
//            putExtra("layout_file_id", arrayList[position].layoutId)
//        }
//        startActivity(intent)
//    }

}
