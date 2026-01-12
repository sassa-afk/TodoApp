package com.example.todoapp.model

import com.google.firebase.firestore.DocumentId

/**
 * Data class para representar um item da lista de tarefas.
 * A anotação @DocumentId faz com que o Firestore automaticamente popule o campo `id`
 * com o ID do documento (que é uma String) quando os dados são lidos.
 */
data class TodoItem(
    @DocumentId val id: String = "",
    val title: String = "",
    val description: String = "",
    val done: Boolean = false,
    val date: String = ""
)
