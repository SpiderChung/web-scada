package ru.schung.webscadabulgar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpcController {

    @Autowired
    private OpcService opcService;

    @GetMapping("/read")
    public ResponseEntity<Object> readOpcData(@RequestParam String tagName) {
        Object data = opcService.readDataFromOpcServer(tagName);
        return ResponseEntity.ok(data);
    }
}
