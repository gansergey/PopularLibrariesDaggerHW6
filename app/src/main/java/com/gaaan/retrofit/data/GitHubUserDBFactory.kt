package com.gaaan.retrofit.data

import androidx.room.Room
import com.gaaan.retrofit.application.App

object GitHubUserDBFactory {

    private val database: GitHubUserDB by lazy {
        Room.databaseBuilder(App.ContextHolder.context, GitHubUserDB::class.java, "github_users.db")
            .build()
    }

    fun create(): GitHubUserDB = database
}