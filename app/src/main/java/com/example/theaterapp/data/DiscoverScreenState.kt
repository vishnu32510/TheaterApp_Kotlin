package com.example.theaterapp.data

data class DiscoverScreenState(
    val featuresMovies: List<FeaturedMovieState> = FeatureMoviesData,
    val upComingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatched: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData,
)