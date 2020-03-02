package com.example.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainAdapter.ItemClickListener {

    private var arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        setupRecycleView()
    }

    private fun initData() {
        arrayList.add("上下移動")
        arrayList.add("2")
    }

    private fun setupRecycleView() {
        rcvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = MainAdapter(this, arrayList)
        adapter.itemClickListener = this
        rcvMain.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        println("=========================$position")
    }
}
