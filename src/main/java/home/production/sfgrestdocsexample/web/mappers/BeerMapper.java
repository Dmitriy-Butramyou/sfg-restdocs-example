package home.production.sfgrestdocsexample.web.mappers;

import home.production.sfgrestdocsexample.domain.Beer;
import home.production.sfgrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
