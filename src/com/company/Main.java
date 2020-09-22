package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    static int multiply(int a, int b) {
        int c = 0;
        int i;
        for (i = 1; i <= b; i = i + 1) {
            c = c + a;
        }
        return c;
    }

    static int min(int a, int b) {
        int c;
        if (a > b) {
            c = b;
        } else {
            c = a;
        }
        return c;
    }

    static int abs(int a) {
        if (a <= 0) {
            a = a * (-1);
        }
        return a;

    }

    static boolean isCorrectDate(int a, int b, int c) {
        boolean d;
        int annee = a;
        int mois = b;
        int jour = c;

        boolean resultat_if;
        if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
            resultat_if = true;
        } else {
            resultat_if = false;
        }
        if (annee <= 2020) {
            if (!resultat_if) {


                if ((mois <= 12) && mois > 0) {
                    if ((jour <= 30) && jour > 0 && mois != 2) {
                        d = true;
                    } else {
                        if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                            d = true;
                        } else {

                            d = false;
                        }

                    }
                } else {
                    d = false;
                }
            } else {

                if (mois != 2) {
                    if ((jour <= 30) && jour > 0) {
                        d = true;
                    } else {
                        if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                            d = true;
                        } else {

                            d = false;
                        }

                    }
                    d = true;
                } else {
                    if (jour <= 29) {
                        d = true;
                    } else {
                        d = false;
                    }
                }
            }
        } else {
            d = false;
        }
        return d;
    }

    static boolean isLeapYear(int a) {
        boolean b;
        int annee = a;

        if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    static int power(int a, int b) {
        int c = 1;

        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }

    static void displayMultTable(int a) {
        int N = 0;
        int b;
        while (N != 10) {
            b = a * N;
            N++;
            out.println(b);
        }
    }

    static int integerMirror(int a) {
        int nbr = a;
        int reste;
        int resultat = 0;

        while (nbr > 0) {
            reste = nbr % 10;
            nbr = nbr / 10;
            resultat = resultat * 10 + reste;
        }
        return resultat;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero_ex = 1;
            String profil = "";
            while (numero_ex != 0) {
                out.println("veuillez saisir le profil : ");
                profil = sc.nextLine();
                if (profil.equals("Christopher")) {
                    while (numero_ex != 0) {
                        out.println("Bonjour Christopher . ");
                        out.println("tout tes cours sont la ");
                        out.println(" ");
                        out.println("Veuillez saisir le numero de l'exercice : ");
                        numero_ex = sc.nextInt();

                        if (numero_ex == 2) {

                            out.println("Veuillez saisir une valeur :");
                            int A = sc.nextInt();
                            out.println("Veuillez saisir une valeur :");
                            int B = sc.nextInt();

                            if ((A * B) > 0) {
                                out.println("Le produit est positif . ");
                            } else {
                                out.println("Le produit est négatif . ");
                            }
                        }
                        if (numero_ex == 3) {
                            out.println("Veuillez saisir votre age :");
                            int age = sc.nextInt();

                            if (age < 18) {
                                out.println("Vous êtes mineur .");
                            } else {
                                if (age > 100) {
                                    out.println("Désoler mais non en faite ! ");
                                } else {
                                    out.println("Vous êtes majeur .");
                                }

                            }
                        }
                        if (numero_ex == 4) {
                            out.println("Veuillez saisir votre note :");
                            int note_eleve = sc.nextInt();


                            if (note_eleve < 10) {
                                out.println("rattrapage !");
                            } else {
                                if (note_eleve < 12) {
                                    out.println("pas de mention !");
                                } else {
                                    if (note_eleve < 14) {
                                        out.println("assez bien !");
                                    } else {
                                        if (note_eleve < 16) {
                                            out.println("bien !");
                                        } else {
                                            if (note_eleve < 18) {
                                                out.println("très bien !");
                                            } else {
                                                if (note_eleve <= 20) {
                                                    out.println("excellent !");
                                                } else {
                                                    out.println("Tricheur");
                                                }
                                            }
                                        }
                                    }
                                }

                            }

                        }
                        if (numero_ex == 5) {

                            out.println("Veuillez saisir un nombre pair ou impair : ");
                            int Nombre = sc.nextInt();

                            if ((Nombre % 2) == 0) {
                                out.println("Le nombre est pair .");
                            } else {
                                out.println("Le nombre est impaire .");
                            }

                        }
                        if (numero_ex == 6) {

                            out.println("Veuillez entrer une année : ");
                            int annee = sc.nextInt();

                            if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
                                out.println("L'année est bissextile .");
                            } else {
                                out.println("L'année n'est pas bissextile .");
                            }

                        }
                        if (numero_ex == 7) {
                            out.println("Veuillez entrer une année : ");
                            int annee = sc.nextInt();
                            out.println("Veuillez entrer un mois : ");
                            int mois = sc.nextInt();
                            out.println("Veuillez entrer un jour : ");
                            int jour = sc.nextInt();

                            boolean resultat_if;
                            if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
                                resultat_if = true;
                            } else {
                                resultat_if = false;
                            }

                            if (annee <= 2020) {
                                if (!resultat_if) {


                                    if ((mois <= 12) && mois > 0) {
                                        if ((jour <= 30) && jour > 0 && mois != 2) {
                                            out.println("la date " + jour + "/" + mois + "/" + annee + " existe .");
                                        } else {
                                            if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                                                out.println("la date " + jour + "/" + mois + "/" + annee + " existe  . ");
                                            } else {

                                                out.println("le jour n'existe pas");
                                            }

                                        }
                                    } else {
                                        out.println("le mois n'existe pas");
                                    }
                                } else {

                                    if (mois != 2) {
                                        if ((jour <= 30) && jour > 0) {
                                            out.println("la date " + jour + "/" + mois + "/" + annee + " existe .");
                                        } else {
                                            if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                                                out.println("la date " + jour + "/" + mois + "/" + annee + " existe  . ");
                                            } else {

                                                out.println("le jour n'existe pas");
                                            }

                                        }
                                        out.println("la date " + jour + "/" + mois + "/" + annee + " existe .=== ");
                                    } else {
                                        if (jour <= 29) {
                                            out.println("la date " + jour + "/" + mois + "/" + annee + " existe . ");
                                        } else {
                                            out.println("la date n'existe pas");
                                        }
                                    }
                                }
                            } else {
                                out.println("l'année n'existe pas encore !");
                            }
                        }
                        if (numero_ex == 8) {
                            int N = 0;
                            while (N != 100) {
                                out.println(N);
                                N = N + 1;
                            }
                            while (N != 0) {
                                out.println(N);
                                N = N - 1;
                            }

                        }
                        if (numero_ex == 9) {
                            int N = 0;
                            while (N != 100) {
                                N = N + 1;
                                if ((N % 3) == 0) {
                                    out.println(N);
                                }
                            }
                        }
                        if (numero_ex == 10) {
                            int i;
                            for (i = 0; i <= 100; i = i + 3) {
                                out.println(i);
                            }
                        }
                        if (numero_ex == 11) {
                            out.println("entrer un chiffre .");
                            int a = sc.nextInt();
                            out.println("entrer la puissance .");
                            int b = sc.nextInt();
                            int c = 1;

                            for (int i = 0; i < b; i++) {
                                c = c * a;
                            }
                            out.println(c);
                        }
                        if (numero_ex == 12) {
                            out.println("entrer un chiffre pour connaitre sa table :");
                            int a = sc.nextInt();
                            int N = 0;
                            while (N != 10) {
                                out.println(a * N);
                                N++;
                            }
                        }
                        if (numero_ex == 13) {
                            out.println("entrer une valeur :");
                            int N = sc.nextInt();
                            out.println("entrer une limite :");
                            int M = sc.nextInt();
                            int c = 1;
                            int d = 1;

                            for (int i = 0; i < N; i++) {
                                if (c < M) {
                                    c = d + c;
                                    d = d + 1;
                                    out.println(c);
                                }
                            }
                        }
                        if (numero_ex == 14) {
                            out.println("entrer une nombre :");
                            int nbr = sc.nextInt();
                            int reste;
                            int resultat = 0;

                            while (nbr > 0) {
                                reste = nbr % 10;
                                nbr = nbr / 10;
                                resultat = resultat * 10 + reste;
                            }
                            out.println("Le resultat est " + resultat);
                        }
                        if (numero_ex == 15) {
                            out.println("entrer la valeur N :");
                            int N = sc.nextInt();
                            int a = 1000;
                            while (a > 0) {
                                if ((N % 2) == 0) {
                                    N = N / 2;
                                    out.println(N);
                                } else {
                                    N = N * 3 + 1;
                                    out.println(N);
                                }
                                a = a - 1;
                            }
                        }
                        if (numero_ex == 16) {
                            int A = 4;
                            int B = 7;
                            int resultat = 0;
                            displayMultTable(3);
                        }
                        if (numero_ex == 17) {
                            out.println("donnez votre taille (cm)");
                            int taille = sc.nextInt();
                            if (taille >= 190) {
                                out.println("Grande Taille .");
                            }
                            if (taille < 190 && taille >= 170) {
                                out.println("Taille moyenne .");
                            }
                            if (taille < 170 && taille >= 150) {
                                out.println("Petite taille .");
                            }
                            if (taille < 150 && taille >= 50) {
                                out.println("la c'est chaud frere ");
                            }
                        }
                        if (numero_ex == 18) {          // labyrinthe


                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 2; j++) {
                                    out.println(0);
                                }
                            }
                        }
                        if (numero_ex == 19) {

                        }
                    }
                }
                if (profil.equals("save")) {
                    out.println("ici toute les sauvegardes des codes sont stockés donc tu ne peux y accéder par la console .");
                    if (numero_ex == 2) {

                        out.println("Veuillez saisir une valeur :");
                        int A = sc.nextInt();
                        out.println("Veuillez saisir une valeur :");
                        int B = sc.nextInt();

                        if ((A * B) > 0) {
                            out.println("Le produit est positif . ");
                        } else {
                            out.println("Le produit est négatif . ");
                        }
                    }
                    if (numero_ex == 3) {
                        out.println("Veuillez saisir votre age :");
                        int age = sc.nextInt();

                        if (age < 18) {
                            out.println("Vous êtes mineur .");
                        } else {
                            if (age > 100) {
                                out.println("Désoler mais non en faite ! ");
                            } else {
                                out.println("Vous êtes majeur .");
                            }

                        }
                    }
                    if (numero_ex == 4) {
                        out.println("Veuillez saisir votre note :");
                        int note_eleve = sc.nextInt();


                        if (note_eleve < 10) {
                            out.println("rattrapage !");
                        } else {
                            if (note_eleve < 12) {
                                out.println("pas de mention !");
                            } else {
                                if (note_eleve < 14) {
                                    out.println("assez bien !");
                                } else {
                                    if (note_eleve < 16) {
                                        out.println("bien !");
                                    } else {
                                        if (note_eleve < 18) {
                                            out.println("très bien !");
                                        } else {
                                            if (note_eleve <= 20) {
                                                out.println("excellent !");
                                            } else {
                                                out.println("Tricheur");
                                            }
                                        }
                                    }
                                }
                            }

                        }

                    }
                    if (numero_ex == 5) {

                        out.println("Veuillez saisir un nombre pair ou impair : ");
                        int Nombre = sc.nextInt();

                        if ((Nombre % 2) == 0) {
                            out.println("Le nombre est pair .");
                        } else {
                            out.println("Le nombre est impaire .");
                        }

                    }
                    if (numero_ex == 6) {

                        out.println("Veuillez entrer une année : ");
                        int annee = sc.nextInt();

                        if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
                            out.println("L'année est bissextile .");
                        } else {
                            out.println("L'année n'est pas bissextile .");
                        }

                    }
                    if (numero_ex == 7) {
                        out.println("Veuillez entrer une année : ");
                        int annee = sc.nextInt();
                        out.println("Veuillez entrer un mois : ");
                        int mois = sc.nextInt();
                        out.println("Veuillez entrer un jour : ");
                        int jour = sc.nextInt();

                        boolean resultat_if;
                        if ((annee % 4) == 0 & (annee % 100) != 0 || (annee % 400) == 0) {
                            resultat_if = true;
                        } else {
                            resultat_if = false;
                        }

                        if (annee <= 2020) {
                            if (!resultat_if) {


                                if ((mois <= 12) && mois > 0) {
                                    if ((jour <= 30) && jour > 0 && mois != 2) {
                                        out.println("la date " + jour + "/" + mois + "/" + annee + " existe .");
                                    } else {
                                        if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                                            out.println("la date " + jour + "/" + mois + "/" + annee + " existe  . ");
                                        } else {

                                            out.println("le jour n'existe pas");
                                        }

                                    }
                                } else {
                                    out.println("le mois n'existe pas");
                                }
                            } else {

                                if (mois != 2) {
                                    if ((jour <= 30) && jour > 0) {
                                        out.println("la date " + jour + "/" + mois + "/" + annee + " existe .");
                                    } else {
                                        if (jour == 31 && mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                                            out.println("la date " + jour + "/" + mois + "/" + annee + " existe  . ");
                                        } else {

                                            out.println("le jour n'existe pas");
                                        }

                                    }
                                    out.println("la date " + jour + "/" + mois + "/" + annee + " existe .=== ");
                                } else {
                                    if (jour <= 29) {
                                        out.println("la date " + jour + "/" + mois + "/" + annee + " existe . ");
                                    } else {
                                        out.println("la date n'existe pas");
                                    }
                                }
                            }
                        } else {
                            out.println("l'année n'existe pas encore !");
                        }
                    }
                    if (numero_ex == 8) {
                        int N = 0;
                        while (N != 100) {
                            out.println(N);
                            N = N + 1;
                        }
                        while (N != 0) {
                            out.println(N);
                            N = N - 1;
                        }

                    }
                    if (numero_ex == 9) {
                        int N = 0;
                        while (N != 100) {
                            N = N + 1;
                            if ((N % 3) == 0) {
                                out.println(N);
                            }
                        }
                    }
                    if (numero_ex == 10) {
                        int i;
                        for (i = 0; i <= 100; i = i + 3) {
                            out.println(i);
                        }
                    }
                    if (numero_ex == 11) {
                        out.println("entrer un chiffre .");
                        int a = sc.nextInt();
                        out.println("entrer la puissance .");
                        int b = sc.nextInt();
                        int c = 1;

                        for (int i = 0; i < b; i++) {
                            c = c * a;
                        }
                        out.println(c);
                    }
                    if (numero_ex == 12) {
                        out.println("entrer un chiffre pour connaitre sa table :");
                        int a = sc.nextInt();
                        int N = 0;
                        while (N != 10) {
                            out.println(a * N);
                            N++;
                        }
                    }
                    if (numero_ex == 13) {
                        out.println("entrer une valeur :");
                        int N = sc.nextInt();
                        out.println("entrer une limite :");
                        int M = sc.nextInt();
                        int c = 1;
                        int d = 1;

                        for (int i = 0; i < N; i++) {
                            if (c < M) {
                                c = d + c;
                                d = d + 1;
                                out.println(c);
                            }
                        }
                    }
                    if (numero_ex == 14) {
                        out.println("entrer une nombre :");
                        int nbr = sc.nextInt();
                        int reste;
                        int resultat = 0;

                        while (nbr > 0) {
                            reste = nbr % 10;
                            nbr = nbr / 10;
                            resultat = resultat * 10 + reste;
                        }
                        out.println("Le resultat est " + resultat);
                    }
                    if (numero_ex == 15) {
                        out.println("entrer la valeur N :");
                        int N = sc.nextInt();
                        int a = 1000;
                        while (a > 0) {
                            if ((N % 2) == 0) {
                                N = N / 2;
                                out.println(N);
                            } else {
                                N = N * 3 + 1;
                                out.println(N);
                            }
                            a = a - 1;
                        }
                    }
                    if (numero_ex == 16) {
                        int A = 4;
                        int B = 7;
                        int resultat = 0;
                        displayMultTable(3);
                    }
                    if (numero_ex == 17) {
                        out.println("donnez votre taille (cm)");
                        int taille = sc.nextInt();
                        if (taille >= 190) {
                            out.println("Grande Taille .");
                        }
                        if (taille < 190 && taille >= 170) {
                            out.println("Taille moyenne .");
                        }
                        if (taille < 170 && taille >= 150) {
                            out.println("Petite taille .");
                        }
                        if (taille < 150 && taille >= 50) {
                            out.println("la c'est chaud frere ");
                        }
                    }
                    if (numero_ex == 18) {          // labyrinthe
                        int count = 1;
                        String move;
                        String park = "X00000";
                        String park2 = "000000";
                        String park3 = "000000";
                        String park4 = "000000";
                        String park5 = "000000";
                        String park6 = "000000";
                        String park7 = "000000";
                        while (1 > 0) {


                            if (count == 1) {

                                out.println(park);
                                out.println(park2);
                                out.println(park3);
                                out.println(park4);
                                out.println(park5);
                                out.println(park6);
                                out.println(park7);
                                count = count - 1;
                            }

                            char c = sc.next().charAt(0);
                            if (c == 's') {
                                park = "000000";
                                park2 = "X00000";
                                park3 = "000000";
                                park4 = "000000";
                                park5 = "000000";
                                park6 = "000000";
                                park7 = "000000";
                                count = 1;
                            }
                            if (c == 'd') {
                                park = "0X0000";
                                park2 = "000000";
                                park3 = "000000";
                                park4 = "000000";
                                park5 = "000000";
                                park6 = "000000";
                                park7 = "000000";
                                count = 1;
                            }
                            if (c == 'z') {
                                park = "000000";
                                park2 = "000000";
                                park3 = "000000";
                                park4 = "000000";
                                park5 = "000000";
                                park6 = "000000";
                                park7 = "X00000";
                                count = 1;
                            }
                            if (c == 'q') {
                                park = "00000X";
                                park2 = "000000";
                                park3 = "000000";
                                park4 = "000000";
                                park5 = "000000";
                                park6 = "000000";
                                park7 = "000000";
                                count = 1;
                            }
                        }
                    }
                    if (numero_ex == 19) {

                    }
                }
                if (profil.equals("algo")) {
                    while (numero_ex != 0) {
                        out.println("Bonjour tu es dans le cours " + profil + " . ");
                        out.println("Veuillez saisir le numero de l'exercice : ");
                        numero_ex = sc.nextInt();

                        if (numero_ex == 1) {

                                int resultat = 0;
                                out.println("veuillez saisir un chiffre : ");
                                int nombre_saisi = sc.nextInt();
                            try {
                                if (nombre_saisi > 0) {
                                    out.println("votre chiffre sera multiplié par 2 .");
                                    resultat = nombre_saisi * 2;
                                }
                                if (nombre_saisi < 0) {
                                    out.println("votre chiffre sera divisé par 2 . ");
                                    resultat = nombre_saisi / 2;
                                }
                                if (nombre_saisi == 0) {
                                    out.println("quel est votre nom ? ");
                                    String Nom_user = sc.next();
                                    if (Nom_user.length() > 7) {
                                        out.println("Ton nom est long . ");
                                    } else {
                                        out.println("Ton nom est court . ");
                                    }
                                    resultat = Nom_user.length();
                                }

                                out.println("resultat du calcul : " + resultat);
                                out.println("au revoir");
                                out.println(" ");
                                out.println(" ");
                            } catch (Exception e) {
                                out.println("je t'ai demandé un chiffre ");
                            }
                        }
                        if (numero_ex == 2){
                            int somme_pair=0;
                            int somme_impair=0;
                            int somme_total=0;
                            int i=0;
                            out.println("entrez un nombre ");
                            int valeur_nombre = sc.nextInt();
                            while(i!=valeur_nombre){
                                if ((i%2)==0){
                                    somme_pair=somme_pair+i;
                                }else{
                                    somme_impair=somme_impair+i;
                                }
                                somme_total=somme_total+i;
                                i++;
                            }
                            out.println("la somme des impairs fait "+somme_impair);
                            out.println("la somme des pairs fait "+somme_pair);
                            out.println("la somme total fait "+somme_total);
                        }
                    }
                }
                if (profil.equals("jeux")) {
                    String jeu = "";
                    out.println("Liste jeux :");
                    out.println("-juste prix");
                    out.println("-calcul");

                    out.println("");
                    out.println("quelle jeux voulez-vous jouer ?");
                    jeu = sc.nextLine();
                    if (jeu.equals("juste prix")) {
                        int restart = 1;
                        int restart_text;
                        while (restart != 0) {
                            double d = Math.random();
                            int n = (int) d;
                            n = (int) (Math.random() * 1001);
                            int saisis_joueur = -1;
                            int nb_tour = 0;


                            out.println("trouvez le nombre compris entre 0 et 1000 .");

                            while (n != saisis_joueur) {
                                if (nb_tour < 20) {

                                    saisis_joueur = sc.nextInt();
                                    if (saisis_joueur == n) {

                                        out.println("gagner !!!! le nombre était : " + n);
                                        out.println(" ");
                                        out.println("vous avez fait " + nb_tour + " essai .");
                                    } else {

                                        if (n > saisis_joueur) {

                                            out.println("plus");
                                            nb_tour++;
                                        } else {

                                            out.println("moins");
                                            nb_tour++;
                                        }
                                    }
                                } else {
                                    out.println("perdu vous avez fait 20 essais");
                                    nb_tour = 0;
                                    saisis_joueur = n;
                                }
                            }
                            out.println("voulez vous recommencer ? 1=OUI ||| 2=NON ");
                            restart_text = sc.nextInt();
                            if (restart_text == 1) {
                                restart = 1;
                            } else {
                                restart = 0;
                            }
                        }

                    }
                    if (jeu.equals("calcul")) {
                        int restart = 1;
                        int restart_text;
                        while (restart != 0) {

                            double nombre1 = Math.random();
                            int nombre1entier = (int) nombre1;
                            nombre1entier = (int) (Math.random() * 100);
                            double nombre2 = Math.random();
                            int nombre2entier = (int) nombre2;
                            nombre2entier = (int) (Math.random() * 100);
                            int resultat = 0;
                            int resultatjoueur = 0;
                            String operation = "abc";


                            out.println("addition,multiplication,division ?");
                            operation = sc.next();
                            if (operation.equals("addition")) {
                                resultat = nombre1entier + nombre2entier;
                                out.println("donnez le resultat de : " + nombre1entier + "+" + nombre2entier + "= ?");
                                resultatjoueur = sc.nextInt();
                                if (resultatjoueur == resultat) {
                                    out.println("bien jouer c'est le bon résultat");
                                } else {
                                    out.println("mauvais resultat " + resultat);

                                }
                            }
                            if (operation.equals("multiplication")) {
                                resultat = nombre1entier * nombre2entier;
                                out.println("donnez le resultat de : " + nombre1entier + "x" + nombre2entier + "= ?");
                                resultatjoueur = sc.nextInt();
                                if (resultatjoueur == resultat) {
                                    out.println("bien jouer c'est le bon résultat");
                                } else {
                                    out.println("mauvais resultat " + resultat);

                                }
                            }
                            if (operation.equals("division")) {
                                resultat = nombre1entier / nombre2entier;
                                out.println("donnez le resultat de : " + nombre1entier + "/" + nombre2entier + "= ?");
                                resultatjoueur = sc.nextInt();
                                if (resultatjoueur == resultat) {
                                    out.println("bien jouer c'est le bon résultat");
                                } else {
                                    out.println("mauvais resultat " + resultat);

                                }
                            }

                            out.println("voulez vous recommencer ? 1=OUI ||| 2=NON ");
                            restart_text = sc.nextInt();
                            if (restart_text == 1) {
                                restart = 1;
                            } else {
                                restart = 0;
                            }
                        }
                    }
                }
                if (profil.equals("profil ?")) {
                    out.println("liste des profils :");
                    out.println(" ");
                    out.println("Christopher");
                    out.println("save");
                    out.println("algo");
                    out.println("jeux");
                }

            }
        }
    }
}