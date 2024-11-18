package com.example.testjpcompose.pages

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.testjpcompose.GamingLIstItem
import com.example.testjpcompose.data.DataProvider
import com.example.testjpcompose.model.Games

@Composable
fun HomePage(modifier: Modifier = Modifier, navigateToDetailsActivity: (Games) -> Unit) {
    val gaming = remember { DataProvider.gamesList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = gaming,
            itemContent = {
                GamingLIstItem(games = it,)
            }
        )
    }
}