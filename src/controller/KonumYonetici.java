/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JComponent;
import javax.swing.Timer;
import model.Konum;
import view.Sabitler;

/**
 *
 * @author asimsinanyuksel
 */
public class KonumYonetici {

    private JComponent bilesen;
    private int birim = Sabitler.HAREKET_BIRIM;
    private Timer timer = null;
    private Queue<Konum> konumlar = new LinkedList<>();
    private Queue<Konum> konumlarYedek = new LinkedList<>();

    public KonumYonetici(JComponent bilesen) {
        setBilesen(bilesen);
        Konum konum = new Konum();
        konum.setKonumX((int) bilesen.getLocation().getX());
        konum.setKonumY((int) bilesen.getLocation().getY());
        konumlar.add(konum);
    }

    public void sagaGit() {
        int konumX = (int) getBilesen().getLocation().getX();
        int konumY = (int) getBilesen().getLocation().getY();
        konumX = konumX + birim;
        getBilesen().setLocation(konumX, konumY);
        
        konumlar.add(new Konum(konumX, konumY));     
    }

    public void solaGit() {
        int konumX = (int) getBilesen().getLocation().getX();
        int konumY = (int) getBilesen().getLocation().getY();
        konumX = konumX - birim;
        getBilesen().setLocation(konumX, konumY);
        konumlar.add(new Konum(konumX, konumY));
        
    }

    public void asagiGit() {
        int konumX = (int) getBilesen().getLocation().getX();
        int konumY = (int) getBilesen().getLocation().getY();
        konumY = konumY + birim;
        getBilesen().setLocation(konumX, konumY);
        konumlar.add(new Konum(konumX, konumY));
        
    }

    public void yukariGit() {

        int konumX = (int) getBilesen().getLocation().getX();
        int konumY = (int) getBilesen().getLocation().getY();
        konumY = konumY - birim;
         getBilesen().setLocation(konumX, konumY);
        konumlar.add(new Konum(konumX, konumY));
       
    }

    public void oynat() {
        konumlarYedek.addAll(konumlar);
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (konumlarYedek.iterator().hasNext()) {
                    
                    Konum konum = konumlarYedek.remove();
                    
                    getBilesen().setLocation(konum.getKonumX(), konum.getKonumY());            
                } else {
                    timer.stop();
                }
            }
        });
        timer.start();

    }

    /**
     * @return the birim
     */
    public int getBirim() {
        return birim;
    }

    /**
     * @param birim the birim to set
     */
    public void setBirim(int birim) {
        this.birim = birim;
    }

    /**
     * @return the bilesen
     */
    public JComponent getBilesen() {
        return bilesen;
    }

    /**
     * @param bilesen the bilesen to set
     */
    public void setBilesen(JComponent bilesen) {
        this.bilesen = bilesen;
    }

}
