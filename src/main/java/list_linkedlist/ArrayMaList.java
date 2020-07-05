package list_linkedlist;


import list_linkedlist.avecpattern.ArrayMaListIterator;
import list_linkedlist.avecpattern.ArrayMaListIteratorInverse;

import java.util.Iterator;

public class ArrayMaList implements MaList {

    private String[] array = new String[10];
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (this.size >= this.array.length) {
            String[] newArray = new String[this.size * 2];

            // copier array dans newArray
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // on référence le nouveau tableau
            this.array = newArray;
        }
        this.array[size] = valeur;
        this.size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
            String arrayValeur = array[position];
            if(arrayValeur == null){
                array[position] = valeur;
                size++;
            } else {
                array[position] = valeur;
            }
    }

    @Override
    public String get(int position) {
        return this.array[position];
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayMaListIterator(this);
    }


    public Iterator<String> iteratorInverse() {
        return new ArrayMaListIteratorInverse(this);
    }
}
