<h1 align="center">Trabalho 3  (TApp de tarefas com Autenticação) </h1>


## **Objetivo** ##

Este trabalho tem como objetivo documentar o desenvolvimento de um aplicativo de gerenciamento de tarefas, permitindo que o usuário realize cadastro, login e administração ( criar tarefas, excluir e marcar como feita ) das suas atividades do dia a dia.

**O projeto foi desenvolvido com o intuito de colocar em prática os conhecimentos adquiridos na disciplina de PDM (Programação para Dispositivos Mobile) do curso Sistema da Informação da Universidade Federal de Uberlândia**

---- 

## **Integrantes** ##

+ Samuel Souto dos Santos :: 🔗 : https://github.com/sassa-afk/TodoApp  
+ Mateus Batista :: 🔗  https://github.com/matheusbatista10/TodoApp.git  

--- 

## **Funcionalidade do App** ##

 *Tela de Login e Cadastro*

+ O aplicativo possui uma tela principal onde, através da navegação utilizando Jetpack Compose, o usuário pode:

	- Criar uma conta  
	- Realizar login  

+ O sistema permite o cadastro de usuários utilizando Firebase Authentication, garantindo:

	- Registro seguro das contas  
	- Processo de autenticação validado pelo Firebase  

+ Após autenticado, o usuário poderá gerenciar suas tarefas diárias dentro do aplicativo. O sistema foi desenvolvido com uma abordagem simples e objetiva, dividindo as funcionalidades em duas telas principais.

*Tela de Criação de Tarefas*

+ Nesta tela, o usuário poderá criar novas tarefas informando apenas os dados de:
		- Título  
		- Descrição  
+ Após o cadastro, a tarefa será armazenada e ficará disponível para visualização posterior.

*Tela de Gerenciamento de Tarefas*

+ Nesta tela, o usuário poderá visualizar todas as tarefas cadastradas, onde será possível:
	- Marcar a tarefa como executada  
	- Excluir tarefas criadas  
+ Essa estrutura segue um modelo básico e funcional de gerenciamento de tarefas, priorizando a facilidade de uso e a organização das atividades registradas pelo usuário.

--- 

## **Telas do App** ##

<img width="1102" height="493" alt="image" src="https://github.com/user-attachments/assets/fa70c803-fb68-494e-845d-7bc28d995ce0" />

--- 

## **Tecnologias Utilizadas** ##
 
- Kotlin  
- Jetpack Compose  
- Navigation Compose  
- Firebase Authentication
- Arquitetura MVVM
  
 --- 
## **Estrutura do Projeto** ##

A aplicação foi criada seguindo o modelo:

		├── AndroidManifest.xml
		├── java
		│   ├── com
		│   │   └── example
		│   │       └── todoapp
		│   │           ├── AppNav.kt
		│   │           ├── MainActivity.kt
		│   │           ├── navigation.kt
		│   │           ├── screens
		│   │           │   ├── LoginScreen.kt
		│   │           │   └── SignUpScreen.kt
		│   │           ├── ui
		│   │           │   └── theme
		│   │           │       ├── Color.kt
		│   │           │       ├── Theme.kt
		│   │           │       └── Type.kt
		│   │           └── viewmodel
		│   │               └── AuthViewModel.kt
		│   ├── model
		│   │   └── TodoItem.kt
		│   ├── screens
		│   │   ├── AddTodoScreen.kt
		│   │   └── TodoListScreen.kt
		│   └── viewmodel
		│       └── TodoViewModel.kt
		└── res
		    ├── drawable
		    ├── drawable-v24
		    ├── mipmap-anydpi-v26
		    ├── mipmap-hdpi
		    ├── mipmap-mdpi
		    ├── mipmap-xhdpi
		    ├── mipmap-xxhdpi
		    ├── mipmap-xxxhdpi
		    ├── values
		    └── xml

 --- 

 ## **Uso dos LLM** ##

O uso de Inteligência Artificial no projeto foi aplicado com o objetivo de apoiar e acelerar o aprendizado da disciplina. Foi utilizada uma IA integrada ao ambiente de desenvolvimento Android Studio para auxílio na implementação e compreensão de conceitos.

 --- 

 ## **Referências para criação do app** ##

+ Como Configurar o Firebase no Android Studio: Atualizado (15/10/2024)  
	🔗 https://www.youtube.com/watch?v=pXWaDJNrGlQ&t=3s  

+ How to Integrate Firebase Firestore with Kotlin and Use it in Android Apps  
	🔗 https://www.blog.finotes.com/post/how-to-integrate-firebase-firestore-with-kotlin-and-use-it-in-android-apps  

+ Android Basics with Compose and Firebase  
	🔗 https://developer.android.com/courses/android-basics-compose-firebase/course  

+ Firebase Authentication in Android using Kotlin (Login & Register)  
	🔗 https://dev.to/luv_dumka_73b5c3e11dcea61/firebase-authentication-in-android-using-kotlin-login-register-4njp  

  --- 
## **Instruções de Instalação e ambienet de desenvolvimento** ##

Para executar o projeto localmente, siga os passos abaixo:

+ Pré-requisitos:

  	- Android Studio instalado (versão mais recente recomendada)
  	- SDK do Android configurado
  	- Conta Google para configuração do Firebase
  	- Conexão com a internet

+ Passos para execução:

	1. Clonar o repositório:

		git clone https://github.com/sassa-afk/TodoApp

	2. Abrir o projeto no Android Studio.

	3. Sincronizar as dependências do Gradle automaticamente ao abrir o projeto.

	4. Configurar o Firebase:

		- Criar um projeto no Firebase Console
		- Registrar o aplicativo Android no Firebase
		- Baixar o arquivo "google-services.json"
		- Inserir o arquivo dentro da pasta "app" do projeto

	5. Executar o aplicativo:

		- Conectar um dispositivo físico ou iniciar um emulador
		- Clicar em "Run" no Android Studio

Após esses passos, o aplicativo estará pronto para uso.

--- 

## **Arquitetura Utilizada (MVVM)** ##

O projeto foi desenvolvido utilizando o padrão arquitetural MVVM (Model - View - ViewModel), que tem como objetivo separar responsabilidades dentro da aplicação, facilitando manutenção, organização e escalabilidade do código.

 **Model**

Responsável pela representação dos dados e regras de negócio da aplicação.

No projeto, essa camada é representada principalmente pela classe:

- TodoItem.kt

Ela define a estrutura das tarefas manipuladas pelo sistema.

**View**

Responsável pela interface gráfica e interação com o usuário.

No projeto, essa camada é composta pelas telas construídas com Jetpack Compose, como:

- LoginScreen.kt  
- SignUpScreen.kt  
- AddTodoScreen.kt  
- TodoListScreen.kt  

Essas telas exibem os dados e capturam ações do usuário.

 **ViewModel**

Responsável por intermediar a comunicação entre View e Model, controlando estados e regras da aplicação.

No projeto, essa camada é representada por:

- AuthViewModel.kt  
- TodoViewModel.kt  

Essas classes gerenciam autenticação, armazenamento de tarefas e lógica de funcionamento do aplicativo.

A utilização do MVVM permite maior organização do código, reutilização de componentes e melhor separação das responsabilidades entre interface e lógica de negócio.

---
 ## **Melhorias futuras** ##

- Implementar persistência das tarefas em banco de dados em nuvem  
- Adicionar edição de tarefas já cadastradas  
- Implementar filtros para tarefas concluídas e pendentes  
- Implementar recuperação de senha utilizando Firebase Authentication
- Adicionar notificações e lembretes de tarefas  

---
