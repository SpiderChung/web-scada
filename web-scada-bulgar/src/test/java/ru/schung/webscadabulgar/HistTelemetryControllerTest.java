//package ru.schung.webscadabulgar;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import ru.schung.webscadabulgar.controllers.HistTelemetryController;
//import org.hamcrest.Matchers.*;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(HistTelemetryController.class)
//public class HistTelemetryControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void histTelemetryControllerTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/her"))
//                .andExpect(status().isOk());
////                .andExpect(view().name("home"))
////                .andExpect(content().string(containsString("Welcome to ...")));
//
//
//    }
//}
