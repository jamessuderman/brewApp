/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 06/19/2020
 */

package com.jamessuderman.brewapp.web.services;

import com.jamessuderman.brewapp.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Rahr Blonde")
                .beerStyle("Blonde Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beer) {
        //TODO add implementation
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
