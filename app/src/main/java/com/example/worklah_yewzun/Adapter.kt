package com.example.worklah_yewzun

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val context: Context,
              private val job: List<JobData>):RecyclerView.Adapter<Adapter.myViewHolder>(){

    class myViewHolder(private val view: View) :RecyclerView.ViewHolder(view){

        var jobTitle: TextView = view.findViewById(R.id.first_job)
        var jobPrice: TextView = view.findViewById(R.id.first_job_price)
        var jobDescription: TextView = view.findViewById(R.id.first_job_description)
        var jobLocation: TextView = view.findViewById(R.id.job_location)
        var jobTime: TextView = view.findViewById(R.id.job_time)
        var jobOverview: TextView = view.findViewById(R.id.job_view)
        var jobImg: ImageView = view.findViewById(R.id.first_job_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return myViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val item = job[position]
        holder.jobTitle.text = context.resources.getString(item.jobTitle)
        holder.jobPrice.text = context.resources.getString(item.jobPrice)
        holder.jobDescription.text = context.resources.getString(item.jobDescription)
        holder.jobLocation.text = context.resources.getString(item.jobLocation)
        holder.jobTime.text = context.resources.getString(item.jobTime)
        holder.jobOverview.text = context.resources.getString(item.jobOverview)
        holder.jobImg.setImageResource(item.jobImg)

    }

    override fun getItemCount(): Int {
        return job.size
    }
}

