package com.joincoded.statmentlists.data

data class DataTransaction(

    val transactionType: String,
    val amount: Double,
    val date: String,
    val currency: String,
    val balance: Double,
)