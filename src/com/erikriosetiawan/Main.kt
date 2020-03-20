package com.erikriosetiawan

fun main() {

    // Create a new laptop object
    val laptop = Laptop.Builder("i7")
        .setRam("16 GB")
        .setBattery("6000 MAH")
        .create()
}