import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] persona = {
            new Person("Juan", 25),
            new Person("Ana", 12),
            new Person("Carlos", 15),
            new Person("Jose", 85),
            new Person("Jaime", 95),
        };
        //Imprimir
        //Ordenar
        //Imprimir
        System.out.println("\" Antes de ordenar:");
        for (Person person : persona) {
            System.out.println(person);
        }

        PersonController personC = new PersonController();
        personC.sortPersonaByAge(persona);

        System.out.println("\" Ordenado:");
        for (Person person : persona) {
            System.out.println(person);
        }
    }
}
