package com.wen.test;

import com.wen.client.service.TestSoaService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author huwenwen
 * @since 16/9/4
 */
public class ConsumerServiceTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo.xml"});
    context.start();
    TestSoaService soaService = (TestSoaService) context.getBean("testService");
    System.out.println(soaService.getSoa());
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
