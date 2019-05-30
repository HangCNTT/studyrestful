package com.example.studyrestful.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter

public class Address {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "addressCategoryId", columnDefinition = "BINARY(16)", nullable = false)
    private UUID id;
    @Column(name = "name", columnDefinition = "NVARCHAR(255)", nullable = false)
    private String name;
    @Column(name = "latitude",columnDefinition = "DECIMAL(10,7)", nullable = false)
    private String latitude;
    @Column(name = "longtitude",columnDefinition = "DECIMAL(10,7)", nullable = false)
    private String longtitude;
        @Column(name = "description", columnDefinition = "NVARCHAR(1000)")
    private String description;
    @Column(name = "openTime", columnDefinition = "TIME")
    private Time openedTime;
    @Column(name = "closedTime", columnDefinition = "TIME")
    private Time closedTime;
}
