package _1_decorator._99_exercice.avecpattern;

import _1_decorator._99_exercice.DataSource;
import _1_decorator._99_exercice.avecpattern.DataSourceDecorator;

import java.util.Base64;

/**
 * Classe réalisatio du cryptage.
 */
public class EncryptorDecorator extends DataSourceDecorator {

    public EncryptorDecorator(DataSource dataSource) {
        super(dataSource);
    }


    public String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    public String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}