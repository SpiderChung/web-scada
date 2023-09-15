package ru.schung.webscadabulgar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.schung.webscadabulgar.services.OpcService;

@RestController
public class OpcController {

    private final OpcService opcService;

    @Autowired
    public OpcController(OpcService opcService) {
        this.opcService = opcService;
    }

    @GetMapping("/read")
    public ResponseEntity<Object> readOpcData(@RequestParam String tagName) {
        Object data = opcService.readDataFromOpcServer(tagName);
        return ResponseEntity.ok(data);
    }
}
