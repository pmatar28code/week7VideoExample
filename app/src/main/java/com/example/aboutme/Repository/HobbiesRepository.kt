package com.example.aboutme.Repository

import com.example.aboutme.Model.HobbiesModel

object HobbiesRepository {
    private val hobbies = mutableListOf(
            HobbiesModel("Programming")
    )

    fun getHobbies() = hobbies

    fun addHobbie(text:String) {
        val newHobbie = HobbiesModel(text)
        val hobbieList = getHobbies()
        hobbieList.add(newHobbie)
    }
}