package com.example.listadoestudiantes

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.listadoestudiantes.databinding.ItemStudentBinding
import com.xwray.groupie.ExpandableGroup
import com.xwray.groupie.ExpandableItem
import com.xwray.groupie.databinding.BindableItem

class StudentItem(val name: String): BindableItem<ItemStudentBinding>(), ExpandableItem{

    lateinit var myExpandableGroup: ExpandableGroup

    override fun getLayout(): Int {
        return R.layout.item_student
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun bind(viewBinding: ItemStudentBinding, position: Int) {
        viewBinding.nameStudent.text = name
        viewBinding.toggleButton.setOnClickListener {
            myExpandableGroup.onToggleExpanded()
            if(myExpandableGroup.isExpanded) {
                viewBinding.toggleButton.text = "Ocultar"
                viewBinding.root.setBackgroundColor(viewBinding.root.context.getColor(R.color.purple_200))
            } else {
                viewBinding.toggleButton.text = "Desplegar"
                viewBinding.root.setBackgroundColor(viewBinding.root.context.getColor(R.color.purple_700))
            }
        }
    }

    override fun setExpandableGroup(onToggleListener: ExpandableGroup) {
        this.myExpandableGroup = onToggleListener
    }


}