package com.rubenialima.place_service.domain;

import com.github.slugify.Slugify;
import com.rubenialima.place_service.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg= Slugify.builder().build();
    }


        public Mono<Place> create(PlaceRequest placeRequest){
            Long id =null;
            var place = new Place( id, placeRequest.name(),slg.slugify(placeRequest.name()),
            placeRequest.state(),placeRequest.createdAt(),placeRequest.updatedAt());
            return placeRepository.save(place);
        }
    }

