package com.ex.altik.mymoviesdemo;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Александр on 27.12.2016.
 */

public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
