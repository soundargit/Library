//package com.krita.library.ws;
//
//import com.krita.library.Application;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.IntegrationTest;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.web.client.RestTemplate;
//
//import java.net.URL;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//
///**
// * Created by soundar on 22/02/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = {Application.class})
//@WebAppConfiguration
//@IntegrationTest({"server.port=0"})
//@Ignore
//public class BookLibraryWsImplIntTest {
//
//    @Value("${local.server.port}")
//    private int port;
//
//    private URL base;
//    private RestTemplate template;
//
//    @Before
//    public void setUp() throws Exception {
//        System.out.print("Port : " + port);
//        this.base = new URL("http://localhost:" + port + "/");
//        template = new TestRestTemplate();
//    }
//
//    @Test
//    public void getAllBookList() throws Exception {
//        ResponseEntity<String> response = template.getForEntity(getBookListURL(), String.class);
//        assertThat(response.getBody(), equalTo("BookList"));
//    }
//
//    public String getBookListURL() {
//        return base.toString() + "GetBookList";
//    }
//}