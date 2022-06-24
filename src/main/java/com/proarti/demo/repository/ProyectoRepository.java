package com.proarti.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proarti.demo.entities.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

}
