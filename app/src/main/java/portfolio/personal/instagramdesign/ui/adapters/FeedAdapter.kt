package com.example.instagram.ui.adapters

import android.content.Context
import android.net.Uri
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.ic_item_feed.view.*
import portfolio.personal.instagramdesign.R

class FeedAdapter(val context: Context): RecyclerView.Adapter<FeedAdapter.FeedViewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FeedViewHolder {

        return  FeedViewHolder(LayoutInflater.from(context).inflate(R.layout.ic_item_feed,p0,false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(p0: FeedViewHolder, p1: Int) {
        if(p1==0)
        {
            p0.itemView.rviewStory.visibility = View.VISIBLE
            p0.itemView.rviewStory.adapter = StoryAdapter(context)
            p0.itemView.rviewStory.layoutManager = LinearLayoutManager(context, LinearLayout.HORIZONTAL,false)
        }
        else
        {
            p0.itemView.rviewStory.visibility = View.GONE
        }
        p0.bind(p1)
    }
    override fun getItemViewType(position: Int): Int {
        when (position) {
            0-> return 0
        }
        return 1
    }
    class  FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
         var mImageFeedView : ImageView
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
            mImageFeedView = itemView.findViewById(R.id.imageviewFeedMain)
        }

        fun bind(pos: Int) {
            Picasso.get().load(Uri.parse(list.get(pos))).placeholder(R.drawable.ic_feed_one).into((mImageFeedView))
        }

    }

}