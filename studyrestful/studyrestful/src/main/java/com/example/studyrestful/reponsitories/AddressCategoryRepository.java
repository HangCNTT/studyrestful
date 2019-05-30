package com.example.studyrestful.reponsitories;


import com.example.studyrestful.entities.AddressCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressCategoryRepository extends CrudRepository<AddressCategory, UUID> {
}
