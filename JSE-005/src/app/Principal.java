package app;

import models.Check;
import models.Delivery;
import models.Documento;
import models.Invoice;

/*
 un mismo objeto se puede comportar de diversas formas. El POLIMORFISMO está siempre
 relacionado con la herencia. La capacidad de un objeto de la clase base de comportarse , de ejecutar diferentes funciones
 siempre de sus clases derivadas
  */
public class Principal {

  public static void main(String[] args) {
    // Siempre hay que tener una class para las vistas

    Invoice invoice = new Invoice();
    Documento doc = new Documento();

    Menu menu = new Menu(invoice);


    menu.showData();
  }
}
