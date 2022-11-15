/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Essay2;

/**
 *
 * @author ACER
 */
public abstract class BangunDatar {
    String warna;

    String getName(){
        return warna;
    }

    void setWarna(String warna){
        this.warna=warna;
    }

    abstract float getLuas();
}