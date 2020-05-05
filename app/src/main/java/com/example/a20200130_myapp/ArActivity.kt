package com.example.a20200130_myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class ArActivity : AppCompatActivity() {

    lateinit var rv_ar: RecyclerView
    lateinit var arAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar_main)

        supportActionBar?.hide()


        rv_ar = findViewById((R.id.rv_ar))
        arAdapter = GroupAdapter()

        rv_ar.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        for (i in 1..10) {
            arAdapter.add(
                ArItem(R.drawable.objet_1, R.drawable.ic_check_box_outline_blank_black_24dp)
            )
            arAdapter.add(
                ArItem(R.drawable.objet_2, R.drawable.ic_check_box_black_24dp)
            )
            arAdapter.add(
                ArItem(R.drawable.objet_3, R.drawable.ic_check_box_outline_blank_black_24dp)
            )
        }
        rv_ar.adapter = arAdapter
    }
}