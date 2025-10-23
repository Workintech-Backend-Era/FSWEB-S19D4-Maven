package com.workintech.s19d1.service;

import java.util.List;

import com.workintech.s19d1.dto.ActorRequest;
import com.workintech.s19d1.entity.Actor;

public interface ActorService {

    Actor findById(Long id);

    List<Actor> findAll();

    Actor save(Actor actor);

    Actor update(Long id, Actor actor);

    void delete(Long id);

}
