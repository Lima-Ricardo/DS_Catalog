package com.rdev.DSCatalog.RDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdev.DSCatalog.RDev.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

}
