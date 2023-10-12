package com.campusdual.execution;

import com.campusdual.core.model.Candidate;

//importa el contenido del paquete Pero NO EL DE LOS SUBPAQUETES
//import com.campusdual.core.services.*;
import com.campusdual.core.services.Dummy;
import com.campusdual.core.services.TestDummy;
import com.campusdual.core.services.msdos.Console;

import java.sql.SQLOutput;
//implicitamente importado
//import java.lang.

public class Test {
    public static void main(String[] args) {
        //crear dos candidatos
        // crear hombre Toledo
        Candidate candidate = new Candidate("Candidato1",'M',"03/01/68","Toledo","rasca@ht.com") ;
        //crear mujer Madrid
        Candidate candidate2 = new Candidate("Candidato2", "23/03/1988",  "casas2@htm.com");
        Candidate candidate3 = new Candidate("Candidato3", "23/03/1988",  "casas3@htm.com");

        // Mostrar en pantalla
        System.out.println(candidate.toString());
        System.out.println(candidate2.toString());
        System.out.println(candidate3.toString());

        //llamada por metodo static, pero tienen restricciones por eso es poco frecuente.
        System.out.println(Dummy.courseName());

        Dummy dummy = new Dummy();
        System.out.println("Resultado" + dummy.multiply(10,20));
        System.out.println("Doble minimo" + dummy.doubleMinimum());

        TestDummy  testDummy = new TestDummy();
        Console console = new Console();




    }


}
