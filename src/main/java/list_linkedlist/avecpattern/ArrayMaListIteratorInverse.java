package list_linkedlist.avecpattern;

import list_linkedlist.ArrayMaList;

import java.util.Iterator;

public class ArrayMaListIteratorInverse implements Iterator<String> {

    private ArrayMaList arrayMaList;
    private int i = 0;

    public ArrayMaListIteratorInverse(ArrayMaList arrayMaList) {
        this.arrayMaList = arrayMaList;
        this.i = arrayMaList.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return 0 <= i;
    }

    @Override
    public String next() {
        String array = this.arrayMaList.get(i);
        i--;
        return array;
    }
}
