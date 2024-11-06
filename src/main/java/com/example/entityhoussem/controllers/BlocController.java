package com.example.entityhoussem.controllers;

import com.example.entityhoussem.entity.Bloc;
import com.example.entityhoussem.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RequestMapping("/bloc") // Add this line to set a base URL for all requests in this controller
    @RestController
    @AllArgsConstructor
    public class BlocController {
        IBlocService blocService;

        @PostMapping("add")
        public Bloc addBloc(@RequestBody Bloc bloc) {
            return blocService.addBloc(bloc);
        }

        @PutMapping("/updatebloc/{id}")
        public Bloc updateBloc(@PathVariable Long id, @RequestBody Bloc bloc) {
            return blocService.updateBloc(id, bloc);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteBloc(@PathVariable Long id) {
            blocService.deleteBloc(id);
        }

        @GetMapping("/{id}") // Endpoint to get a Bloc by its ID
        public Bloc getBlocById(@PathVariable Long id) {
            return blocService.getBlocById(id);
        }

        @GetMapping("/all") // Endpoint to get all Blocs
        public List<Bloc> getAllBlocs() {
            return blocService.getAllBlocs();
        }
    }

