package com.uas.prakrplbo;

public class Evolusi extends Monster{

    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1, Monster monster2){
        super(monster1.getNama()+" "+monster2.getNama());
        this.monster1=monster1;
        this.monster2=monster2;


    }
    public String bersuara(){
        String suaraBaru = "";
        for (int i = 0; i<8 ; i++) {
            if (i % 2 == 0) {
                suaraBaru += monster2.bersuara().charAt(i);
            }
            else {
                suaraBaru += monster1.bersuara().charAt(i);
            }
        }


        return suaraBaru;
    }
    public String bergerak(){
        return monster2.bergerak();
    }
}