package com.t2s.seletiva.mapper;

import com.t2s.seletiva.model.Container;
import com.t2s.seletiva.model.dto.ContainerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContainerMapper {

    ContainerMapper INSTANCE = Mappers.getMapper(ContainerMapper.class);

    @Mapping(target = "moves", source = "movesDtos")
    Container toModel(ContainerDTO containerDTO);

    @Mapping(target = "movesDtos", source = "moves")
    ContainerDTO toTDO(Container container);

}
