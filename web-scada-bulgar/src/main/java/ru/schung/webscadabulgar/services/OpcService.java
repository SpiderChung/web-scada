package ru.schung.webscadabulgar.services;

import javafish.clients.opc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpcService {

    @Autowired
    private OpcClient opcClient;

    public Object readDataFromOpcServer(String tagName) {
        return opcClient.read(tagName);
    }
}