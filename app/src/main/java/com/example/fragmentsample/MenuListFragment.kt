package com.example.fragmentsample

import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.fragment.app.Fragment

class MenuListFragment : Fragment(R.layout.fragment_menu_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lvMenu = view.findViewById<ListView>(R.id.lvMenu)
        val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

        var menu = mutableMapOf("name" to "唐揚げ定食", "price" to "800円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "ハンバーグ定食", "price" to "850円")
        menuList.add(menu)

        val from = arrayOf("name", "price")
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)
        val adapter =
            SimpleAdapter(activity, menuList, android.R.layout.simple_list_item_2, from, to)

        lvMenu.adapter = adapter
    }
}