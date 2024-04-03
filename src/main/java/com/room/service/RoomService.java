package com.room.service;

import com.room.model.DTO.RoomDTO;
import com.room.model.DTO.RoomResponse;

import java.util.List;

public interface RoomService {

    List<RoomResponse> findAllRooms();

    RoomResponse findRoomById(Long id);

    RoomResponse createRoom(RoomDTO roomDTO);

    void updateRoom(Long id, RoomDTO roomDTO);

    void deleteRoom(Long id);
}
