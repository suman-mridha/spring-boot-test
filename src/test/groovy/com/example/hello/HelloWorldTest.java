package com.example.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    HelloWorld tested = new HelloWorld();
    
    @Test
    void sayHello() {
       Assertions.assertEquals("Hello Suman", tested.sayHello("Suman"));
    }
}
