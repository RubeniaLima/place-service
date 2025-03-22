package com.rubenialima.place_service.config;

import com.rubenialima.place_service.domain.PlaceRepository;
import com.rubenialima.place_service.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
}
