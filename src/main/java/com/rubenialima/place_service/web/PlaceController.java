package com.rubenialima.place_service.web;


import com.rubenialima.place_service.domain.Place;
import com.rubenialima.place_service.domain.PlaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceService placeService;

    public PlaceController (PlaceService placeService){
        this.placeService = placeService;
    }

    public ResponseEntity<Mono<Place>> crete(Place place){
        var createPlace = placeService.create(place);
        return ResponseEntity.status(HttpStatus.CREATED).body(createPlace);
    }
}
