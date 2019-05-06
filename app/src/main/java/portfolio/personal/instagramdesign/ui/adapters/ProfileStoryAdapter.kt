package com.example.instagram.ui.adapters

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.ic_item_profile_story.view.*
import portfolio.personal.instagramdesign.R

class ProfileStoryAdapter(val context: Context): RecyclerView.Adapter<ProfileStoryAdapter.ProfileStoryViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProfileStoryViewHolder {

        return  ProfileStoryViewHolder(LayoutInflater.from(context).inflate(R.layout.ic_item_profile_story,p0,false))
    }

    override fun getItemCount(): Int {
        Log.e("TAG","Getcount")
        return 6
    }

    override fun onBindViewHolder(p0: ProfileStoryViewHolder, p1: Int) {
        p0.bind(p1)
    }
    class  ProfileStoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var mImageStoryView : ImageView
        private  val list = arrayListOf(
            "https://picsum.photos/id/10/400/400",
            "https://picsum.photos/id/1011/400/400",
            "https://picsum.photos/id/1010/400/400",
            "https://picsum.photos/id/1026/400/400",
            "https://picsum.photos/id/1035/400/400",
            "https://picsum.photos/id/1067/400/400",
            "https://picsum.photos/id/1056/400/400",
            "https://picsum.photos/id/1023/400/400",
            "https://picsum.photos/id/1022/400/400",
            "https://picsum.photos/id/1076/400/400",
            "https://picsum.photos/id/1080/400/400",
            "https://picsum.photos/id/1081/400/400",
            "https://picsum.photos/id/1082/400/400",
            "https://picsum.photos/id/1083/400/400",
            "https://picsum.photos/id/1084/400/400",
            "https://picsum.photos/id/1087/400/400",
            "https://picsum.photos/id/1089/400/400",
            "https://picsum.photos/id/1095/400/400",
            "https://picsum.photos/id/1015/400/400",
            "https://picsum.photos/id/1025/400/400",
            "https://picsum.photos/id/1024/400/400",
            "https://picsum.photos/id/1021/400/400",
            "https://picsum.photos/id/1022/400/400",
            "https://picsum.photos/id/1023/400/400",
            "https://picsum.photos/id/1020/400/400",
            "https://picsum.photos/id/1067/400/400"
        )
        init {
            mImageStoryView = itemView.findViewById(R.id.imageViewProfileStory)
        }

        fun bind(pos: Int) {
            Picasso.get().load(Uri.parse(list.get(pos))).placeholder(R.drawable.ic_male).into((mImageStoryView))
        }
    }
}