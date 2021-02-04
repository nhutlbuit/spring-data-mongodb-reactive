package com.ludus.translates.service;

import com.ludus.translates.criteria.TranslateCriteria;
import com.ludus.translates.model.Translate;
import reactor.core.publisher.Flux;

public interface TranslateService {
    Flux<Translate> findByParams(TranslateCriteria criteria);
}
