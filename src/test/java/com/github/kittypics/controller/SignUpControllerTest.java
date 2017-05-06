package com.github.kittypics.controller;

import com.github.kittypics.config.MainConfiguration;
import com.github.kittypics.dto.UserDTO;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by aishu on 6/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainConfiguration.class)
@EnableAutoConfiguration
@AutoConfigureMockMvc
@JsonTest
public class SignUpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Gson gson;

    @Test
    public void shouldCreateAccountOnUserSignup() throws Exception {

        UserDTO user = new UserDTO("Cookie", "pigeons", "cookie@ups.com");

        mockMvc.perform(MockMvcRequestBuilders.post("/signup")
                .contentType(MediaType.APPLICATION_JSON)
                .content(gson.toJson(user)))
                .andExpect(status().isOk());
    }
}
