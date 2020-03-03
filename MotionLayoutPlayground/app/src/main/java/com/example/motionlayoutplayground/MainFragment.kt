package com.example.motionlayoutplayground

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    private var arrayList = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initData()
        setupRecycleView()
    }

    private fun initData() {
        arrayList.add("上下移動")
        arrayList.add("2")
    }

    private fun setupRecycleView() {
        context?.let { ctx ->
            rcvMain.layoutManager = LinearLayoutManager(ctx, LinearLayoutManager.VERTICAL, false)
            rcvMain.addItemDecoration(DividerItemDecoration(ctx, DividerItemDecoration.VERTICAL))

            val adapter = MainAdapter(ctx, arrayList)
            adapter.itemClickListener = ItemClickEvent()
            rcvMain.adapter = adapter
        }
    }
}


class ItemClickEvent : MainAdapter.ItemClickListener {
    override fun onItemClick(view: View, position: Int) {
        println("=========================$position")
    }
}
