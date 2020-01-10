package com.luv2code.msscbrewwery.msscbrewery.web.mappers;

import com.luv2code.msscbrewwery.msscbrewery.domain.Beer;
import com.luv2code.msscbrewwery.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author Jack Tran
 */
@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
