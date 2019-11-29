package sombrero;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    /**
     * JSON 변환을 위한 ObjectMapper 사용 시
     * ObjectMapper가 이미 빈으로 등록되어 있기 때문에
     * (spring-boot-starter-web 의존성만 추가해도 자동으로 빈으로 등록됨.)
     * 아래처럼 그냥 주입만 받아서 사용하면 됨.
     */
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$._links.self").exists());
        /**
         * /hello 호출 결과 JSON에 _links 정보가 있는지 확인. (기본적으로 _links 정보가 있음.)
         */
    }

}