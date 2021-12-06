package com.example.nlpc.utils

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T) = Resource(Status.SUCCESS, data, message = null)
        fun <T> error(message: String, data: T?) = Resource(Status.ERROR, data, message)
        fun <T> loading(data:T?)=Resource(Status.LOADING,data,message = null)
    }
}

enum class Status {
    SUCCESS,
    LOADING,
    ERROR

}