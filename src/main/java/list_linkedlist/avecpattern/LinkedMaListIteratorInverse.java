package list_linkedlist.avecpattern;

import list_linkedlist.LinkedMaList;

import java.util.Iterator;

public class LinkedMaListIteratorInverse implements Iterator<String> {

    private LinkedMaList linkedMaList;
    private  int i = 0;

    public LinkedMaListIteratorInverse(LinkedMaList linkedMaList) {
        this.linkedMaList = linkedMaList;
        this.i = linkedMaList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return 0 <= i;
    }

    @Override
    public String next() {
        String valeur = this.linkedMaList.get(i);
        i--;
        return valeur;
    }
}
