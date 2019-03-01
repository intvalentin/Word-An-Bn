/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class Tranzitie {
    String  simbol,directie;
    String tr_start,tr_final;
    char rescrie='v';
    

    public Tranzitie(String tr_start, String simbol, char rescrie,String directie, String tr_final) {
        this.tr_start = tr_start;
        this.simbol = simbol;
        this.directie = directie;
        this.rescrie=rescrie;
        this.tr_final = tr_final;
        
    }

    public Tranzitie(String tr_start, String simbol,String directie, String tr_final) {
        this.tr_start = tr_start;
        this.simbol = simbol;
        this.tr_final = tr_final;
        this.directie=directie;
    }

    public Tranzitie(String tr_start) {
        this.tr_start = tr_start;
        this.simbol=" ";
    }
    
    

    public String getTr_start() {
        return tr_start;
    }

    public String getSimbol() {
        return simbol;
    }

    public String getDirectie() {
        return directie;
    }

    public String getTr_final() {
        return tr_final;
    }
    
    public char getRescrie() {
        return rescrie;
    }
    
    
    
    
}
