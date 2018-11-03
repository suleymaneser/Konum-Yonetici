/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.KonumYonetici;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author asimsinanyuksel
 */
public class AsagiGitAction implements ActionListener{
    private final KonumYonetici konumYonetici;
    public AsagiGitAction(KonumYonetici konumYonetici){
        this.konumYonetici=konumYonetici;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        konumYonetici.asagiGit();
  
    }  
}
