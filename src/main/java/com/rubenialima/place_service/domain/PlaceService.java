package com.rubenialima.place_service.domain;

import com.rubenialima.place_service.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }


        public Mono<Place> create(PlaceRequest placeRequest){
            Long id =null;
            var place = new Place( id, placeRequest.name(), placeRequest.slug(),
            placeRequest.state(),placeRequest.createdAt(),placeRequest.updatedAt());
            return placeRepository.save(place);
        }
    }

