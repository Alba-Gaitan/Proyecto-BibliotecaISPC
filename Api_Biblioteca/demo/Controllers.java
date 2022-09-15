package com.IniciarBiblioteca.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Controllers {
		@Autowired
		private Repositories repository;
		
		@GetMapping ("/Models")
		public List<Models>allModels(){
			return repository.findAll();
		}
		@GetMapping ("/Models/{name}")
		public List<Models>findByName(@PathVariable("name")String name){
			return repository.findByName(name);
			}
		@PostMapping ("/Models")
		public Models createModels(@RequestBody Models user) {
			return repository.save(user);
			}
		
		@PutMapping ("/Models/{id}")
		public Models updateModels(@PathVariable int id, @RequestBody Models user) {
			return repository.save(user);
		}
		@DeleteMapping("/Models/{id}")
			public void deleteModels(@PathVariable("id")Long id) {
			repository.deleteById(id);
		}
}
