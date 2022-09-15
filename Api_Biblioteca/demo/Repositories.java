package com.IniciarBiblioteca.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface Repositories extends JpaRepository<Models, Long>{
	List<Models> findByName(@Param("name")String name);
}
