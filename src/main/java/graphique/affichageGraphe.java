/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphique;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class affichageGraphe extends JFrame{
    JComboBox liste_algo;
    JComboBox liste_vol;
    JPanel panel = new JPanel();
    public affichageGraphe(){
        this.setTitle("affichagegraphe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }
    public void init(){
        String nom_algo[] = {"Glouton","DSatur"};
        liste_algo = new JComboBox(nom_algo);
        liste_vol = new JComboBox();
    }
}
