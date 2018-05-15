package main.java.springLearn.noSql.mongo;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "")
public class MongoConfig {
    @Bean
    public MongoFactoryBean mongo(){
        MongoFactoryBean mongo=new MongoFactoryBean();
        mongo.setHost("localhost");
        return mongo;
    }

    public MongoOperations mongoTemplate(Mongo mongo){
        return new MongoTemplate(mongo,"OrdersDB");
    }
}
