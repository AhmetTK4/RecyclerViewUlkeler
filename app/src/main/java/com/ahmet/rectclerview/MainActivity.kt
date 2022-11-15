package com.ahmet.rectclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter:RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
       rv.layoutManager = LinearLayoutManager(this)
         //   rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //rv.layoutManager = StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.HORIZONTAL)
        val u1 = Ulkeler(1,"Turkiye")
        val u2 = Ulkeler(2,"Almanya")
        val u3 = Ulkeler(3,"Italya")
        val u4 = Ulkeler(4,"Fransa")
        val u5 = Ulkeler(5,"Ingiltere")
        val u6 = Ulkeler(6,"Amerika")
        val u7 = Ulkeler(7,"Turkiye")
        val u8 = Ulkeler(8,"Almanya")
        val u9 = Ulkeler(9,"Italya")
        val u10 = Ulkeler(10,"Fransa")
        val u11 = Ulkeler(11,"Ingiltere")
        val u12 = Ulkeler(12,"Amerika")
        val u13 = Ulkeler(13,"Fransa")
        val u14 = Ulkeler(14,"Ingiltere")
        val u15 = Ulkeler(15,"Amerika")

        ulkelerList = ArrayList<Ulkeler>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)
        ulkelerList.add(u6)
        ulkelerList.add(u7)
        ulkelerList.add(u8)
        ulkelerList.add(u9)
        ulkelerList.add(u10)
        ulkelerList.add(u11)
        ulkelerList.add(u12)
        ulkelerList.add(u13)
        ulkelerList.add(u14)
        ulkelerList.add(u15)



        adapter = RVAdapter(this,ulkelerList)

        rv.adapter = adapter

    }
}