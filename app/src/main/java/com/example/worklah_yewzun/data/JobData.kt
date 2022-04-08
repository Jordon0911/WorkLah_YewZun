package com.example.worklah_yewzun.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class JobData(
     val jobImg: Int,
     val jobTitle:String? = null,
     val jobPrice:String? = null,
     val jobDescription:String? = null,
     val jobLocation:String? = null,
     val jobTime:String? = null,
     val jobOverview:String? = null
    )
