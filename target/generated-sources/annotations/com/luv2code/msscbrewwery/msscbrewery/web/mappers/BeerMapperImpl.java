package com.luv2code.msscbrewwery.msscbrewery.web.mappers;

import com.luv2code.msscbrewwery.msscbrewery.domain.Beer;
import com.luv2code.msscbrewwery.msscbrewery.domain.Beer.BeerBuilder;
import com.luv2code.msscbrewwery.msscbrewery.web.model.BeerDto;
import com.luv2code.msscbrewwery.msscbrewery.web.model.BeerDto.BeerDtoBuilder;
import com.luv2code.msscbrewwery.msscbrewery.web.model.v2.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-09T22:25:03-0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3.0.101 (Azul Systems, Inc.)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( beer.getBeerStyle().name() );
        }
        beerDto.upc( beer.getUpc() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        BeerBuilder beer = Beer.builder();

        beer.id( beerDto.getId() );
        beer.beerName( beerDto.getBeerName() );
        if ( beerDto.getBeerStyle() != null ) {
            beer.beerStyle( Enum.valueOf( BeerStyleEnum.class, beerDto.getBeerStyle() ) );
        }
        beer.upc( beerDto.getUpc() );

        return beer.build();
    }
}
