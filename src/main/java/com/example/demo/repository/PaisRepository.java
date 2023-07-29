package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

	// listado
	@Query(value = "SELECT p.id, p.nombre"
			+ "FROM public.pais p", nativeQuery = true)
	public List<Object> procGetFindAll();
	
	//cantidad total llamando a una funcion en postgresql	
	@Query(value = "SELECT public.gettotalpaises();", nativeQuery = true)
	public int getTotalPaises();
}
