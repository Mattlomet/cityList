package com.company.cityList.controller;


import com.company.cityList.models.City;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(CityListController.class)
public class CityListControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<City> cityList;

    @Before
    public void setUp(){

        cityList = new ArrayList<>();

        cityList.add(new City("New York","New York",8000000,false));
        cityList.add(new City("Newark","New Jersey",500000,false));
        cityList.add(new City("Miami","Florida",2000000,false));
        cityList.add(new City("Trenton","New Jersey",400000,true));


    }

    @Test
    public void shouldReturnListOfCities() throws Exception {

        String outPutList = mapper.writeValueAsString(cityList);

        mockMvc.perform(get("/city"))


    }





}
