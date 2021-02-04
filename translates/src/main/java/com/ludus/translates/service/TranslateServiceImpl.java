package com.ludus.translates.service;

import com.ludus.translates.criteria.TranslateCriteria;
import com.ludus.translates.model.Translate;
import com.ludus.translates.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import reactor.core.publisher.Flux;

public class TranslateServiceImpl implements TranslateService {
    @Autowired
    TranslateRepository repository;
    
    @Override
    public Flux<Translate> findByParams(TranslateCriteria criteria) {
        return repository.findAll();
    }
}
