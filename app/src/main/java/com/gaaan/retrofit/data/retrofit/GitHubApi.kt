package com.gaaan.retrofit.data.retrofit

import com.gaaan.retrofit.data.GitHubUser
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApi {
    @GET("/users")
    fun fetchUsers(): Single<List<GitHubUser>>
    @GET("/users/{login}")
    fun fetchUserDataByLogin(@Path("login") login: String): Single<GitHubUser>
}