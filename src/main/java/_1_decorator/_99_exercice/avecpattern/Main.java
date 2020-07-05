package _1_decorator._99_exercice.avecpattern;


import _1_decorator._99_exercice.DataSource;
import _1_decorator._99_exercice.FileDataSource;
import _1_decorator._99_exercice.avecpattern.CompressorDecorator;
import _1_decorator._99_exercice.avecpattern.EncryptorDecorator;

public class Main {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource dataSource = new FileDataSource("OutputDemo.txt");
        String encrypted = new EncryptorDecorator(dataSource).encode(salaryRecords);
        String encryptedAndCompressed = new CompressorDecorator(dataSource).compress(encrypted);

        dataSource.writeData(encryptedAndCompressed);
        String readData = dataSource.readData();



        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(readData);
        System.out.println("- Decoded --------------");
        String decompressed = new CompressorDecorator(dataSource).decompress(readData);
        String decodedAndDecompressed = new EncryptorDecorator(dataSource).decode(decompressed);
        System.out.println(decodedAndDecompressed);
    }
}