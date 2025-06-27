package com.expis.kafka.test;

import com.expis.kafka.example.test.HelloService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {

    @Test
    void hello_shouldReturnHelloMessage() {
        // given
        HelloService service = new HelloService();

        // when
        String result = service.sayHello();

        // then
        assertThat(result).isEqualTo("Hello, GitHub Actions!");
    }
}
