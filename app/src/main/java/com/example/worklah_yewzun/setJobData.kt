package com.example.worklah_yewzun

class SetJobData {

    fun setJobs(): List<JobData> {
        return listOf<JobData>(
            JobData(
                R.string.job_title1,
                R.string.job_price1,
                R.string.job_description1,
                R.string.job_location1,
                R.string.job_time1,
                R.string.job_overview1,
                R.drawable.job1
            ),
            JobData(
                R.string.job_title2,
                R.string.job_price2,
                R.string.job_description2,
                R.string.job_location2,
                R.string.job_time2,
                R.string.job_overview2,
                R.drawable.job2
            ),
            JobData(
                R.string.job_title3,
                R.string.job_price3,
                R.string.job_description3,
                R.string.job_location3,
                R.string.job_time3,
                R.string.job_overview3,
                R.drawable.job3
            ),
            JobData(
                R.string.job_title4,
                R.string.job_price4,
                R.string.job_description4,
                R.string.job_location4,
                R.string.job_time4,
                R.string.job_overview4,
                R.drawable.job4
            )

        )
    }
}