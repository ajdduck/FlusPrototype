package com.example.a20200130_myapp

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.activity_review_item.view.*

class ReviewItem(val name: String, val createdAt: String, val imageSrc: Int, val iconSrc: Int) :
    Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.tv_name.text = name
        viewHolder.itemView.tv_time.text = createdAt

        viewHolder.itemView.iv_icon.setImageResource(iconSrc)
        viewHolder.itemView.iv_main.setImageResource(imageSrc)
    }

    override fun getLayout(): Int {
        return R.layout.activity_review_item
    }
}