package sampleproject.com.my.skeletonApp.core

import sampleproject.com.my.skeletonApp.feature.login.GetDataActivity


class Router {
    enum class Destination {
        LOGIN
    }

    companion object {
        fun getClass(destination: Destination): Class<*> {
            return when (destination) {
                Destination.LOGIN -> GetDataActivity::class.java
                else -> {
                    TODO("Implement Default case")
                }
            }
        }
    }
}