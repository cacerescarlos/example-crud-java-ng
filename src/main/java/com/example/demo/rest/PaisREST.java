package com.example.demo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pais;
import com.example.demo.service.PaisService;


@RestController
@RequestMapping("/pais")
public class PaisREST {

	@Autowired
	private PaisService paisService;
	
//	  @PostMapping
//	  public ResponseEntity<String> register(@RequestBody RegistrationRequest dto) {
//	    String message = paisService.register(dto);
//	    return ResponseEntity.status(HttpStatus.CREATED).body(message);
//	  }
	
	@GetMapping()
	private ResponseEntity<List<Pais>> getAllPaises(){
		return ResponseEntity.ok(paisService.findAll());
	}
	
	@GetMapping("/list")
	private ResponseEntity<List<Object>> testGetAllPaises(){
		return ResponseEntity.ok(paisService.procGetFindAll());
	}
	
	@GetMapping("/total")
	private int getTotalPaises(){
		return paisService.getTotalPaises();
	}
}
