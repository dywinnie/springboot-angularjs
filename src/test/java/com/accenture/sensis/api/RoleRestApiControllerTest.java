package com.accenture.sensis.api;

import com.accenture.sensis.controller.RoleRestApiController;
import com.accenture.sensis.domain.model.RoleModel;
import com.accenture.sensis.service.RoleService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by wdy on 2/7/17.
 */
//@RunWith(MockitoJUnitRunner.class)
public class RoleRestApiControllerTest {
    private MockMvc mockMvc;

    @Mock
    private RoleService roleServiceService;

    @InjectMocks
    private RoleRestApiController roleRestApiController;

    List<RoleModel> roleModels = new ArrayList<RoleModel>();

    @Before
    public void setUp(){
        this.mockMvc = standaloneSetup(new RoleRestApiController()).build();
    }

//    @Test
//    public void canListRoles() throws Exception {
//
//        this.mockMvc.perform(get("/api/roles/").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType("application/json"));
//
//    }
}
