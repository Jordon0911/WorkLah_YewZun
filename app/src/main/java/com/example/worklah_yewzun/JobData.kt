package com.example.worklah_yewzun


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class JobData(
    @StringRes val jobTitle:Int,
    @StringRes val jobPrice:Int,
    @StringRes val jobDescription:Int,
    @StringRes val jobLocation:Int,
    @StringRes val jobTime:Int,
    @StringRes val jobOverview:Int,
    @DrawableRes val jobImg: Int

    )
