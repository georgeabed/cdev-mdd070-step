package list_linkedlist.avecpattern;

import list_linkedlist.LinkedMaList;

import java.util.Iterator;

public class LinkedMaListIterator implements Iterator<String> {

    private LinkedMaList linkedMaList;
    private  int i = 0;

    public LinkedMaListIterator(LinkedMaList linkedMaList) {
        this.linkedMaList = linkedMaList;
    }


    @Override
    public boolean hasNext() {
        return i < this.linkedMaList.size();
    }

    @Override
    public String next() {
        String valeur = this.linkedMaList.get(i);
        i++;
        return valeur;
    }
}
