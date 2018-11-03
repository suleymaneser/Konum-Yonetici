/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.KonumYonetici;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import view.Sabitler;

/**
 *
 * @author asimsinanyuksel
 */
public class OynatAction extends AbstractAction {

    private KonumYonetici konumYonetici;

    public OynatAction(KonumYonetici konumYonetici) {
        //ikonu ata
        super(Sabitler.OYNAT_ISIM, Sabitler.oynatIcon);
        this.konumYonetici = konumYonetici;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        konumYonetici.oynat();
    }

}
