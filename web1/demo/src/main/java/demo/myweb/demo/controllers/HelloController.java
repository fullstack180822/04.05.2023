package demo.myweb.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String getHello() {

        //  return "<h1 style=\"color:blue\">HELLO WORLD!</h1>";

        return "{'name': 'itay', id: 1}";
    }


}
