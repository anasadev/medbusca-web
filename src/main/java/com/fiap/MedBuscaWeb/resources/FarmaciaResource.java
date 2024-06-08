package com.fiap.MedBuscaWeb.resources;

import com.fiap.MedBuscaWeb.entities.Farmacia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/farmacias")
public class FarmaciaResource {

    @GetMapping
    public ResponseEntity<Farmacia> findAll(){
        Farmacia far = new Farmacia(1, "Farmacia do Povo", "Avenida Liberdade, 1077, Centro", "24h, 7/7");
        return ResponseEntity.ok().body(far);
    }
}
