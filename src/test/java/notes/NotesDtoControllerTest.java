/*
package notes;

import notes.controller.NotesController;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

*/
/**
 * Created by vijay on 13/11/17.
 *//*

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NotesDtoControllerTest {

    @Autowired
    private NotesController loginDetailsController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(loginDetailsController).build();
    }

    @Ignore
    @Test
    public void testCreateMethod() throws Exception {
        String requestDto = "{\"userName\":\"vijay\",\"password\":\"12345678\"}";
        this.mockMvc.perform(post("/api/create").content(requestDto).contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));
    }

}
*/
