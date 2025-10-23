package com.workintech.s19d1.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.workintech.s19d1.entity.Actor;
import com.workintech.s19d1.exceptions.ApiException;
import com.workintech.s19d1.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService{

    private ActorRepository repository;

    public ActorServiceImpl(ActorRepository repository){
        this.repository=repository;
    }

    @Override
    public Actor findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new ApiException("Not  Found", HttpStatus.BAD_REQUEST));
    }

    @Override
    public List<Actor> findAll() {
        return repository.findAll();
    }

    @Override
    public Actor save(Actor actor) {
        return repository.save(actor);
    }

    @Override
    public Actor update(Long id, Actor actor) {
        Actor existed = repository.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        actor.setId(existed.getId());
        actor.setFirstName(existed.getFirstName());
        actor.setLastName(existed.getLastName());
        actor.setGender(existed.getGender());
        actor.setBirthDate(existed.getBirthDate());
        return repository.save(actor);
    }

    @Override
    public void delete(Long id) {
        Actor actor = findById(id);
        repository.delete(actor);
    }



}
