package com.workintech.s19d1.dto;

import java.util.List;

import com.workintech.s19d1.entity.Actor;
import com.workintech.s19d1.entity.Movie;

public record ActorRequest(Actor actor, List<Movie> movies) {

}
