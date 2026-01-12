package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp.navigation.AppNav
import com.example.todoapp.viewmodel.AuthViewModel
import com.example.todoapp.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val todoViewModel: TodoViewModel = viewModel()
            val authViewModel: AuthViewModel = viewModel()
            AppNav(todoViewModel, authViewModel)
        }
    }
}
