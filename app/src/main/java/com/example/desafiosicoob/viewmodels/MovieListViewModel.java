package com.example.desafiosicoob.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.desafiosicoob.models.MovieModel;
import com.example.desafiosicoob.repositories.MovieRepository;

import java.util.List;

public class MovieListViewModel extends ViewModel {

    private MovieRepository movieRepository;

    public MovieListViewModel() {
        movieRepository = MovieRepository.getInstance();

    }

    public LiveData<List<MovieModel>> getMovies() {
        return movieRepository.getMovies();
    }

    public LiveData<List<MovieModel>> getPop() {
        return movieRepository.getPop();
    }


    public void searchMovieApi(String query, int pageNumber) {
        movieRepository.serachMovieApi(query, pageNumber);
    }

    public void searchMoviePop(int pageNumber) {
        movieRepository.serachMoviePop(pageNumber);
    }


    public void searchNextpage() {
        movieRepository.searchNextPage();
    }


}
