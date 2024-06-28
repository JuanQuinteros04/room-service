package com.room.model;

import com.room.enums.RoomType;
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

    @Column(name = "room_number", unique = true)
    private Long roomNumber;

    @Column(name = "room_capacity")
    private Long roomCapacity;

    @Column(name = "price")
    private Double pricePerNight;

    @Column(name = "type_room")
    private RoomType typeRoom;

    @Column(name = "beach_view")
    private Boolean beachView;

    @Column(name = "garage")
    private Boolean garage;

    @Column(name = "available_room")
    private Boolean availableRoom;




}
