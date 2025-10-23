package com.workintech.s19d1.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workintech.s19d1.entity.Movie;
import com.workintech.s19d1.service.MovieService;

import lombok.Delegate;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService service;

    public MovieController(MovieService service){
        this.service=service;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Movie>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Movie> save(@RequestBody Movie movie){
        return ResponseEntity.ok(service.save(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable Long id, @RequestBody Movie movie){
        return ResponseEntity.ok(service.update(id, movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Movie> delete(@PathVariable Long id){
        return ResponseEntity.ok(service.delete(id));
    }

}
