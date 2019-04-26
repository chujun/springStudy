package com.jun.chu.demo.core1i3;

import com.jun.chu.demo.core1i3.ClientService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jun.chu
 * @date 2019-04-26 16:28
 */
public class Application {
    @Test
    public void factoryMethod() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        ClientService clientService = (ClientService) applicationContext.getBean("clientService");
    }
}
