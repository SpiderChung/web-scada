package ru.schung.webscadabulgar;

import javafish.clients.opc.JOpc;
import org.jeasyopc.client.OPCClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebScadaBulgarApplication {

    @Bean
    public JOpc opcClient() {
        JOpc opcClient = new JOpc();
        return opcClient;
    }
    public static void main(String[] args) {

        SpringApplication.run(WebScadaBulgarApplication.class, args);


    }

}
