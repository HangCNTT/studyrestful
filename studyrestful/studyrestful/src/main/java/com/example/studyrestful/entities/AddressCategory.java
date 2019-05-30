package com.example.studyrestful.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address_category")
@Getter
@Setter
public class AddressCategory {

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
}
