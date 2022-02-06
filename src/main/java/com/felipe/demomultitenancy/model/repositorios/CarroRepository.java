package com.felipe.demomultitenancy.model.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.demomultitenancy.model.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
