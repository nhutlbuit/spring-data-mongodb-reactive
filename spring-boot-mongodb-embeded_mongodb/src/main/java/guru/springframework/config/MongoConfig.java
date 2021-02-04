package guru.springframework.config;

import java.io.IOException;
import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.*;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfig {

    @Value("${mongodb.contactpoints}")
    private String contactPoints;

    @Value("${mongodb.port}")
    private int port;

    @Value("${mongodb.db.name}")
    private String dbName;

    @Bean
    public MongoTemplate mongoTemplate() throws IOException {
        EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
        mongo.setBindIp(contactPoints);
        mongo.setPort(port);
        MongoClient mongoClient = mongo.getObject();
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, dbName);
        return mongoTemplate;
    }
}
