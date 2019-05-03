package com.stackroute.oopchallenges;

public class Printer {
    private String name;
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(String name, int tonerLevel, boolean isDuplexPrinter) {
        this.name = name;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    private boolean isOutOfToner(double numberToPrint) {
        return (tonerLevel < 0);
    }

    public void printingPages(double numberToPrint) {

        if (isDuplexPrinter == false) {
            if (tonerLevel == 0) {
                System.out.println("Out of toner");
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

        public static void main(String[] args) {

            Printer printer = new Printer("HP",50,true);

        }
}
