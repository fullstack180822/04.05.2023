package demo.myweb.demo.controllers;

import demo.myweb.demo.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {

    // Targil:
    // GET
    // GET -- query params
    // GET/ID
    // POST
    // PUT/ID -- update/add
    // DELETE/ID
    // PATCH/ID -- update only if exists

    ArrayList<Order> orders = new ArrayList<>(Arrays.asList(new Order(1, "Computer"), new Order(2, "Television"),
            new Order(3, "Sport car")));

    @GetMapping(value = "/order_params")
    public Order getOrdersByParam(@RequestParam(value="id", defaultValue = "0") Integer id ,
                                    @RequestParam(value="name", defaultValue = "incognito") String name) {
        // localhost:8083/order?orderId=1&name=danny
        Order order = new Order(id, name);
        return order;
    }

    @GetMapping(value = "/order")
    public List<Order> getOrdersByParam() {
        return orders;
    }


    @GetMapping(value = "/order/{id}")
    public String getOrders(@PathVariable Integer id) {
        return String.format("{id:%d, name:'danny%d' }", id, id);
    }

    @PostMapping(value = "/order")
    public Order postOrder(@RequestBody Order order) {
        return order;
    }

    @GetMapping(value = "/order_header/{id}")
    public String getOrdersWithHeader(@RequestHeader("clientToken") String clientToken, @PathVariable Integer id) {
        return String.format("{id:%d, name:'danny%d', token:%s }", id, id, clientToken);
    }

}
