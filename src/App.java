public class App {
    public static void main(String[] args) throws Exception {
        Car bmw = new Car(4, false, "Verde", "BMW");
        Car mercedes = new Car(4, false, "Azul", "MERCEDES");

        
        /* System.out.println(bmw.ruedas());
        mercedes.ruedas(); */

        bmw.getCar();
        mercedes.getCar();
        
        /* Instanciar una clase */
        Animal perro = new Animal(4,true,"Golden","Canela");
        /* Llamada al método "tipo" */
       // perro.tipo();
       perro.getAnimal();
    }

}
