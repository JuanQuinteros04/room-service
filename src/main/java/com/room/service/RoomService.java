package com.room.service;

import com.room.dto.RoomDTO;
import com.room.dto.responses.RoomResponse;

import java.util.List;

public interface RoomService {

    List<RoomResponse> findAllRooms();

    RoomResponse findRoomById(Long id);

    RoomResponse findByRoomNumber(Long roomNumber);

    RoomResponse createRoom(RoomDTO roomDTO);

    void updateRoom(Long id, RoomDTO roomDTO);

    void deleteRoom(Long id);
}
