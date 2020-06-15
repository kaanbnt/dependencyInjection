package com.uniyaz;

/**
 * Ceket
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Tshirt implements Giyin {
    @Override
    public void giyin() {
        tshirtGiyin();
    }

    private void tshirtGiyin() {
        System.out.println("Hava Güneşli Lütfen Tshirt Giyin..");
    }
}
