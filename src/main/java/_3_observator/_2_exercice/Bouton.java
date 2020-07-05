package _3_observator._2_exercice;


import java.util.ArrayList;
import java.util.List;


public class Bouton {
    private List<Application> observers = new ArrayList<>();

    public void onClick(Application observer){
        observers.add(observer);
    }

    public void clic() {
        for (Application observer : observers){
            observer.enregistrer();
        }
    }

}
