package list_linkedlist;

import list_linkedlist.avecpattern.LinkedMaListIterator;
import list_linkedlist.avecpattern.LinkedMaListIteratorInverse;

import java.util.Iterator;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private Node node = null;
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
            if(position == 0){
                first.setValeur(valeur);
            } else if (position == size-1){
                last.setValeur(valeur);
            } else {
                node = new Node();
                node.setValeur(valeur);
                last.setNext(node);
                size++;
            }
    }

    @Override
    public String get(int position) {
        String valeur;
        if (position == 0) {
            valeur = first.getValeur();
            return valeur;
        }
        if(position > 0 && position <size-1) {
            valeur = last.getValeur();
            node = last.getNext();

            return valeur;
        }
            return valeur = node.getValeur();
        }





    @Override
    public Iterator<String> iterator() {
        return new LinkedMaListIterator(this);
    }

    public Iterator<String> iteratorInverse() {
        return new LinkedMaListIteratorInverse(this);
    }

}
