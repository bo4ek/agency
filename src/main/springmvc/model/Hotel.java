package main.springmvc.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Hotel entity. Contain information about Hotel.
 */
@Getter
@Setter

@EqualsAndHashCode(exclude="hotelId")
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hotel", unique = true)
    private Integer countryId;

    @Column(name = "hotel_name",unique = true, nullable = false)
    private String hotelName;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private City city;
}
