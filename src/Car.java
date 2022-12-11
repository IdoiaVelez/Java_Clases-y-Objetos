public class Car {
  /* Atributos */
  private int ruedas;
  private boolean biplaza;
  private String color;
  private String marca;

  /* Constructor */
  public Car(int ruedas, boolean biplaza, String color, String marca) {
    this.ruedas = ruedas;
    this.biplaza = biplaza;
    this.color = color;
    this.marca = marca;
  }

  /* GETTERS & SETTERS */
  void setRuedas(int ruedas) {
    this.ruedas = ruedas;
  }

  int getRuedas() {
    return this.ruedas;
  }

  void setBiplaza(boolean biplaza) {
    this.biplaza = biplaza;
  }

  boolean getBiplaza() {
    return this.biplaza;
  }

  void setColor(String color) {
    this.color = color;
  }

  String getColor(){
    return this.color;
  }

  void setMarca(String marca){
    this.marca = marca;
  }

  String getMarca(){
    return this.marca;
  }

  /* METODOS */
  void getCar() {
    String plazas;
    if (this.biplaza) {
      plazas = "es biplaza.";
    } else {
      plazas = "tiene cuatro plazas.";
    }
    System.out.println(
        "Mi " + this.marca + ", tiene " + this.ruedas + " ruedas, que es de color " + this.color + ", y " + plazas);
  }
}