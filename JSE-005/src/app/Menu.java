package app;

import models.Documento;

public class Menu {

  Documento doc;

  public Menu(Documento doc) {
    this.doc = doc;
  }

  public void showData() {
    System.out.println(doc.infoDoc());
  }

}
