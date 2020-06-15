package com.uniyaz;

/**
 * Insan
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Insan {
    Giyin giyin;

    public Insan(Giyin giyin) {
        this.giyin = giyin;
    }

    public void yazdir(){
        giyin.giyin();
    }
}
