package com.javadevelopersguide.springboot.example;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;



/**

 *

 * @author manjusha_bhalerao

 *

 */

@Controller

@EnableAutoConfiguration

public class HelloWorldController {

@RequestMapping("/hello")

@ResponseBody

public String sayHello() {

return "Hello World Developer!!!";

}

}