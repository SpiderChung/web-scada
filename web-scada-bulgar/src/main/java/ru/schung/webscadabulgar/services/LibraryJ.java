package ru.schung.webscadabulgar.services;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class LibraryJ {
    @PostConstruct
    public void init() {
        System.loadLibrary("JCustomOpc");
    }
}
