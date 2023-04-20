package net.turbovadim.session5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class ScreensList(val route: String) {
    object ChatList : ScreensList("ChatList")
    object ChatScreen : ScreensList("ChatScreen")
}

@Composable
fun Navigation() {

    val navController = rememberNavController()

    val viewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current)

    NavHost(navController, ScreensList.ChatList.route){
        composable(ScreensList.ChatList.route) {
            CompositionLocalProvider(LocalViewModelStoreOwner provides viewModelStoreOwner) {
                ChatsList(navController)
            }
        }
        composable(ScreensList.ChatScreen.route) {
            CompositionLocalProvider(LocalViewModelStoreOwner provides viewModelStoreOwner) {

            }
        }
    }

}