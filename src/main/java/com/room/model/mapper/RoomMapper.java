package com.room.model.mapper;

import com.room.model.DTO.RoomDTO;
import com.room.model.DTO.RoomResponse;
import com.room.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    @Mapping(target = "id", ignore = true)
    Room roomDTOToRoom(RoomDTO roomDTO);

    RoomResponse roomToRoomResponse(Room room);


}
