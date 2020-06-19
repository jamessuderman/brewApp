/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 06/19/2020
 */

package com.jamessuderman.brewapp.web.services.v2;

import com.jamessuderman.brewapp.web.model.BeerDto;
import com.jamessuderman.brewapp.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beer);
    void updateBeer(UUID beerId, BeerDtoV2 beer);
    void deleteById(UUID beerId);
}
