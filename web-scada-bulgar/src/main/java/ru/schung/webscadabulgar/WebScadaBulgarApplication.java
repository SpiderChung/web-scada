package ru.schung.webscadabulgar;

import javafish.clients.opc.JCustomOpc;
import javafish.clients.opc.JEasyOpc;
import javafish.clients.opc.JOpc;
import javafish.clients.opc.property.PropertyLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import ru.schung.webscadabulgar.model.Student;

import javax.sql.DataSource;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Properties;

@SpringBootApplication
public class WebScadaBulgarApplication {
//
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        return dataSourceBuilder.build();
//    }

    @Bean
    public JEasyOpc opcClient() {


        return new JEasyOpc("127.0.0.1", "MatrikonOPC.opc", "MatrikonOPC");
    }
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().load("/Users/spiderchung/IdeaProjects/web-scada-bulgar/web-scada-bulgar/lib/JCustomOpc.dll");
        System.out.println(System.getProperty("java.library.path"));
//        System.load("/Users/spiderchung/IdeaProjects/web-scada-bulgar/web-scada-bulgar/lib/JCustomOpc.dll");
        System.setProperty("java.library.path", "/Users/spiderchung/IdeaProjects/web-scada-bulgar/web-scada-bulgar/lib/");
        SpringApplication.run(WebScadaBulgarApplication.class, args);


    }

}
