package com.example.worklah_yewzun.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.worklah_yewzun.data.JobData
import com.example.worklah_yewzun.R


class HomeAdapter(private val job: ArrayList<JobData>):RecyclerView.Adapter<HomeAdapter.myViewHolder>(){

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{

        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){

        mListener = listener
    }

    class myViewHolder(private val view: View, listener: onItemClickListener) :RecyclerView.ViewHolder(view){

        var jobTitle: TextView = view.findViewById(R.id.first_job)
        var jobPrice: TextView = view.findViewById(R.id.first_job_price)
        var jobDescription: TextView = view.findViewById(R.id.first_job_description)
        var jobLocation: TextView = view.findViewById(R.id.job_location)
        var jobTime: TextView = view.findViewById(R.id.job_time)
        var jobOverview: TextView = view.findViewById(R.id.job_view)
        var jobImg: ImageView = view.findViewById(R.id.first_job_image)

        init {

            view.setOnClickListener {

                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return myViewHolder(adapterLayout,mListener)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val item = job[position]

        holder.jobTitle.text = item.jobTitle
        holder.jobPrice.text = item.jobPrice
        holder.jobDescription.text = item.jobDescription
        holder.jobLocation.text = item.jobLocation
        holder.jobTime.text = item.jobTime
        holder.jobOverview.text = item.jobOverview
        holder.jobImg.setImageResource(item.jobImg)

    }

    override fun getItemCount(): Int {
        return job.size
    }
}

