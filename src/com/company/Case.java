package com.company;

public class Case {
    private Object joueurPresentationMorpionMorpion;

    public <Joueur, PresentationMorpion, Morpion> Case(Morpion joueurPresentationMorpionMorpion) {
        this.joueurPresentationMorpionMorpion = joueurPresentationMorpionMorpion;
    }

    public <Joueur> void jouerDefinitivement(Joueur humain) {
    }
}
