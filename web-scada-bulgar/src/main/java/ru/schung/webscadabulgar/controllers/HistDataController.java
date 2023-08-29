package ru.schung.webscadabulgar.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;
import ru.schung.webscadabulgar.model.HistoryTelemetry;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/objects")
public class HistDataController {

    @PostMapping("/histData")
    @ResponseBody
    List<HistoryTelemetry> histData(@RequestBody List<String> props,
                                    @RequestParam(name = "startDt") Long startDt,
                                    @RequestParam(name = "endDt") Long endDt) {
        return personDa
    }
}

