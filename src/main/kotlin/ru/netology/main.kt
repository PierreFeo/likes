package ru.netology

fun main() {
    val likes = 1
    val ending: String = if (likes % 10 == 1 && likes % 100 != 11 && likes != 11 || likes == 1) "человеку" else "людям"
    println("Понравилось $likes $ending")
}