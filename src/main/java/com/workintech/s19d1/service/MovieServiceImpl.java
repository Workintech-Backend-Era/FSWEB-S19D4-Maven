package com.workintech.s19d1.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.workintech.s19d1.entity.Movie;
import com.workintech.s19d1.exceptions.ApiException;
import com.workintech.s19d1.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{


    private MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository){
        this.repository=repository;
    }

    @Override
    public Movie findById(Long id) {
        return repository.findById(id).orElseThrow(()->new ApiException("Not Found", HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public Movie update(Long id, Movie movie) {
        Movie existed = findById(id);
        existed.setId(movie.getId());
        existed.setName(movie.getName());
        existed.setRating(movie.getRating());
        existed.setDirectorName(movie.getDirectorName());
        existed.setReleaseDate(movie.getReleaseDate());
        return repository.save(movie);
    }

    @Override
    public Movie delete(Long id) {
        Movie movie = findById(id);
        repository.deleteById(id);
        return movie;
    }

}
