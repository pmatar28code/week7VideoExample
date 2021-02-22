package com.example.aboutme.Repository

import com.example.aboutme.Model.HobbiesModel

object HobbiesRepository {
    private val hobbies = mutableListOf<HobbiesModel>(
            HobbiesModel("Programming")
    )

    fun getHobbies() = hobbies

    fun addHobbie(text:String) {
        var  newHobbie = HobbiesModel(text)
        var hobbieList = getHobbies()
        hobbieList.add(newHobbie)
    }
}