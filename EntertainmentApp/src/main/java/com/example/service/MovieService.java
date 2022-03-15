package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Movie;

@Service
public interface MovieService {
	
	String welcomeMsg();
	public List<String[]>  getMovies();
	public Movie getMovieById(String id);
	public Movie insertMovie(Movie movie);
}
