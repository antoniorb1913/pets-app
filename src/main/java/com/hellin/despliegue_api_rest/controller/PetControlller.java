package com.hellin.despliegue_api_rest.controller;

import com.hellin.despliegue_api_rest.entity.Pet;
import com.hellin.despliegue_api_rest.dto.PetDto;
import com.hellin.despliegue_api_rest.repository.PetRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
/**
 * En este controlador se exponen todos los endpoint referentes a Pets {@link Pet}
 * @version 1.0
 * @author Cipriano García Herz
 */
public class PetControlller {

    private PetRepository petRepository;

    /**
     * Constructor del controlador rest
     * @param petRepository Repositorio para consultar en BD.
     */
    public PetControlller(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    /**
     * Este metodo devuelven el listado de pets
     * @return List<Pet> información de cada mascota
     */
    @GetMapping("/list")
    public List<Pet> hello(){
        return petRepository.findAll();
    }

    @PostMapping("/adopt/{id}")
    // RedirectView --> redirigir al navegador a otra URL desde un controlador.
    public Pet adopt(@PathVariable long id) {
        Pet pet = petRepository.findById(id).get();

        pet.setAdopt(true);
        return petRepository.save(pet); 
    }

    @PostMapping("/add")
    public Pet addPet(@ModelAttribute PetDto petDto) {
        Pet pet = new Pet();
        pet.setName(petDto.getName());
        pet.setBorn(petDto.getBorn());
        pet.setChip(petDto.getChip());
        pet.setCategory(petDto.getCategory());
        pet.setAdopt(false);
        
        return petRepository.save(pet);
    }
}
