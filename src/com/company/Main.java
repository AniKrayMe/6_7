package com.company;

public class Main {

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter(10,10,10000,1000);
        //courses on 11/22/2019
        currencyConverter.convertDollarToDram();
        currencyConverter.convertDollarToEuro();
        currencyConverter.convertDollarToRuble();
        currencyConverter.convertDramToDollar();
        currencyConverter.convertDramToEuro();
        currencyConverter.convertDramToRuble();
        currencyConverter.convertEuroToDollar();
        currencyConverter.convertEuroToDram();
        currencyConverter.convertEuroToRuble();
        currencyConverter.convertRubleToDollar();
        currencyConverter.convertRubleToDram();
        currencyConverter.convertRubleToEuro();
    }
}
