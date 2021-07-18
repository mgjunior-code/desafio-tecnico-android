package com.example.desafiosicoob.repositories;

import androidx.lifecycle.LiveData;

import com.example.desafiosicoob.models.MovieModel;
import com.example.desafiosicoob.request.MovieApiClient;

import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;

    private MovieApiClient movieApiClient;

    private String mQuery;
    private int mPageNumber;


    public static MovieRepository getInstance() {
        if (instance == null) {
            instance = new MovieRepository();
        }
        return instance;

    }

    private MovieRepository() {

        movieApiClient = MovieApiClient.getInstance();
    }


    public LiveData<List<MovieModel>> getMovies() {
        return movieApiClient.getMovies();
    }

    public void serachMovieApi(String query, int pageNumber) {
        mQuery = query;
        mPageNumber = pageNumber;
        movieApiClient.searchMoviesApi(query, pageNumber);
    }


    public void searchNextPage() {
        serachMovieApi(mQuery, mPageNumber + 1);
    }


    public LiveData<List<MovieModel>> getPop() {
        return movieApiClient.getPop();
    }

    public void serachMoviePop(int pageNumber) {

        mPageNumber = pageNumber;
        movieApiClient.searchMoviesPop(pageNumber);
    }

}




