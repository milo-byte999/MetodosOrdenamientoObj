package controllers;
import models.Person;

public class PersonController {
    
    //Ordena un arreglo de persona por edad(age)
    //Metodo de insercion
    public void sortPersonaByAge(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getAge()>aux.getAge()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }

    public void sortPersonaByName(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getName().compareTo()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }

}
