package com.example.a20200130_myapp

import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.activity_ar_item.view.*

class ArItem(val vaseSrc: Int, val checkSrc : Int) :
    Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.iv_vase.setImageResource(vaseSrc)
        viewHolder.itemView.iv_check.setImageResource(checkSrc)
    }

    override fun getLayout(): Int {
        return R.layout.activity_ar_item
    }
}