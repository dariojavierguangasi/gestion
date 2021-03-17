package com.gcp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Calcular área de triángulo\n2. Calcular área de cuadrado\n\nRespuesta: ");
        short option = leer.nextShort();
        switch (option) {
            case 1:
                try {
                    System.out.println("Base: ");
                    double base = leer.nextDouble();
                    System.out.println("Altura: ");
                    double height = leer.nextDouble();
                    if(base >0 && height > 0) {
                        System.out.println("Área: " + calculateTriangleArea(base, height).toString() + "\n\n");
                    } else {
                        System.out.println("\n\nerror\n\n");
                    }
                } catch (Exception ex) {
                    System.out.println("\n\nerror\n\n");
                }

                break;

            case 2:
                try {
                    System.out.println("Lado: ");
                    double side = leer.nextDouble();
                    if(side > 0) {
                        System.out.println("Área: " + calculateSquareArea(side).toString() + "\n\n");
                    } else {
                        System.out.println("\n\nerror\n\n");
                    }
                } catch (Exception ex ) {
                    System.out.println("\n\nerror\n\n");
                }
                break;

            default:
                System.out.println("\n\nElije una opción válida\n\n");
                break;
        }
    }

    public static Double calculateSquareArea(Double side) {
        return (side*side);
    }
    private static Double calculateTriangleArea(Double base,Double altura){
        return (base*altura)/2;
    }
}
