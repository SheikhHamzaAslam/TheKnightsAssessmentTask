package com.hamza.theknightsassessmenttask.inheritance

class InheritanceTesting {

    //Android allow multiple inheritance only in case of interfaces.

    interface SUV {
        fun kia()
    }
    interface Sedan {
        fun honda()
    }
    interface Hatchback {
        fun suzuki()
    }

    class AutoMobile : SUV, Sedan, Hatchback {
        override fun kia() {
            TODO("Not yet implemented")
        }

        override fun honda() {
            TODO("Not yet implemented")
        }

        override fun suzuki() {
            TODO("Not yet implemented")
        }

    }

    interface Vehicles : SUV, Sedan, Hatchback {
        fun vehicle()
    }

    class Auto : Vehicles {
        override fun vehicle() {
            TODO("Not yet implemented")
        }

        override fun kia() {
            TODO("Not yet implemented")
        }

        override fun honda() {
            TODO("Not yet implemented")
        }

        override fun suzuki() {
            TODO("Not yet implemented")
        }

    }
}