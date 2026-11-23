/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donnees.lecteursCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureCsvAeroport {
    public LectureCsvAeroport(String chem){
        FileReader monFichier = null; // si différent de null , erreur car pas initialisé
        BufferedReader tampon = null; // si différent de null , erreur car pas initialisé
        try {
            monFichier = new FileReader(chem);
            tampon = new BufferedReader(monFichier);
            
            while (true) {
                // lit une ligne et la transmet a la variable ligne
                String ligne = tampon.readLine();
                // déterminer la fin du fichier
                if (ligne == null) {
                    break;
                }
                // séparer les valeurs par une partie en plus (ici une virgule)
                String[] valeurs = ligne.split(";");
                String[] noms = {"Aeroport :", "Lieu :", "dd", "ddd", "ggg", "fff", "dddd", "oooo", "dddf", "llll"};
                
                for (int i = 0; i < valeurs.length; i++) {
                    System.out.print(noms[i] + " " + valeurs[i] + " | ");
                }
                System.out.println(); // passer à la ligne suivante après avoir affiché les valeurs
            } 
        } catch (IOException exception) {
            exception.printStackTrace();
        } 
        // vérifier la bonne fermeture des fichiers
        finally {
            try {
                if (tampon != null)
                    tampon.close();
                if (monFichier != null)
                    monFichier.close();
            } catch (IOException exception1) {
                exception1.printStackTrace();
            }
        }
    } // Fin de main
}
