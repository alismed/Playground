package com.devmesh.playground;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 
import com.devmesh.playground.models.Movie;
 
public interface IMovieRepository extends CrudRepository<Movie, Long> {
 
    List<Movie> findByYearLessThan(int year);
 
}