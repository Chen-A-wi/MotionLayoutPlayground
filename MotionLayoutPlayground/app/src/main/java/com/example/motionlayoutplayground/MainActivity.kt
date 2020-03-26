package com.example.motionlayoutplayground

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainAdapter.ItemClickListener {
    private var arrayList = ArrayList<DemoData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        setupRecycleView()
    }

    private fun initData() {
        arrayList.add(DemoData("左右滑動", R.layout.motion_basic))
        arrayList.add(DemoData("2", R.layout.motion_basic))
    }

    private fun setupRecycleView() {
        rcvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcvMain.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val adapter = MainAdapter(this, arrayList)
        adapter.itemClickListener = this
        rcvMain.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        val intent = Intent(this, DemoActivity::class.java).apply {
            putExtra("layout_file_id", arrayList[position].layoutId)
        }
        startActivity(intent)
    }
}