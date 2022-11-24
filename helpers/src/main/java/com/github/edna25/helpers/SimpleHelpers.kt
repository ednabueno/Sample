package com.github.edna25.helpers

import com.simple_api_module.SimpleApiCall

object SimpleHelpers {
    fun simpleHelperCall():String{
        return SimpleApiCall.sampleApiCall()
    }
}