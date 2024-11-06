package com.example.entityhoussem.controllers;

import com.example.entityhoussem.entity.Chambre;
import com.example.entityhoussem.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre") // Base URL for all requests in this controller
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/update/{id}")
    public Chambre updateChambre(@PathVariable Long id, @RequestBody Chambre chambre) {
        return chambreService.updateChambre(id, chambre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }
}
