package com.rubenialima.place_service.domain;

import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }


        public Mono<Place> create(Place place){
            return placeRepository.save(place);
        }
    }

