package com.room.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode
public class RoomDTO {

    private Long roomNumber;

    private String typeRoom;

    private Long roomCapacity;

    private Boolean availableRoom;

    private Double pricePerNight;

}