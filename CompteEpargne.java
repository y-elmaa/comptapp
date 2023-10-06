package com.example.myapplicationddd.compte;


import com.example.myapplication.compte.exception.SupSdException;

public class CompteEpargne extends Compte {
    private double taux ;

    public CompteEpargne(double sold,double taux){
        super();
        this.solde = sold;
       this.taux = taux ;
    }
    public void  calculInterets() throws Exception{
        if(solde<2000)throw new SupSdException("compte Epargne activer lorsque le solde est sup de 2000");
        this.solde =solde+(solde*(this.taux/100));
    }
    public void consulterSolde(){
        System.out.print("le nouveau solde est : ");
        System.out.println(getSolde());
    }
    public  void  updateSolde(){

        this.solde=solde+(solde*(this.taux/100));
    };
    public String toString(){

        return (super.toString()+" decouvrement est: ");
    }
}


