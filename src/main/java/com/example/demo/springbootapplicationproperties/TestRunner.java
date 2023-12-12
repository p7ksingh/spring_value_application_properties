package com.example.demo.springbootapplicationproperties;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

 @Value("${sid}")
 private Integer sid;
 
 @Value("${sname}")
 private String sname;
 
 @Value("${sadd}")
 private String sadd;

 @Override
 public String toString() {
  return "TestRunner [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
 }



 @Override
 public void run(String... args) throws Exception {
  System.out.println(this.toString());
 }

}