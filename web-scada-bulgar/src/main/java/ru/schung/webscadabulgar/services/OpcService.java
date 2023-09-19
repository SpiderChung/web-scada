package ru.schung.webscadabulgar.services;

import javafish.clients.opc.JCustomOpc;
import javafish.clients.opc.JEasyOpc;
import javafish.clients.opc.JOpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OpcService {
    private final JEasyOpc opcClient;

    @Autowired
    public OpcService(JEasyOpc opcClient) {
        this.opcClient = opcClient;
    }

    public Object readDataFromOpcServer(String tagName) {

//        log.debug("asdf");
        return opcClient.getFullOpcServerName();
    }
}
