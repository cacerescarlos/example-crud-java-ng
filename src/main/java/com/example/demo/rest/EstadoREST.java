package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estado;
import com.example.demo.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoREST {
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("/{idPais}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
}
