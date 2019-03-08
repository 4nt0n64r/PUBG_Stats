package com.example.final_project.API

import com.example.final_project.players.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIservice {


    @Headers(
        "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4MGEwZTNlMC0xZmQ3LTAxMzctMGNhNS0yMTY0MTZkZjQ2N2MiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTUxNjEzNDE1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImZpbmFsX3Byb2plY3QifQ.Pd1DbJrDFoRhoHG4lj84kNUtt2GWZqklYIYvR9POCIg",
        "Accept: application/vnd.api+json"
    )

    @GET("players/")
    fun getPlayers(@Query("filter[playerNames]") namesOfPlayer: String): Call<Data>
}