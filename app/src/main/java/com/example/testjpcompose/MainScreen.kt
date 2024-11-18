package com.example.testjpcompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.testjpcompose.model.Games
import com.example.testjpcompose.pages.AboutPage
import com.example.testjpcompose.pages.DetailsPage
import com.example.testjpcompose.pages.HomePage

@Composable
fun MainScreen(modifier: Modifier = Modifier, navigateToDetails: (Games) -> Unit) {

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Details", Icons.Default.Info),
        NavItem("About", Icons.Default.AccountCircle),
    )

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }


    Scaffold( modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index ,
                        onClick = {
                            selectedIndex = index
                        },
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding),selectedIndex,navigateToDetails)
    }
}


@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex: Int, navigateToDetails: (Games) -> Unit) {
    when(selectedIndex){
        0-> HomePage { }
        1-> DetailsPage()
        2-> AboutPage()
    }
}




