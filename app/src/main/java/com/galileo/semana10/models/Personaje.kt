package com.galileo.semana10.models

data class Personaje(
    val id: Int,
    val name: String,
    val gender: String,
    val status: String,
    val species: String,
    val createdAt: String,
    val image: String
)

data class PersonajeResponse(
    val items: List<Personaje>
)
