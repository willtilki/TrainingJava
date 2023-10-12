package com.campusdual.core.services;

public class Dummy {
    private static  int maximum = 100;
    private int minimum = 10;
    private static String getDate() {
        return "21/04/2022";
    }

    private String getTime(){
        return "19:17";
    }

    /*
   Metodo que devuelva una cadena con el nombre del curso
   Método static => Se puede ejecutar con el nombre de la clase sin necesidad de crear un objeto
   esto permite llamar al metodo por el nombre de clase sin necesidad de crear objetos objetos (en desuso)
   NO podemos utilizar dentro de su código "miembros" (variables y funciones) no static directamente.
   SI podemos utilizar dentro de su código "miembros" (variables y funciones) static directamente.
     */
    public static String courseName(){
        return "Java JSE8" + maximum + " " + getDate() /* + " "+ getTime()*/;

    }
    //Método para devolver el producto de dos enteros
    public int multiply(int oper1, int oper2){
       return oper1*oper2;
    }

    //Método para devolver el doble del minimo
    public int doubleMinimum(){
        return minimum * 2;
    }

}
