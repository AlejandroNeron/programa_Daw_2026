package com.daw.crudapi.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Setter;

@Entity
@Setter  
public class Direccion {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String calle;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private String codigoPostal;




    @ManyToOne 

    // usamos JoinColum para especificar el nombre de la Fk, apunte automaticamente
    // al Id de la tabla cliente por que usamos la clase Cliente
    // ponermos nullable false ya que mo puede haber direcciones sin clientes

    @JoinColumn(name ="cliente_id" , nullable = false)
    private Cliente cliente;




    
}
