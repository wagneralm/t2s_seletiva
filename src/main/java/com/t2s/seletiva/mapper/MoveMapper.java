package com.t2s.seletiva.mapper;

import com.t2s.seletiva.model.Move;
import com.t2s.seletiva.model.dto.MoveDTO;
import org.mapstruct.factory.Mappers;

public interface MoveMapper {

    MoveMapper INSTANCE = Mappers.getMapper(MoveMapper.class);

    Move toModel(MoveDTO moveDTO);

    MoveDTO toTDO(Move move);
}
