package com.demo.movie_play.domain.repository;

import com.demo.movie_play.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
