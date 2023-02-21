// příklad z částí 2.2 - Třídy a objkety a 2.3 - metody a konstruktory a 2.5 - Kolekce, pole, mapy
package com.engeto.dumplingRace;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

// Úkol č.14 (2.3 - Metody a konstruktory - Pomocné metody)
//      nastavení nového závodníka pomocí metody - name, born, numberOfDumplings, finalResult
    private static Racer createRacer(String name, LocalDate born, int nuberOfDumplings){
        Racer newRacer = new Racer();
        newRacer.setName(name);
        newRacer.setBorn(born);
        newRacer.setNumberOfDumplings(nuberOfDumplings);
        newRacer.setFinalResult(false);
        return newRacer;
    }

    public static void main(String[] args) {
// Úkol č.3 (2.2 - Třídy a objekty - Uložení objektu do proměnné)
//      vytvoř novou instanci třídy "Racer" a ulož do proměnné "firstRacer"
        Racer firstRacer = new Racer();     // vytvoření instance (objektu) třídy "Racer" s názvem "firstRacer"
        Racer secondRacer = new Racer();

// Úkol č.4 (2.2 - Třídy a objekty - Úkol: instance třídy Race)
//      vytvoř tři instance (objekty) třídy Race. Pojmenuj je race2017, race2018 a race2019
        Race race2017 = new Race();     // vytvoření instance (objektu) třídy "Race" s názvem "race2017"
        Race race2018 = new Race();
        Race race2019 = new Race();


// Úkol č.7 (2.3 - Metody a konstruktory - Generování přístupových metod)
//      Volání metod
        firstRacer.setName("Radek");                    // uložení hodnoty "Radek" do atributu "name" objektu "firstRacer" třídy "Rcer" prostřednictvím setteru (metody "setName")
        System.out.println(firstRacer.getName());       // vypsání atributu "name" prostřednictvím getteru (metody "getName")
        System.out.println(firstRacer.name);            // to samé, ale jen přes atribut "name" třídy "Racer"

// Úkol č.10 (2.3 - Metody a konstruktory - Úkol: použití přístupových metod)
//      vytvoř nový objekt třídy Racer, vlož ho do proměnné "chuck" a přiřaď mu atributy dle zadání
        String chucksName;
        Racer chuck = new Racer();
        chuck.setName("Chuck Norris");
        chuck.setBorn(LocalDate.of(1940,1,1));
        chuck.setNumberOfDumplings(1000);
        chuck.setFinalResult(false);
        chucksName = chuck.getName();                       //proměnnou "chucksName" jsem deklaroval nahoře (kvůli pořadí zápisu kódu), ale jinak by to šlo i takto: String chucksName = chuck.getName();
        System.out.println(chuck.getNumberOfDumplings());

// Úkol č.13 (2.3 - Metody a konstruktory - Nastavování hodnot u atributů objektových typů)
//      Vytvoříme v metodě main objekt třídy Race a nazvěme ho todaysRace a nastav atributy dle zadání
        Race todaysRace = new Race();
        todaysRace.setYear(2020);
        todaysRace.setTitle("MČR Břicháč Cup");
        todaysRace.setDate(LocalDate.now());
        Racer stranger = new Racer();
        stranger.setName("stranger");
        todaysRace.setWinner(stranger);
        System.out.println(stranger.getName());
        System.out.println(todaysRace.getWinner());                                 // ????? přoč to nevypíše jméno? ("stranger")

// Úkol č.16 (2.3 - Metody a konstruktory - Výchozí konstruktor)
//      test výchozího konstruktoru ve třídě "VoleyballPlayground"

    VoleyballPlayground newPlayground = new VoleyballPlayground();
        System.out.println(newPlayground.getWidth());


// Úkol č.19 (2.3 - Metody a konstruktory - Vlastní konstruktor(y))
//      vytváření objektů pomocí zapsaného konstruktoru - při vytváření objektu potom musíme zapsat i hodnoty parametrů
//      Při předání hodnot parametrů můžeme využít proměnné či volání metod
        Racer racer1 = new Racer("Klára", LocalDate.of(1999, 11, 3), 5);
                // využití konstruktoru s parametry "name", "born" a "numberOfDumplings")
        String name = "Adam";
        LocalDate adamsBirthday = LocalDate.of(1990,3,15);
        Racer racer2 = new Racer();         // využití konstruktoru bez parametrů (ale se stanovenými výchozími hodnotami atributů)
        Racer racer3 = new Racer(name, adamsBirthday, racer1.numberOfDumplings);
                // využití konstruktoru a v něm předchozí proměnné a objektu
        System.out.println("racer3: " + racer3.getName() + ", " + racer3.getBorn() + ", " + racer3.getNumberOfDumplings());
        System.out.println("racer3 podruhé: " + racer3.name + ", " + racer3.born + ", " + racer3.numberOfDumplings);
                // ???? jaký je rozdíl v tomto zápisu a zápisu pomocí getName? (viz ýše)

// Úkol č.21 (2.3 - Metody a konstruktory - Více konstruktorů)
//      test konstruktoru s dvěma parametry a předdefinovaným množstvím snězených knedlíků
        Racer racer4 = new Racer("Jolana", LocalDate.of(1890,12,31));
        System.out.println("racer4: " + racer4.getName() + ", " + racer4.getBorn() + ", " + racer4.getNumberOfDumplings());

// Úkol č.24 (2.3 - Metody a konstruktory - Cvičení – vytvoř vhodný konstruktor pro třídu Race)
//      využití konstruktorů vytvořených ve třídě "Race"

        Race race2020 = new Race(2020);
        Race race2023 = new Race(2023, LocalDate.of(2023, 01,01), "DumplingCup");

        System.out.println("Ročník: " + race2020.year + ", datum: " + race2020.date + ", název: " + race2020.title + ", vítěz: " + race2020.winner);
        System.out.println("Ročník: " + race2023.year + ", datum: " + race2023.date + ", název: " + race2023.title + ", vítěz: " + race2023.winner);



// Úkol č.25 (2.5 - Kolekce, pole, mapy - Cvičení – Práce s kolekcí ArrayList)
//      vytvoření kolekce ArrayList
        List<Racer> listOfRacers = new ArrayList<>();

// Úkol č.26 (2.5 - Kolekce, pole, mapy - Cvičení – Uložení objektu do kolekce)
//      vytvoření objektu a uložení do kolekce
        Racer racer5 = new Racer("Honza", LocalDate.of(1990,02,02));
        listOfRacers.add(racer5);
        listOfRacers.add(new Racer("Klára", LocalDate.of(1995,04, 20)));

// Úkol č.27 (2.5 - Kolekce, pole, mapy - Cvičení – Kopírování prvků z jiné kolekce)
//      vytvoření kopie již vytvořené kolekce

        List<Racer> copyOfList = new ArrayList<Racer>(listOfRacers);

// Úkol č.28 (2.5 - Kolekce, pole, mapy - Cvičení – Vyzvednutí objektu z kolekce)
//      vypsání jednotlivých pozic v kolekci - nezapomeň, že se kolekce čísluje od 0
        System.out.println(listOfRacers.get(0).getName());
        System.out.println(listOfRacers.get(1).getName());

// Úkol č.29 (2.5 - Kolekce, pole, mapy - Cvičení – Odstranění objektu z kolekce)
//      vymazání položky z kolekce
        listOfRacers.remove(1);
        listOfRacers.remove(racer5);


        // nebo smazání všeho v kolekci
        listOfRacers.add(racer5);
        listOfRacers.clear();

// Úkol č.30 (2.5 - Kolekce, pole, mapy - Cvičení – Zjištění počtu objektů v kolekci)
//      vypíše počet objektů obsažených v kolekci
        listOfRacers.add(racer5);                       // protože jsem předtím všechny vymazal, tak aspoň jednoho přihodím
        System.out.println(listOfRacers.size());

// Úkol č.31 (2.5 - Kolekce, pole, mapy - Cvičení – Provedení akce se všemi prvky v kolekci)
//      pomocí cyklů - například vypsání všech prvků
        listOfRacers.add(new Racer("Františka", LocalDate.of(2000,12,12)));
        listOfRacers.add(racer1);
        listOfRacers.add(racer3);
        for (Racer racer : listOfRacers){
            System.out.println(racer.getName());
        }








    }


}