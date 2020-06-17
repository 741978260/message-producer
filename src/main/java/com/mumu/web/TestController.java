package com.mumu.web;

import com.mumu.channel.TestChannel;
import lombok.Data;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author cailin
 * @since 2020/6/17
 */
@RestController
public class TestController {
    private TestChannel testChannel;

    @GetMapping("/test")
    public void test() {
        A a = new A();
        a.setAge(18);
        a.setName("mumu");
        a.setSex("男");
        testChannel.testOutput().send(new GenericMessage<>(a));
    }

    @Data
    public static class A {
        private String name;
        private Integer age;
        private String sex;
    }
}
