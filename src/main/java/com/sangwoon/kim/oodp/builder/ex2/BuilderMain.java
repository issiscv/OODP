package com.sangwoon.kim.oodp.builder.ex2;

public class BuilderMain {

    public static void main(String[] args) {
        HttpRequest getRequest = new HttpRequest.Builder("GET", "https://example.com/api")
                .addHeader("Authorization", "Bearer token")
                .addParameter("query", "builder-pattern")
                .build();

        HttpRequest postReuqest = new HttpRequest.Builder("POST", "https://example.com/api")
                .addHeader("Authorization", "Bearer token")
                .setBody("{ \"name\": \"John\", \"age\": 30}")
                .build();

        System.out.println(getRequest);
        System.out.println(postReuqest);

    }

}
