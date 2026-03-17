package com.example.kamasonatoki.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Text
import com.example.kamasonatoki.model.GridItem

@Composable
fun GridItemCard(item: GridItem, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .aspectRatio(1f)          // keeps it square
            .background(Color.Blue)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = item.label, color = Color.White)
    }
}