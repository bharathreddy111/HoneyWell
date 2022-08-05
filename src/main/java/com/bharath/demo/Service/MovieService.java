package com.bharath.demo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MovieService {

	@GetMapping("/getMovies")
	public String getmovies() {
		
		return null;
		
	}
	
}
