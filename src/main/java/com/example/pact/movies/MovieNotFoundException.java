package com.example.pact.movies;

public class MovieNotFoundException extends RuntimeException {
    MovieNotFoundException(Long id) {
        super("Could not find movie " + id);
    }
}
