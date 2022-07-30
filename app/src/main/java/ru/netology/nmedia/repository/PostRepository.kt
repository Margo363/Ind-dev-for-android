package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    val data: Flow<List<Post>>
    suspend fun getAll()
    suspend fun showNewPosts()
    fun getNewerCount(id: Long): Flow<Int>
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun likeById(id: Long)
    suspend fun unLikeById(id: Long)
}