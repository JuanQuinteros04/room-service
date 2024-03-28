package com.room.controller;

import com.room.model.DTO.RoomDTO;
import com.room.model.DTO.RoomResponse;
import com.room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RoomResponse>> findAllRooms(){
        return ResponseEntity.ok(roomService.findAllRooms());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomResponse>findRoomById(@PathVariable("id")Long id){
        return ResponseEntity.ok(roomService.findRoomById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomResponse>createRoom(@RequestBody RoomDTO roomDTO){
        RoomResponse roomResponse = roomService.createRoom(roomDTO);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand((roomResponse.getId()))
                .toUri();

        return ResponseEntity.created(location).body(roomResponse);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>updateRoom(@PathVariable("id")Long id, @RequestBody RoomDTO roomDTO){
        roomService.updateRoom(id, roomDTO);
        return ResponseEntity.status(204).build();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>deleteRoom(@PathVariable("id") Long id){
        roomService.deleteRoom(id);
        return ResponseEntity.status(204).build();
    }

}
