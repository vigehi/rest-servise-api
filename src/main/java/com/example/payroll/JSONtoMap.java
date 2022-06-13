package com.example.payroll;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoMap {

    public static final String json = "{\"B\":\"b\",\"A\":\"a\",\"C\":\"c\"}";

    public static class POJO{

        private Map<String,String> map = new TreeMap<String,String>();

        @JsonAnyGetter
        public Map<String, String> get() {
            return map;
        }

        @JsonAnySetter
        public void set(String name, String value) {
            map.put(name, value);
        }

    }

    @Test
    public final void test() throws JsonProcessingException, IOException {
        ObjectMapper jsonmapper = new ObjectMapper();
        POJO p = jsonmapper.readValue(json, POJO.class);
        assertEquals(jsonmapper.writeValueAsString(p),json);    
    }

}