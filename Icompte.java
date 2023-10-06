package com.example.myapplicationddd.compte;

public interface Icompte {

    double totaleVersement();
    double totaleRetrait();



    double getSolde();

    void consulterSolde();

    void  updateSolde();
    String toString();


}
