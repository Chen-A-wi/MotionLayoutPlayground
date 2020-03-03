package com.example.motionlayoutplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayoutplayground.utils.replaceFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(MainFragment(), R.id.frameMain)
    }

}
