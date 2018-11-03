/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import action.AsagiGitAction;
import action.OynatAction;
import action.SagaGitAction;
import action.SolaGitAction;
import action.YukariGitAction;
import controller.KonumYonetici;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author asimsinanyuksel
 */
public class Uygulama extends JFrame implements KeyListener {

    private KonumYonetici konumYonetici;
    private final JButton hareketButton = new JButton(new ImageIcon(Sabitler.HAREKET_DUGME_RESIM_YOLU));
    private final JPanel hareketPanel = new JPanel();
    private final JPanel buttonPanel = new JPanel();
    private final JMenuBar menuBar = new JMenuBar();
    private final JButton sagButton = new JButton(Sabitler.SAG_DUGME_ISIM);
    private final JButton solButton = new JButton(Sabitler.SOL_DUGME_ISIM);
    private final JButton yukariButton = new JButton(Sabitler.YUKARI_DUGME_ISIM);
    private final JButton asagiButton = new JButton(Sabitler.ASAGI_DUGME_ISIM);

    public Uygulama(String baslik, int en, int boy) {

        konumYonetici = new KonumYonetici(hareketButton);
        setSize(en, boy);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(baslik);
        hareketButtonAyarla();
        menuAyarla();
        yonTuslariAyarla();
        ekranOrtasiniAyarla();
        bilesenEkle(buttonPanel, BorderLayout.SOUTH);
        bilesenEkle(hareketPanel, BorderLayout.NORTH);
        setFocusable(true);
        addKeyListener(this);

    }

    public void menuAyarla() {
        JMenu menu = new JMenu("Dosya");
        menu.add(new JMenuItem(new OynatAction(konumYonetici)));
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public void ekranOrtasiniAyarla() {
        int ekranGenislik = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int ekranYukseklik = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int uygulamaGenislik = getWidth();
        int uygulamaYukseklik = getHeight();
        setLocation((ekranGenislik - uygulamaGenislik) / 2, (ekranYukseklik - uygulamaYukseklik) / 2);

    }

    public void hareketButtonAyarla() {
        hareketButton.setSize(new Dimension(Sabitler.DUGME_EN, Sabitler.DUGME_BOY));
        hareketButton.setBorderPainted(true);
        hareketButton.setOpaque(true);
        hareketButton.setLocation(Sabitler.DUGME_BASLANGIC_X, Sabitler.DUGME_BASLANGIC_Y);
        hareketPanel.setPreferredSize(getSize());
        hareketPanel.setLayout(null);

        hareketPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                requestFocus();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        hareketPanel.add(hareketButton);
        konumYonetici = new KonumYonetici(hareketButton);
    }

    public void yonTuslariAyarla() {
        buttonPanel.setBorder(new BevelBorder(1));
        sagButton.addActionListener(new SagaGitAction(konumYonetici));
        solButton.addActionListener(new SolaGitAction(konumYonetici));
        asagiButton.addActionListener(new AsagiGitAction(konumYonetici));
        yukariButton.addActionListener(new YukariGitAction(konumYonetici));
        buttonPanel.add(solButton);
        buttonPanel.add(sagButton);
        buttonPanel.add(yukariButton);
        buttonPanel.add(asagiButton);

    }

    public void bilesenEkle(Component biselen, String konum) {
        add(biselen, konum);
    }

    /**
     * @return the konumYonetici
     */
    public KonumYonetici getKonumYonetici() {
        return konumYonetici;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                konumYonetici.sagaGit();

                break;
            case KeyEvent.VK_LEFT:

                konumYonetici.solaGit();
                break;
            case KeyEvent.VK_UP:

                konumYonetici.yukariGit();
                break;
            case KeyEvent.VK_DOWN:

                konumYonetici.asagiGit();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
