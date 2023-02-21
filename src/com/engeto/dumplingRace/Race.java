package com.engeto.dumplingRace;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Úkol č.2 (2.2 - Třídy a objekty - Cvičení: zápis třídy)
//      zapsat v Javě třídu pro evidenci závodů (Race)
//      U každého závodu chceme znát ročník (year), název závodu (title), datum konání (date) a vítěze závodu (winner)
public class Race {

    int year;
    String title;
    LocalDate date;
    Racer winner;


    // Úkol č.11 (2.3 - Metody a konstruktory - Úkol: zápis přístupových metod ručně)
//      zápis přístupových metod ručně - atributy "year" a "title" třídy "Race"
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

// Úkol č.12 (2.3 - Metody a konstruktory - Nastavování hodnot u atributů objektových typů)
//      Nechej si nyní vygenerovat přístupové metody k atributům date a winner třídy Race
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }
    public void setWinner(Racer winner) {
        this.winner = winner;
    }

// Úkol č.23 (2.3 - Metody a konstruktory - Cvičení – vytvoř vhodný konstruktor pro třídu Race)
//      vytvoř konstruktor na základě požadavků
//    public Race(int year){
//        this.year = year;
//        date = LocalDate.now();
//        this.title = "Švestka Cup";
//        this.winner = null;
//    }
//    // konstruktor pro variantu, že bude zadáno i datum
//    public Race(int year, LocalDate date, String title){
//        this.year = year;
//        this.date = date;
//        this.title = title;
//        this.winner = null;
//    }
        // NEBO - mohu volat konstruktory pomocí konstruktoru
    public Race (int year, LocalDate date, String title){       // základní konstruktor, na který se budu odkazovat
        this.year = year;
        this.date = date;
        this.title = title;
        this.winner = null;
    }

    public Race(int year){
        this(year, LocalDate.now(), "Švestka");
    }


    // protože jsem dříve ve třídě "Main" vytvořil nový objekt třídy "Race" bez parametrů a
    //      nyní vytvořil konstruktor s parametry, háže to chybu
    //      proto musím vytvořit i konstruktor bez parametrů
    public Race (){

    }

// Úkol č.32 (2.5 - Kolekce, pole, mapy - Cvičení – Cvičení – seznam závodníků)
//      Vytvoř kolekci ve třídě Race a metody dle zadání
    List listOfRacers2;
    public void addRacer(Racer racer){
        listOfRacers2.add(racer);
    }
    public void removeRacer(Racer racer){
        listOfRacers2.remove(racer);
    }
    public List getRacers(){
        List<Racer> racerList = new ArrayList<>();
        return racerList;
    }




}
