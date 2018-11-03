/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author asimsinanyuksel
 */
public interface Sabitler {
    public static final int DUGME_EN=64;
    public static final int DUGME_BOY=64;
    public static final int DUGME_BASLANGIC_X=0;
    public static final int DUGME_BASLANGIC_Y=0;
    public static final String SAG_DUGME_ISIM="Sağa Git";
    public static final String SOL_DUGME_ISIM="Sola Git";
    public static final String ASAGI_DUGME_ISIM="Aşağı Git";
    public static final String YUKARI_DUGME_ISIM="Yukarı Git";
    public static final String HAREKET_DUGME_RESIM_YOLU="src/resimler/insan.png";
    public static final int HAREKET_BIRIM=5;
    public static final Icon oynatIcon = new ImageIcon("src/resimler/oynat.png");
    public static final String OYNAT_ISIM="Oynat";
}
