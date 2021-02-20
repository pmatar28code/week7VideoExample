package com.example.aboutme.Repository

import com.example.aboutme.Model.HobbiesModel

object HobbiesRepository{
    private val hobbies = listOf(
            HobbiesModel("Programming")
    )


fun getHobbies()= hobbies
}