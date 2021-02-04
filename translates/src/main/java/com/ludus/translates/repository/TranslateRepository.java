package com.ludus.translates.repository;

import com.ludus.translates.model.Translate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslateRepository extends ReactiveMongoRepository<Translate, String> {
}
