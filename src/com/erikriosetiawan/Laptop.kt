package com.erikriosetiawan

class Laptop(builder: Builder) {

    private val processor: String = builder.processor
    private val ram: String = builder.ram
    private val battery: String = builder.battery
    private val screenSize: String = builder.screenSize

    // Builder class
    class Builder(processor: String) {

        // This is necessary
        var processor: String = processor

        // Optional features
        var ram: String = "8 GB"
        var battery: String = "5000 MAH"
        var screenSize: String = "15 inch"

        fun setRam(ram: String): Builder {
            this.ram = ram
            return this
        }

        fun setBattery(battery: String): Builder {
            this.battery = battery
            return this
        }

        fun setScreenSize(screenSize: String): Builder {
            this.screenSize = screenSize
            return this
        }

        fun create(): Laptop {
            return Laptop(this)
        }
    }
}