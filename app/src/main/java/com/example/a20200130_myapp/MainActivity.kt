package com.example.a20200130_myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var rv_lower: RecyclerView
    lateinit var lowerAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        button2.setOnClickListener {
            val next = Intent(this, ArActivity::class.java)
            startActivity(next)
        }

        rv_lower = findViewById((R.id.rv_lower))
        lowerAdapter = GroupAdapter()

        rv_lower.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        for (i in 1..10) {
            lowerAdapter.add(
                ReviewItem(
                    "Heobok2",
                    "30 minutes ago",
                    R.drawable.interior_1,
                    R.drawable.person_1
                )
            )
            lowerAdapter.add(
                ReviewItem(
                    "Jdduck_a",
                    "2 hours ago",
                    R.drawable.interior_2,
                    R.drawable.person_1
                )
            )

        }

        rv_lower.adapter = lowerAdapter
    }
}
