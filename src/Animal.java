public class Animal {
  // Atributos
  private int patas;
  private boolean mamifero;
  private String raza;
  private String color;

  // Constructor
  public Animal(int patas, boolean mamifero, String raza, String color) {
    this.patas = patas;
    this.mamifero = mamifero;
    this.raza = raza;
    this.color = color;
  }

  /*
   * void tipo(){
   * System.out.println("mamífero");}
   */

  void getAnimal() {
    String nacimiento;
    if (this.mamifero) {
      nacimiento = "es mamífero";
    } else {
      nacimiento = "no es mamífero";
    }

    System.out.println(
        "Mi " + this.raza + ", tiene " + this.patas + " patas, " + nacimiento + " y es de color " + this.color);
  }
}
