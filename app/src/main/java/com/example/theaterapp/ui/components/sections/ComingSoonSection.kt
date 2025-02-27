package com.example.theaterapp.ui.components.sections

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.theaterapp.data.MovieThumbnailState
import com.example.theaterapp.ui.components.MovieThumbnail
import com.example.theaterapp.ui.components.SectionHeader

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ComingSoonSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>
){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        SectionHeader(
            text = "Coming Soon"
        )
        FlowRow (
            modifier = Modifier.fillMaxWidth(),
            maxItemsInEachRow = 2,
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ){
            data.forEach { thumbnail ->
                MovieThumbnail(img = thumbnail.img,
                    modifier = Modifier.weight(weight = 1f))
            }
        }
    }
}