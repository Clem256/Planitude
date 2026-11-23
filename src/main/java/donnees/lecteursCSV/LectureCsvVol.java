/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donnees.lecteursCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */


public class LectureCsvVol {

    public LectureCsvVol(String chem) {
        FileReader monFichier = null;
        BufferedReader tampon = null;
        try {
            monFichier = new FileReader(chem);
            tampon = new BufferedReader(monFichier);

            while (true) {
                String ligne = tampon.readLine();
                if (ligne == null) {
                    break;
                }
                String[] valeurs = ligne.split(";");
                String[] noms = {"Nom :", "LME :", "MLH :", "départ", "d", "durrée"};
                String txt = "";
                for (int i = 0; i < valeurs.length; i++) {
                    if (i == 3) {
                        System.out.print(txt + noms[i] + " " + valeurs[i] + "h" + valeurs[i + 1] + " | ");
                        i++;
                    } else if (i == 5) { 
                        System.out.print(noms[i] + " " + valeurs[i] + " | ");
                    } else {
                        txt = txt + noms[i] + " " + valeurs[i] + " | ";
                    }
                }
                System.out.println(); 
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (tampon != null) {
                    tampon.close();
                }
                if (monFichier != null) {
                    monFichier.close();
                }
            } catch (IOException exception1) {
                exception1.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Utilisation de la classe LectureCsvVol
        String chemin = "chemin/vers/votre/fichier.csv";
        new LectureCsvVol(chemin);
    }
}
