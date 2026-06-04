package main.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map; 

public  class Main {
    public static void main(String[] args){
        System.out.println("--- Executing Maven Demo Application ---");

        // Using our Jackson dependency to serialize a simple map to a JSON string
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> statusMap = new HashMap<>();
        statusMap.put("status", "Success");
        statusMap.put("message", "Maven Dependency Management is working flawlessly!");

        try {
            String jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(statusMap);
            System.out.println(jsonResult);
        } catch (Exception e) {
            System.err.println("Error processing JSON: " + e.getMessage());
        }
    }
}