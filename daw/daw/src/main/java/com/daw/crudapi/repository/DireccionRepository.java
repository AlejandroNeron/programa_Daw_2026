package com.daw.crudapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.daw.crudapi.model.Direccion;
public interface DireccionRepository extends JpaRepository<Direccion, Long> {
    // No hace falta código adicional: JpaRepository ya ofrece findAll(),
    // findById(), save(), deleteById(), existsById(), etc.
    
}
