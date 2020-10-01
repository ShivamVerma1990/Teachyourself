package com.example.teachingapp

import android.util.Patterns

object Validation {
    fun validMobile(mobile: String): Boolean {
        return mobile.length == 10
    }

    fun validatePasswordLength(password: String): Boolean {
        return password.length >= 4
    }

}