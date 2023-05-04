package demo.myweb.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping(value = "/order")
    public String getOrdersByParam(@RequestParam(value="orderId", defaultValue = "0") Integer orderId ,
                                    @RequestParam(value="name", defaultValue = "incognito") String name) {
        // localhost:8083/order?orderId=1&name=danny

        return String.format("{id:%d, name:'%s' }", orderId, name);
    }

    @GetMapping(value = "/order/{orderId}")
    public String getOrders(@PathVariable Integer orderId) {
        return String.format("{id:%d, name:'danny%d' }", orderId, orderId);
    }

}
