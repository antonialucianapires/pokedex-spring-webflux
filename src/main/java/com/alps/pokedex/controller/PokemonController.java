package com.alps.pokedex.controller;

import com.alps.pokedex.model.Pokemon;
import com.alps.pokedex.repository.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokedexRepository repository;

    @GetMapping
    public Flux<Pokemon> getAllPokemons() {
        return repository.findAll();
    }


}
