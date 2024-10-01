package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.entity.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede, Long>{
	
}
