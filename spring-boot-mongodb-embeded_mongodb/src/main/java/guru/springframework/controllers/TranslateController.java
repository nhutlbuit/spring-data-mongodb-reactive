package guru.springframework.controllers;

import guru.springframework.domain.Translate;
import guru.springframework.repositories.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class TranslateController {

    @Autowired
    private TranslateRepository translateRepository;

    @GetMapping("/translate")
    Flux<Translate> getList() {
        return translateRepository.findAll();
    }

    @PostMapping("/translate")
    Mono<Translate> save(@RequestBody Translate translate) {
        return translateRepository.save(translate);
    }

    @DeleteMapping("/translate")
    Mono<Long> delete(@RequestBody String baseText) {
        return translateRepository.deleteByBaseText(baseText);
    }
}
