package list_linkedlist;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Array List
        System.out.println("Les éléments d'Array list");
        ArrayMaList arrayMaList = new ArrayMaList();
        arrayMaList.add("Nom");
        arrayMaList.add("Prenom");

        arrayMaList.add(2, "Adresse" );

        for(Iterator<String> iterator = arrayMaList.iterator(); iterator.hasNext();){
            String valeur = iterator.next();
            System.out.println(valeur);
        }

        System.out.println("L'iterator inverse");
        for(Iterator<String> iterator = arrayMaList.iteratorInverse(); iterator.hasNext();){
            String valeur = iterator.next();
            System.out.println(valeur);
        }

        //Linked List
        System.out.println("Les éléments de Linked list");
        LinkedMaList linkedMaList = new LinkedMaList();
        linkedMaList.add("Nom");
        linkedMaList.add("Prenom");

        linkedMaList.add(2, "Adresse");

        for(Iterator<String> iterator = linkedMaList.iterator(); iterator.hasNext();){
            String valeur = iterator.next();
            System.out.println(valeur);
        }

        System.out.println("L'iterator inverse");
        for(Iterator<String> iterator = linkedMaList.iteratorInverse(); iterator.hasNext();){
            String valeur = iterator.next();
            System.out.println(valeur);
        }
    }

}
