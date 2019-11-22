package com.company;

public class CurrencyConverter {
    private int dollar;
    private int euro;
    private int dram;
    private int ruble;

    //region Getter and Setter

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public int getDram() {
        return dram;
    }

    public void setDram(int dram) {
        this.dram = dram;
    }

    public int getRuble() {
        return ruble;
    }

    public void setRuble(int ruble) {
        this.ruble = ruble;
    }
    //endregion

    //region Converting
    public void convertDollarToEuro() {
        double result = this.dollar * 0.91;
        System.out.println(result);
    }

    public void convertDollarToDram() {
        double result = this.dollar * 476.95;
        System.out.println(result);
    }

    public void convertDollarToRuble() {
        double result = this.dollar * 63.72;
        System.out.println(result);
    }

    public void convertEuroToDollar() {
        double result = this.euro * 1.10;
        System.out.println(result);
    }

    public void convertEuroToDram() {
        double result = this.euro * 526.84;
        System.out.println(result);
    }

    public void convertEuroToRuble() {
        double result = this.euro * 70.38;
        System.out.println(result);
    }

    public void convertDramToDollar() {
        double result = this.dram * 0.0021;
        System.out.println(result);
    }

    public void convertDramToEuro() {
        double result = this.dram * 0.0019;
        System.out.println(result);
    }

    public void convertDramToRuble() {
        double result = this.dram * 0.13;
        System.out.println(result);
    }

    public void convertRubleToDollar() {
        double result = this.ruble * 0.016;
        System.out.println(result);
    }

    public void convertRubleToEuro() {
        double result = this.ruble * 0.014;
        System.out.println(result);
    }

    public void convertRubleToDram() {
        double result = this.ruble * 7.49;
        System.out.println(result);
    }
    //endregion

    //region Constructor

    public CurrencyConverter(int dollar, int euro, int dram, int ruble) {
        this.dollar = dollar;
        this.euro = euro;
        this.dram = dram;
        this.ruble = ruble;
    }

    public CurrencyConverter() {
    }
    //endregion
}
