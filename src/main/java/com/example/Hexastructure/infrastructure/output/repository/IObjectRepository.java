package com.example.Hexastructure.infrastructure.output.repository;

import com.example.Hexastructure.infrastructure.output.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjectRepository extends JpaRepository<ObjectEntity, Long> {
}
