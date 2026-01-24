package net.siwula.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ApiController.class)
@DisplayName("ApiController Tests")
class ApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Should return 'Hello, World!' when no name is provided")
    void sayHello_ShouldReturnHelloWorld_DefaultName() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }

    @Test
    @DisplayName("Should return 'Hello, John!' when name=John is provided")
    void sayHello_ShouldReturnHelloName_WithProvidedName() throws Exception {
        mockMvc.perform(get("/hello")
                        .param("name", "John"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, John!"));
    }

    @Test
    @DisplayName("Should handle special characters in name")
    void sayHello_ShouldHandleSpecialCharacters() throws Exception {
        mockMvc.perform(get("/hello")
                        .param("name", "John Doe"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, John Doe!"));
    }
}
