package com.triare.idp_3d.ext

import android.util.Log

fun String.logInfoActivity() {
    Log.i("Activity Lifecycle: ", this)
}

fun String.logInfoAFragment() {
    Log.i("Fragment Lifecycle: ", this)
}