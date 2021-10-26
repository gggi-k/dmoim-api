package kr.dmoim.test.controller;

import kr.dmoim.api.user.presentation.UserController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("사용자 엑셀 다운로드")
    void downloadExcelTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/users/excel"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
