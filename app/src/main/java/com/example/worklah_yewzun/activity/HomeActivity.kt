package com.example.worklah_yewzun.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.worklah_yewzun.data.JobData
import com.example.worklah_yewzun.R
import com.example.worklah_yewzun.adapter.HomeAdapter
import kotlin.collections.ArrayList

class HomeActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<JobData>
    lateinit var jobT : Array<String>
    lateinit var jobP : Array<String>
    lateinit var jobD : Array<String>
    lateinit var jobL : Array<String>
    lateinit var jobTI : Array<String>
    lateinit var jobO : Array<String>
    lateinit var jobImg : Array<Int>
    lateinit var description : Array<String>
    lateinit var requirement : Array<String>
    lateinit var requirementInfo : Array<String>
    lateinit var locationAndTime : Array<String>
    lateinit var posterName : Array<String>

    private lateinit var tempArrayList : ArrayList<JobData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        jobImg = arrayOf(
            R.drawable.job1,
            R.drawable.job2,
            R.drawable.job3,
            R.drawable.job4
        )
        jobT = arrayOf(
            "Freelance Contract IT",
            "Freelance Video Editor",
            "Pickers and Packers",
            "Event helper"
        )

        jobP = arrayOf(
            "RM2,500",
            "RM195",
            "RM96",
            "RM120"
        )

        jobD = arrayOf(
            "Work with IT related project",
            "Edit videos and add effects/elements",
            "Helping to do warehousing work",
            "Execution of various programmes and events"
        )

        jobL = arrayOf(
            "A 17 Jln 21/11B Seksyen 21 Petaling Jaya",
            "8th Floor Kompleks Jln Sultan",
            "Jalan Pasir Merah, New Pasir Puteh, 31650",
            "1st Floor, Bangunan IBEX, Jalan 222"
        )

        jobTI = arrayOf(
            "12 Feb - 12 Mac, 10.00am - 3.00pm",
            "15 Feb - 17 Mac, 1.00pm - 5.00pm",
            "20 Feb, 10.00am - 6.00pm",
            "1 April, 8.00am - 8.00pm"
        )

        jobO = arrayOf(
            "1 month shift | RM16/hour",
            "3 Shift | RM13/hour",
            "1 Shift | RM12/hour",
            "1 Shift | RM10/hour"
        )

        description = arrayOf(
            getString(R.string.job_description_text_1),
            getString(R.string.job_description_text_2),
            getString(R.string.job_description_text_3),
            getString(R.string.job_description_text_4)
        )

        requirement = arrayOf(
            getString(R.string.requirement_text_1),
            getString(R.string.requirement_text_2),
            getString(R.string.requirement_text_3),
            getString(R.string.requirement_text_4)
        )

        requirementInfo = arrayOf(
            getString(R.string.requirement1),
            getString(R.string.requirement2),
            getString(R.string.requirement3),
            getString(R.string.requirement4)
        )

        locationAndTime = arrayOf(
            getString(R.string.location_and_time_text_1),
            getString(R.string.location_and_time_text_2),
            getString(R.string.location_and_time_text_3),
            getString(R.string.location_and_time_text_4),
        )

        posterName = arrayOf(
            getString(R.string.poster_name_1),
            getString(R.string.poster_name_2),
            getString(R.string.poster_name_3),
            getString(R.string.poster_name_4),
        )

        newRecyclerView = findViewById(R.id.my_recycler)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<JobData>()
        tempArrayList = arrayListOf<JobData>()
        getUserdata()


    }


    private fun getUserdata() {
        for(i in jobImg.indices){
            val jobs = JobData(jobImg[i],jobT[i],jobP[i],jobD[i],jobL[i],jobTI[i],jobO[i])
            newArrayList.add(jobs)
        }


        var adapter = HomeAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : HomeAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                //Toast.makeText(this@MainActivity,"You Clicked on item no. $position",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@HomeActivity, DetailActivity::class.java)
                intent.putExtra("jobT",newArrayList[position].jobTitle)
                intent.putExtra("jobP",newArrayList[position].jobPrice)
                intent.putExtra("jobD",newArrayList[position].jobDescription)
                intent.putExtra("jobL",newArrayList[position].jobLocation)
                intent.putExtra("jobTI",newArrayList[position].jobTime)
                intent.putExtra("description",description[position])
                intent.putExtra("requirement",requirement[position])
                intent.putExtra("requirementInfo",requirementInfo[position])
                intent.putExtra("locationAndTime",locationAndTime[position])
                intent.putExtra("posterName",posterName[position])
                startActivity(intent)
            }

        })
    }

}

