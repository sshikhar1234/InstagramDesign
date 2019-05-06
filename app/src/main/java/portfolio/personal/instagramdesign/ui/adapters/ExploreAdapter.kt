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
import portfolio.personal.instagramdesign.R

class ExploreAdapter(val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        when(p1)
        {
            0-> return VideoViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_explore_big,p0,false))
        }
        return  ExploreViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_list_view,p0,false))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            1-> return 0
        }
        return 1
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, p1: Int) {
if(p1>0 && p1!=1)
{
    (holder as ExploreViewHolder).bind(p1)
}
    }

    class  ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

        var mImageStoryView : ImageView
        private  val list = arrayListOf(
            "https://picsum.photos/id/10/200/200",
            "https://picsum.photos/id/1011/200/200",
            "https://picsum.photos/id/1010/200/200",
            "https://picsum.photos/id/1026/200/200",
            "https://picsum.photos/id/1035/200/200",
            "https://picsum.photos/id/1067/200/200",
            "https://picsum.photos/id/1056/200/200",
            "https://picsum.photos/id/1023/200/200",
            "https://picsum.photos/id/1022/200/200",
            "https://picsum.photos/id/1076/200/200",
            "https://picsum.photos/id/1080/200/200",
            "https://picsum.photos/id/1081/200/200",
            "https://picsum.photos/id/1082/200/200",
            "https://picsum.photos/id/1083/200/200",
            "https://picsum.photos/id/1084/200/200",
            "https://picsum.photos/id/1087/200/200",
            "https://picsum.photos/id/1089/200/200",
            "https://picsum.photos/id/1095/200/200",
            "https://picsum.photos/id/1015/200/200",
            "https://picsum.photos/id/1025/200/200",
            "https://picsum.photos/id/1024/200/200",
            "https://picsum.photos/id/1021/200/200",
            "https://picsum.photos/id/1022/200/200",
            "https://picsum.photos/id/1023/200/200",
            "https://picsum.photos/id/1020/200/200",
            "https://picsum.photos/id/1067/200/200"
        )
        init {
            mImageStoryView = itemView.findViewById(R.id.imageviewExploreGrid)
        }

        fun bind(pos: Int) {
            Log.e("TAG_Two","StoryAdapter")
            Picasso.get().load(Uri.parse(list.get(pos))).placeholder(R.drawable.ic_male).into((mImageStoryView))
        }
    }
    class  VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}