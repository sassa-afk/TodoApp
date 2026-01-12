package com.example.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todoapp.screens.AddTodoScreen
import com.example.todoapp.screens.LoginScreen
import com.example.todoapp.screens.SignUpScreen
import com.example.todoapp.screens.TodoListScreen
import com.example.todoapp.viewmodel.AuthViewModel
import com.example.todoapp.viewmodel.TodoViewModel

@Composable
fun AppNav(todoViewModel: TodoViewModel, authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    val user by authViewModel.currentUser.collectAsState()

    // O NavHost agora sempre começa no login, e os LaunchedEffects decidem a navegação.
    NavHost(navController = navController, startDestination = "login") {

        composable("login") {
            // Se o usuário já estiver logado, este efeito o levará para a lista.
            LaunchedEffect(user) {
                if (user != null) {
                    navController.navigate("list") {
                        // Limpa a pilha para que o usuário não possa "voltar" para a tela de login.
                        popUpTo("login") { inclusive = true }
                    }
                }
            }
            LoginScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = { navController.navigate("signup") },
                onLoginSuccess = { /* A navegação agora é tratada pelo LaunchedEffect */ }
            )
        }

        composable("signup") {
            SignUpScreen(
                authViewModel = authViewModel,
                onNavigateBack = { navController.popBackStack() },
                onSignUpSuccess = {
                    navController.navigate("list") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }

        composable("list") {
            // Se o usuário deslogar (user se torna null), este efeito o levará de volta ao login.
            LaunchedEffect(user) {
                if (user == null) {
                    navController.navigate("login") {
                        popUpTo("list") { inclusive = true }
                    }
                }
            }

            TodoListScreen(
                viewModel = todoViewModel,
                onAddClick = { navController.navigate("add") },
                onLogoutClick = { authViewModel.logout() } // A navegação é tratada reativamente pelo LaunchedEffect
            )
        }

        composable("add") {
            AddTodoScreen(
                viewModel = todoViewModel,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
