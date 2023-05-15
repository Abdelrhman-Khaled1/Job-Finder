package com.example.cplproject


data class Job( var publisher : String ,
                var position: String ="",
                var jobType :String = "",
                var jobDescription  : String = "",
                var location : String = "",
                var forDisabledPeople : Boolean = false // true for disable people and false for normal people
                )
