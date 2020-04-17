package com.example.motionlayoutplayground

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object FragmentUtil {

}

fun AppCompatActivity.replaceFragment(@IdRes containerId: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(containerId, fragment, fragment.javaClass.simpleName)
        .commit()
}