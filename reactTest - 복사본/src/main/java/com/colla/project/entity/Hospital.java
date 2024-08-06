package com.colla.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "hospital")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hospital {

    @Id
    private String careCode;

    private String hospitalName;

    private String cityCode;

    private String districtCode;

    private String addressDetailCode;

    private String postalCode;

    private String address;

    private String phoneNumber;

    private String hospitalURL;

    private double x_coordinate;

    private double y_coordinate;

    private String hospitalType;
}
