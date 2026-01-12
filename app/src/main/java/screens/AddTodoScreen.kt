package com.example.todoapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todoapp.viewmodel.TodoViewModel

@Composable
fun AddTodoScreen(
    viewModel: TodoViewModel,
    onBack: () -> Unit
) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Título") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Descrição") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            viewModel.addTodo(title, description)
            onBack()
        }) {
            Text("Salvar")
        }
    }
}
