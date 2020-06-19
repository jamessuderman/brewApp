/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 06/19/2020
 */

package com.jamessuderman.brewapp.web.services;

import com.jamessuderman.brewapp.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beer);
    void updateBeer(UUID beerId, BeerDto beer);
    void deleteById(UUID beerId);
}
