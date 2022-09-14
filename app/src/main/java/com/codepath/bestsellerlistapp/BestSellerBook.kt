package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    //TODO bookImageUrl
    @SerializedName("book_image")
    var bookImageUrl: String? = null // its maybe a String so we put ? and assign it to null


    //TODO description
    @SerializedName("description")
    var description: String? = null

    //TODO-STRETCH-GOALS amazonUrl
    //TODO this @serializedName "amazon_product_url" and create a variable and assign
}