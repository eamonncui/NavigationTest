package com.example.navigationtest.model

import java.io.Serializable

/**
 * NavigationTest
 *
 * @author Eamonn.Cui
 * Created by Eamonn.Cui on 2019/05/17.
 */

class Person : Serializable{
    var name: String
    var age: String

    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }
}