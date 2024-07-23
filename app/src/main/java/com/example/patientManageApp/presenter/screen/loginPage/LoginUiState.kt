package com.example.patientManageApp.presenter.screen.loginPage

sealed interface LoginUiState {
    data object IDlE : LoginUiState
    data object SingIn : LoginUiState
    data object SingUp : LoginUiState
    data object LoginFail : LoginUiState
    data object IsLoading: LoginUiState
}