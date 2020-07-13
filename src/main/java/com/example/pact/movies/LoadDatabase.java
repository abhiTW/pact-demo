package com.example.pact.movies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(com.example.pact.movies.LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(MovieRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Movie("inception", "science-fiction")));
//            log.info("Preloading " + repository.save(new Movie("Frozon", "fantasy")));
//            log.info("Preloading " + repository.save(new Movie("Batman", "super hero")));
        };
    }
}
