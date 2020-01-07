package com.luv2code.msscbrewwery.msscbrewery.web.services;

import com.luv2code.msscbrewwery.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Jack Tran
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto savedNewBeer(BeerDto beerDto);
}
