package oop

import kotlin.properties.Delegates

class NilaiMahasiswa{
    var nilai : Float by Delegates.vetoable(initialValue = 0.0f){
            property, oldValue, newValue ->
        if(newValue > 0.0f && newValue <= 100f){
            true
        }else{
            println("invalid input")
            false
        }
    }
}