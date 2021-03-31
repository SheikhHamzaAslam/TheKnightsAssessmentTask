package com.hamza.theknightsassessmenttask.encapsulation

class Company {
    private var person : Person = Person("Hamza", 25, 3456789, 2035)

    fun setPerson(person: Person) {
        this.person = person
    }

    fun getPerson() : Person {
        return person
    }

    fun getPersonName() : String {
        return person.name
    }

    fun getPersonAge() : Int {
        return person.age
    }

    fun getPersonCellNo() : Long {
        return person.cell_no
    }

    fun getPersonHouseNo() : Int {
        return person.house_no
    }
}