package com.hibernate.mapping.repository;

import com.hibernate.mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
