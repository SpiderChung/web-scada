package ru.schung.webscadabulgar;

import javafish.clients.opc.JOpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import ru.schung.webscadabulgar.model.Student;

import javax.sql.DataSource;

@SpringBootApplication
public class WebScadaBulgarApplication {
//
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        return dataSourceBuilder.build();
//    }

    @Bean
    public JOpc opcClient() {
        return new JOpc("127.0.0.1", "22323", "MatrikonOPC");
    }
    public static void main(String[] args) {

        SpringApplication.run(WebScadaBulgarApplication.class, args);


    }

}
