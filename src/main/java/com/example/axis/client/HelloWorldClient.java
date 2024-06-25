package com.example.axis.client;

import com.example.axis.service.HelloWorldService;
import com.example.axis.service.HelloWorldServiceServiceLocator;
import com.example.axis.service.HelloWorldService_PortType;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            HelloWorldServiceServiceLocator locator = new HelloWorldServiceServiceLocator();
            HelloWorldService_PortType service = locator.getHelloWorldService();

            String response = service.sayHello("World");
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
