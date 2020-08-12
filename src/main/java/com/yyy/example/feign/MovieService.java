package com.yyy.example.feign;

import com.yyy.example.model.MovieModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Component
@FeignClient("MOVIE-SERVICE")
public interface MovieService {

    @PostMapping("/movie")
    List<MovieModel> getMovieList(MovieModel param);
}
