package com.example.prototype.data.model.repository

import com.example.prototype.data.model.Credential

class AuthRepository (
    private val validCredential: Credential = Credential.Admin
){
    fun login(username: String,password: String): Boolean{
        return username == validCredential.username && password == validCredential.password
    }
}