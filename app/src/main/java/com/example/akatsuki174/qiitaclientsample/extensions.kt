package com.example.akatsuki174.qiitaclientsample

import android.support.annotation.IdRes
import android.view.View

fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}