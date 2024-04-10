package com.room;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.commons.room.model"})
public class RoomServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoomServiceApplication.class);
    }
}