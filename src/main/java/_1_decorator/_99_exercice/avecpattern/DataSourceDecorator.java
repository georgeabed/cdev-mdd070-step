package _1_decorator._99_exercice.avecpattern;

import _1_decorator._99_exercice.DataSource;

public class DataSourceDecorator implements DataSource {

    protected DataSource wrappee;

    public DataSourceDecorator(DataSource dataSource){
        this.wrappee = dataSource;
    }

    public DataSourceDecorator() {

    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        String readData =  wrappee.readData();
        return readData;
    }
}
