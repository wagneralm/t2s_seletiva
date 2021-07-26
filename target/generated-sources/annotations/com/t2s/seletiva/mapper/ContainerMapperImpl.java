package com.t2s.seletiva.mapper;

import com.t2s.seletiva.model.Container;
import com.t2s.seletiva.model.Move;
import com.t2s.seletiva.model.dto.ContainerDTO;
import com.t2s.seletiva.model.dto.MoveDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-26T00:55:59-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class ContainerMapperImpl implements ContainerMapper {

    @Override
    public Container toModel(ContainerDTO containerDTO) {
        if ( containerDTO == null ) {
            return null;
        }

        Container container = new Container();

        container.setMoves( moveDTOListToMoveList( containerDTO.getMovesDtos() ) );
        container.setId( containerDTO.getId() );
        container.setClient( containerDTO.getClient() );
        container.setNumberContainer( containerDTO.getNumberContainer() );
        container.setType( containerDTO.getType() );
        container.setStatus( containerDTO.getStatus() );
        container.setCategory( containerDTO.getCategory() );

        return container;
    }

    @Override
    public ContainerDTO toTDO(Container container) {
        if ( container == null ) {
            return null;
        }

        ContainerDTO containerDTO = new ContainerDTO();

        containerDTO.setMovesDtos( moveListToMoveDTOList( container.getMoves() ) );
        containerDTO.setId( container.getId() );
        containerDTO.setClient( container.getClient() );
        containerDTO.setNumberContainer( container.getNumberContainer() );
        containerDTO.setType( container.getType() );
        containerDTO.setStatus( container.getStatus() );
        containerDTO.setCategory( container.getCategory() );

        return containerDTO;
    }

    protected Move moveDTOToMove(MoveDTO moveDTO) {
        if ( moveDTO == null ) {
            return null;
        }

        Move move = new Move();

        move.setId( moveDTO.getId() );
        move.setMoveType( moveDTO.getMoveType() );
        move.setFirstDate( moveDTO.getFirstDate() );
        move.setLastDate( moveDTO.getLastDate() );

        return move;
    }

    protected List<Move> moveDTOListToMoveList(List<MoveDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Move> list1 = new ArrayList<Move>( list.size() );
        for ( MoveDTO moveDTO : list ) {
            list1.add( moveDTOToMove( moveDTO ) );
        }

        return list1;
    }

    protected MoveDTO moveToMoveDTO(Move move) {
        if ( move == null ) {
            return null;
        }

        MoveDTO moveDTO = new MoveDTO();

        moveDTO.setId( move.getId() );
        moveDTO.setMoveType( move.getMoveType() );
        moveDTO.setFirstDate( move.getFirstDate() );
        moveDTO.setLastDate( move.getLastDate() );

        return moveDTO;
    }

    protected List<MoveDTO> moveListToMoveDTOList(List<Move> list) {
        if ( list == null ) {
            return null;
        }

        List<MoveDTO> list1 = new ArrayList<MoveDTO>( list.size() );
        for ( Move move : list ) {
            list1.add( moveToMoveDTO( move ) );
        }

        return list1;
    }
}
