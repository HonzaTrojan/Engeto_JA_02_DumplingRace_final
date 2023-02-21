package com.engeto.dumplingRace;

import java.time.LocalDate;


public class Racer {
// Úkol č.1 (2.2 - Třídy a objekty - Zápis třídy Racer v Javě by vypadal takto)
// vytvořit atributy třídy "Racer" - name, numberOfDumplings, isFinalResult
    String name;
    int numberOfDumplings;
    boolean isFinalResult;
    LocalDate born;

// Úkol č.17 (2.3 - Metody a konstruktory - Výchozí konstruktor)
//      nastavení výchozích hodnot atributů třídy


//        String name = "anonymous racer";
//        int numberOfDumplings = 0;
//        boolean isFinalResult = false;
//        LocalDate born = LocalDate.MIN;


// Úkol č.18 (2.3 - Metody a konstruktory - Vlastní konstruktor(y))
//      konstruktor pro spuštění při vytváření objektu třídy "Racer"
    public Racer (String name, LocalDate born, int numberOfDumplings){          // ???? - podle skript můžu vynechat deklaraci atributů třídy, ale bez toho to nejede
        this.name = name;
        this.born = born;
        this.numberOfDumplings = numberOfDumplings;
    }

// Protože jsem napsal konstruktor výše a v předchozím kódu (v metodě main) vytvářím objekt
//  pomocí zápisu "Racer chuck = new Racer();", tj. bez parametrů, tak musím vytvořit i konstruktor pro tuto variantu!!!
//    zároveň jsem v konstruktoru přiřadil atributům výchozí hodnoty
    public Racer(){
        String name = "anonymous racer";
        int numberOfDumplings = 0;
        boolean isFinalResult = false;
        LocalDate born = LocalDate.MIN;
    }

// Úkol č.20 (2.3 - Metody a konstruktory - Více konstruktorů)
//      vytvoření dalšího konstruktoru pro dva parametry a třerí atribut zadám výchozí hodnotou
//      zápis závodníků před závodem - budou mít 0 snězených knedlíků
    public Racer(String name, LocalDate born){
        this.name = name;
        this.born = born;
        this.numberOfDumplings = 0;
    }

// Úkol č.22 (2.3 - Metody a konstruktory - Volání jiného konstruktoru)
//      pomocí kontruktoru můžeme volat jiný konstruktor
    public Racer(LocalDate born, String name, int numberOfDumplings){       // konstruktor na který se budu odkazovat
        this.born = born;                                                   // jiné pořadí parametrů, abych ho odlišil od předchozích
        this.name = name;
        this.numberOfDumplings = numberOfDumplings;
    }

    public Racer (LocalDate born, String name){             // tímto konstruktorem se odkazuji na ten předchozí
        this(born, name, 0);                // správný konstruktor odliším typem i pořadím parametrů
    }




// Úkol č.6 (2.3 - Metody a konstruktory - Generování přístupových metod)
//      vytvoření přístupových metod pro atributy třídy - automatické vytvoření getName a setName pomocí alt+insert
    public String getName() {               // konstruktor pro získání atributu "name" ve třídě "Racer"
        return name;
    }
    public void setName(String name) {      // konstruktor pro uložení atributu "name" ve třídě "Racer"
        this.name = name;
    }

// Úkol č.9 (2.3 - Metody a konstruktory - Úkol: vytvoř přístupové metody)
//      Zkus si nyní doplnit ostatní přístupové metody do třídy Racer
    public int getNumberOfDumplings(){
        return numberOfDumplings;
    }
    public void setNumberOfDumplings(int numberOfDumplings){
        this.numberOfDumplings = numberOfDumplings;
    }

    public boolean isFinalResult() {        // ????? automaticky vytvořená metoda - proč nevytvoří metodu s názvem "getIsFinalResult" ???
        return isFinalResult;
    }
    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }

    public LocalDate getBorn() {
        return born;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }

// Úkol č.8 (2.3 - Metody a konstruktory - Vlastní metody)
//      cvičné vytvoření metody pro jeden z atributů - zvýšení počtu knedlíků
    public int addDumplings(int howMuch) {
        this.numberOfDumplings += howMuch;
        return this.numberOfDumplings;
    }



}

