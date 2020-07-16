package com.kb.rest.client;

import org.springframework.web.client.RestTemplate;

import com.kb.rest.model.User;

public class GetUserClient {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/SpringRestServiceSecurityBasic/rest/user/1";
        User user = restTemplate.getForObject(url, User.class);
        System.out.println("User retrieved details : ");
        System.out.println(user.getName() + " " + user.getAge() + " " + user.getId());

    }
}