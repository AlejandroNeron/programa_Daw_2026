package com.daw.crudapi.controller;
import java.util.List;
import java.util.Locale;
import net.datafaker.Faker;
import com.daw.crudapi.repository.DireccionRepository;
import com.daw.crudapi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.crudapi.model.Cliente;
import com.daw.crudapi.model.Direccion;
import com.daw.crudapi.repository.ClienteRepository;


@RestController
@RequestMapping("/crudapi")
public class CrudApiController {

    @Autowired
    ClienteRepository repoCli;
    @Autowired 
    DireccionRepository repoDir;
    @Autowired
    PedidoRepository repoPed;


    private final Faker faker = new Faker(Locale.forLanguageTag("es-ES"));


    




    @GetMapping
    public String index() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellidos("Pérez");
        cliente.setEmail("juan@gmail.com");
        cliente.setTelefono("546777989");

        Direccion direccion = new Direccion();
        direccion.setCalle("Calle Falsa");
        direccion.setNumero("123");
        direccion.setCiudad("Madrid");
        direccion.setCodigoPostal("28080");
        cliente.addDireccion(direccion);
        

        repoCli.save(cliente);

        return "Operación realizada correctamente";
    }


     @GetMapping("/testConsultas")
    public String testConsultas(){

        List<Cliente> listaClientes;
        
        // Primero desplegamos el plegable  con la pagina y cantidad de elementos por pagina
        listaClientes = repoCli.findAll();  

       
        return "texto";
    }

}