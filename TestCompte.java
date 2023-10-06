package com.example.myapplicationddd.compte;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;




public class TestCompte {
    public static void main(String[] args) throws Exception {
        ArrayList<Compte> comptes = new ArrayList<>();
        Compte compte1 = new Compte(2000, StatutDeCompte.created);


        compte1.verser(300);
        compte1.verser(300);
        compte1.retirer(200);
        compte1.verser(300);


        Compte compte2 = new Compte(2000,  StatutDeCompte.created);


        compte2.verser(100);
        compte2.retirer(40);


        Compte compte3 = new Compte(2000,  StatutDeCompte.created);


        compte3.verser(500);
        compte3.retirer(100);


        Compte compte4 = new Compte(2000,  StatutDeCompte.created);


        compte4.verser(100);
        compte4.retirer(50);

        CompteCourant cptCou = new CompteCourant(300,300);
        cptCou.retirer(200);
        cptCou.consulterSolde();

        CompteEpargne cptEp = new CompteEpargne(500,10);
        cptEp.updateSolde();
        cptEp.consulterSolde();





        cptCou.setSolde(100);
        comptes.add(compte1);
        comptes.add(compte2);
        comptes.add(compte3);
        comptes.add(compte4);
        Compte.Versement(500, compte2, compte4);

        compte1.consulterSolde();






        for (int i = 0; i < comptes.size(); i++) {
            System.out.println(comptes.get(i).toString());
            System.out.println("les information de votre Compte : ");
            for (Operation e : comptes.get(i).op) {
                if (e instanceof Retrait) {
                    System.out.println(e.retirer());
                } else {
                    System.out.println(e.verser());
                }
            }
            System.out.println("le totale de versement est : " + comptes.get(i).totaleVersement());
            System.out.println("le totale de retairait est : " + comptes.get(i).totaleRetrait());
            System.out.println();
        }
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\hp\\AndroidStudioProjects\\Segmentapp\\app\\src\\main\\java\\com\\example\\segmentapp\\compte\\Client1.txt"));
        for (int i = 0; i < comptes.size(); i++) {
            out.println(comptes.get(i).toString());
            out.println("les information de votre Compte : ");
            for (Operation e : comptes.get(i).op) {
                if (e instanceof Retrait) {
                    out.println(e.retirer());
                } else {
                    out.println(e.verser());
                }
            }
            out.println("Le totale de versement est : " + comptes.get(i).totaleVersement()+" dh");
            out.println("Le totale de retairait est : " +comptes.get(i).totaleRetrait()+" dh");
            out.println();

        }
        out.close();


    }
}




