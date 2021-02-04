package guru.springframework.repositories;

import guru.springframework.domain.Translate;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TranslateRepository extends ReactiveMongoRepository<Translate, String> {

   // @Query("delete from Translate t where t.baseText =:baseText")
    Mono<Long> deleteByBaseText(@Param("baseText") String baseText);
}
