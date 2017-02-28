package com.am.ss.configuration;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by w on 2/6/17.
 */
@Configuration
//@EnableJpaRepositories(basePackages = "com.accenture.sensis.domain.repository",
//        entityManagerFactoryRef = "entityManagerFactory",
//        transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class BeanConfiguration {

    @Bean(name = "objectMapper")
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }

}
