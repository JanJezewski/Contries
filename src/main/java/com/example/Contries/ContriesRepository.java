package com.example.Contries;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Repository
public class ContriesRepository {
    Contries fetchContries(String code){
        RestTemplate restTemplate = new RestTemplate();
        Contries contries = restTemplate.getForObject(
                String.format(
                        "https://restcountries.com/v3.1/alpha?codes=col,pe,at",code),
                Contries.class
                );
        return contries;

    }
}
