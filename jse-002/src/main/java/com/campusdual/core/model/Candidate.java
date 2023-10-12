
package com.campusdual.core.model;

//importar para hacer visible una clase de un paquete diferente al actual
 import com.campusdual.core.services.Dummy;
/*
49:10
candidato a puesto de trabajo

Se sabe por estadisticas que el 90% de las candidatos son Mujeres y de Madrid.
Creo tantos constructores como objetos con distintos parametros necesito.

-Datos (estado)
nombre, sexo, dechaNacimiento, provincia(modificable), email
-id => se genere automaticamente partiendo del 10001 y se incremente en 1

- cuando quiero que objetos distintos compartan una variable tenemos el modificador Static

- Comportamiento(metodos)
- Crear candidatos
- Modificar datos individualmente
-Mostrar datos en pantalla
 */

public class Candidate{

    Dummy objeto = new Dummy();
    private static int sequence= 10001; //static(compartido) indica que tooos los metodos de esta clase la comparten

    private final int idCandidate;
    private final String name;
    private final char gender;
    private final String dateOfBirth;
    private String state;
    private final String emailAddress;


    // constructor crea el objeto y no devuelve nada
    //crea cualquier tipo de candidato

    public Candidate(String name, char gender, String dateOfBirth, String state, String emailAddress) {
        this.idCandidate = sequence;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.state = state;
        this.emailAddress = emailAddress;
        sequence++;
    }
// este constructor solo permite crear 'F' de Madrid
    public Candidate( String name, String dateOfBirth, String emailAddress) {
        this.idCandidate = sequence;
        this.name = name;
        this.gender = 'F';
        this.dateOfBirth = dateOfBirth;
        this.state = "Madrid";
        this.emailAddress = emailAddress;
        //incrementar en 1 la variable idCandidate
        sequence++;
    }

     public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Candidate.sequence = sequence;
    }

    public int getIdCandidate() {
        return idCandidate;
    }

    //modificar datos
    public void setState(String state) {
        this.state = state;
    }
//recuperar datos
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getState() {
        return state;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    //mostrar en pantalla


    public String toString() {
        return "Candidate{" +
                "id='" + idCandidate+ '\''+
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", state='" + state + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
