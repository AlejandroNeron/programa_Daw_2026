package com.daw.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.daw.crudapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
List<Cliente> findByNombre(String nombre);  
List<Cliente> findByApellidos(String apellidos);
List<Cliente> findByEmail(String email);
}