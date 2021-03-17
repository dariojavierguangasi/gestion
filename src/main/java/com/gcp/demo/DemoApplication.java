package com.gcp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static Double calculateSquareArea(Double side) {
        return (side*side);
    }
    private static Double calcularTriangulo(Double base,Double altura){
        return (base*altura)/2;
    }
}
