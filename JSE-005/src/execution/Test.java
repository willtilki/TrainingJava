package execution;

import code.Check;
import code.Delivery;
import code.Document;
import code.Invoice;
 /*
 un mismo objeto se puede comportar de diversas formas. El POLIMORFISMO está siempre
 relacionado con la herencia. La capacidad de un objeto de la clase base de comportarse , de ejecutar diferentes funciones
 siempre de sus clases derivadas
  */
public class Test {

    public static void main(String[] args) {
        // A objeto de la clase base se puede asignar cualquier objeto de cualquiera de sus clases derivadas.
        //U de cualquiera de sus clases derivadas
        Invoice invoice = new Invoice();
        Document document = invoice; //asigno obj. invoice a obj document( de la clase base)

        showData(document); // al objeto showData le paso un objeto que por declaraciòn es de la clase document

        Delivery delivery = new Delivery();
        document = delivery;

        showData(document);

        Check check = new Check();
        document = check;
        showData(document);

        //document.infoDoc();

       /* document = new Invoice(); // a un objeto de la clase base le puedo asignar
        document.infoDoc(); //Objeto document de la clase base.

        document = new Delivery();
        document.infoDoc();

        document = new Check(); // creo un objeto de Check y se lo asigno pq hereda de document
        document.infoDoc();

        */

        // A objeto de la clase derivada Nunca se puede asignar objeto de su clase base directamente
        //Invoice invoice = document;
    }
    private static void showData(Document doc) { //le paso nombre de la clase Document y parametro doc
        doc.infoDoc();
    }
}
