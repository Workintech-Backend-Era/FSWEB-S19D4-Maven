package com.workintech.s19d1.service;

import java.util.List;

import com.workintech.s19d1.entity.Movie;

public interface MovieService {

    Movie findById(Long id);

    List<Movie> findAll();

    Movie save(Movie movie);

    Movie update(Long id, Movie movie);

    Movie delete(Long id);

}
