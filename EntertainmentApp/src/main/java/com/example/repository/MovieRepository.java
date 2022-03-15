package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer> {

}
