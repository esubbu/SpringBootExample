package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Movie;
import com.example.repository.MovieRepository;
import com.example.service.MovieServiceImpl;

@SpringBootTest
public class MovieServiceImplTest {

	@Mock
	MovieRepository mRepo;

	@InjectMocks
	MovieServiceImpl movieImpl;

	@Mock
	Logger logger;

	@Test
	public void insertMovieTest() {
		Movie movie = new Movie(1, "Bahubali", "Telugu", "Action", 4, "bahubali.png");
		when(logger.isInfoEnabled()).thenReturn(false);
		when(mRepo.save(movie)).thenReturn(movie);
		assertEquals(movie, movieImpl.insertMovie(movie));
	}

	@Test
	public void getMoviesTest() {
		Movie movie = new Movie(1, "Bahubali", "Telugu", "Action", 4, "bahubali.png");
		Movie movie1 = new Movie(2, "Avengers", "English", "Action", 4, "avenger.png");
		List<Movie> list = new ArrayList<Movie>();
		list.add(movie);
		list.add(movie1);

		when(logger.isInfoEnabled()).thenReturn(false);
		when(mRepo.findAll()).thenReturn(list);
		assertEquals(2, movieImpl.getMovies().size());
	}

	@Test
	public void getMovieByIdTest() {
		
		Optional<Movie> movie = Optional.ofNullable(new Movie(1, "Bahubali", "Telugu", "Action", 4, "bahubali.png"));
		
		when(mRepo.findById(1)).thenReturn(movie);
		assertEquals(1, movieImpl.getMovieById("1").getId());
		
	}
	
	

}
