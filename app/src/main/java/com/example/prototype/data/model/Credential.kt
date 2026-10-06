package com.example.prototype.data.model

data class Credential(val username: String, val password: String){
    companion object{
        val Admin = Credential(username = "BLU3 0N1", password = "1234")
    }
}