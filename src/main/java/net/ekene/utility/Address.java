package net.ekene.utility;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
