/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donnees.lecteursCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTxt {
    public LectureTxt(String chem) {
        FileReader monFichier = null;
        BufferedReader tampon = null;
        int kmax = 0;
        int sommet = 0;
        int identifiant1 = 0;
        int identifiant2 = 0;
        try {
            monFichier = new FileReader(chem);
            tampon = new BufferedReader(monFichier);
            // Lecture de la première ligne pour récupérer kmax
            String premiereLigne = tampon.readLine();
            kmax = Integer.parseInt(premiereLigne);
            System.out.println("Kmax  " + kmax);
            // Lecture de la deuxième ligne pour récupérer sommet
            String deuxiemeLigne = tampon.readLine();
            sommet = Integer.parseInt(deuxiemeLigne);
            System.out.println("nb sommet  " + sommet);
            // Lecture des lignes suivantes pour récupérer identifiant1 et identifiant2
            String ligne;
            while ((ligne = tampon.readLine()) != null) {
                String[] valeurs = ligne.split(" ");
                if (valeurs.length >= 2) {
                    identifiant1 = Integer.parseInt(valeurs[0]);
                    identifiant2 = Integer.parseInt(valeurs[1]);
                    System.out.println("Identifiant1 : " + identifiant1 + ", Identifiant2 : " + identifiant2);
                }
            }
        } catch (IOException | NumberFormatException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (tampon != null)
                    tampon.close();
                if (monFichier != null)
                    monFichier.close();
            } catch (IOException exception1) {
                exception1.printStackTrace();
            }
        }
    }
}
