package model;

import java.io.Serializable;

public interface AreaCalculavel {

    double calcularArea();

    default void imprimirArea(){
        System.out.println(calcularArea());
    }

}
