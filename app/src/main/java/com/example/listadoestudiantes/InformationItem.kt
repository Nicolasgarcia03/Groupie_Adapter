package com.example.listadoestudiantes

import com.example.listadoestudiantes.databinding.ItemInformationBinding
import com.xwray.groupie.databinding.BindableItem

class InformationItem(val name: String, val surname: String, val age: String,val phone: String): BindableItem<ItemInformationBinding>() {
    override fun getLayout(): Int {
        return R.layout.item_information
    }

    override fun bind(viewBinding: ItemInformationBinding, position: Int) {
        viewBinding.nameStudentInfo.text = name
        viewBinding.surnameStudentInfo.text = surname
        viewBinding.ageStudentInfo.text = age
        viewBinding.phoneStudentInfo.text = phone
    }
}