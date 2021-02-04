package com.ludus.translates.controller;

import com.ludus.translates.model.Translate;
import com.ludus.translates.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/translate")
public class TranslateController {
    
    @Autowired
    TranslateRepository translateRepository;
    
    @GetMapping("/list")
    Flux<Translate> getList() {
        return translateRepository.findAll();
    }
    
    @PostMapping("/save")
    Mono<Translate> save(@RequestBody Translate translate) {
        return translateRepository.save(translate);
    }
}
