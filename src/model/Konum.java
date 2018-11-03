/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asimsinanyuksel
 */
public class Konum {
    
    private int konumX;
    private int konumY;
    
    public Konum(int konumX,int konumY){
    
        this.konumX=konumX;
        this.konumY=konumY;
    }
    
      public Konum(){
    }
    
    
    /**
     * @return the konumX
     */
    public int getKonumX() {
        return konumX;
    }

    /**
     * @param konumX the konumX to set
     */
    public void setKonumX(int konumX) {
        this.konumX = konumX;
    }

    /**
     * @return the konumY
     */
    public int getKonumY() {
        return konumY;
    }

    /**
     * @param konumY the konumY to set
     */
    public void setKonumY(int konumY) {
        this.konumY = konumY;
    }
    
}
