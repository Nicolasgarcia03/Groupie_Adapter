package com.example.listadoestudiantes

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoestudiantes.databinding.ActivityMainBinding
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.GroupieAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.countriesRecyclerView.layoutManager = LinearLayoutManager(this)

        val student1 = ExpandableGroup(StudentItem("Nicolas"))
        student1.add(InformationItem("Nicolas", "Garcia", "24", "321 321 23 34"))

        val student2 = ExpandableGroup(StudentItem("Rafael"))
        student2.add(InformationItem("Rafael", "Pereira", "30", "321 456 76 45"))

        val student3 = ExpandableGroup(StudentItem("Cesar"))
        student3.add(InformationItem("Cesar", "Canabal", "35", "312 234 65 76"))

        val adapter = GroupieAdapter()
        binding.countriesRecyclerView.adapter = adapter
        adapter.add(student1)
        adapter.add(student2)
        adapter.add(student3)
    }
}