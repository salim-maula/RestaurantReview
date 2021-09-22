package com.salim.restaurantreview

import com.google.gson.annotations.SerializedName

data class RestaurantResponse(
	@field:SerializedName("restaurant")
	val restaurant: Restaurant,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message : String
)

data class Restaurant(
	val customerReviews: List<CustomerReviewsItem>,
	val pictureId: String,
	val name: String,
	val rating: Double,
	val description: String,
	val id: String
)

data class CustomerReviewsItem(
	val date: String,
	val review: String,
	val name: String
)

data class PostReviewResponse(

	@field:SerializedName("customerReviews")
	val customerReviews: List<CustomerReviewsItem>,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)

