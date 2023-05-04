package demo.myweb.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Order implements Serializable {

    public Order() {

    }

    public Order(Integer id, String name) {
        this.id = id;
        this.customerName = name;
    }

    public Integer id;

    @JsonProperty(value = "name")
    public String customerName;

}
