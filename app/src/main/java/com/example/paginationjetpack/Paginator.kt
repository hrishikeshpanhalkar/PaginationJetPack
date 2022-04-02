package com.example.paginationjetpack

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    suspend fun reset()
}