package com.galileo.semana10.network

import com.galileo.semana10.models.PersonajeResponse
import retrofit2.Call
import retrofit2.http.GET

interface PersonajeService {
    @GET("characters")
    fun getCharacters(): Call<PersonajeResponse>
}
