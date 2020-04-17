package com.example.motionlayoutplayground

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var arrayList = ArrayList<DemoData>()

    init {
        arrayList.add(DemoData("左右滑動", R.layout.motion_basic))
        arrayList.add(DemoData("2", R.layout.motion_basic))
    }

}
