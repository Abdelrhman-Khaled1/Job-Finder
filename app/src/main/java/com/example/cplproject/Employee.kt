package com.example.cplproject

import java.io.Serializable

data class Employee(var name : String = ""
                    ,var email : String = ""
                    ,var jobTitle : String = ""
                    ,var education : String = ""
                    ,var experience : String = ""
                    ,var bio : String = ""
                    ,var age : Int = 0
                    ,var gender : Boolean = true // true for man and false for woman
                    ,var disable : Boolean = false
                    ,var typeOfDisable : String = ""
                    ,var id : String = ""
                    ) :Serializable
