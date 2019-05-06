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
import kotlinx.android.synthetic.main.list_item_list_view.view.*
import portfolio.personal.instagramdesign.R

class PListAdapter(val context: Context): RecyclerView.Adapter<PListAdapter.PListViewHolder>()
{

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PListAdapter.PListViewHolder {
        return PListViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_list_view,p0,false))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(p0: PListViewHolder, p1: Int) {
        p0.bind(p1)
    }


    class  PListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var mImageGridView: ImageView? = null
        val list = arrayListOf(
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
            mImageGridView = itemView.findViewById(R.id.imageviewExploreGrid)
        }

        fun bind(pos: Int) {
            Log.e("TAG","BIND METHOD FROM PLIST")
            Picasso.get().load(Uri.parse(list.get(pos))).placeholder(R.drawable.ic_male).into((mImageGridView))
        }

    }
}