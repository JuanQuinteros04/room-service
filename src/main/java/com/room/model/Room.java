package com.room.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "rooms")
@EqualsAndHashCode
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "room_number")
    private Long roomNumber;

    @Column(name = "type_room")
    private String typeRoom;

    @Column(name = "room_capacity")
    private Long roomCapacity;

    @Column(name = "available_room")
    private Boolean availableRoom;

    @Column(name = "price")
    private Double price;


}
