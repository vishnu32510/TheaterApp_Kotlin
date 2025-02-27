package com.example.theaterapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.theaterapp.data.DiscoverScreenState
import com.example.theaterapp.ui.components.sections.ComingSoonSection
import com.example.theaterapp.ui.components.sections.FeaturedMovieSection
import com.example.theaterapp.ui.components.sections.HorizontalSection

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
){

    val scrollableState = rememberScrollState()

    Column (
        verticalArrangement = Arrangement.spacedBy(32.dp),
      modifier = modifier
          .padding(24.dp)
          .verticalScroll(scrollableState)
  ){
      FeaturedMovieSection(
          data = screenState.featuresMovies,
      )
      ComingSoonSection(
          data = screenState.upComingMovies,
          modifier = Modifier.padding(18.dp)
      )
        HorizontalSection(data = screenState.recentlyWatched,
            name = "Recently Watched"
        )
        HorizontalSection(data = screenState.streamingMovies,
            name = "Streaming On Demand"
        )
  }
}