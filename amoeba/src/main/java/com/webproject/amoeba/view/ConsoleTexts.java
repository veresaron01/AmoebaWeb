package com.webproject.amoeba.view;

public class ConsoleTexts {

    public void printGameIntro() {
        System.out.println("\n\nWelcome to the Amoeba Game!\n");
        System.out.println("You have to make a line of 4 with your character (x/o).\n");
        System.out.println("The line can be horizontal, vertical, or diagonal.\n");
    }

    public void printChooseNumberOfPlayers() {
        System.out.println("Choose mode (1-2)!\n Enter '1' for One-Player-Mode (AI) \n Enter '2' for Two-Player-Mode \n");
    }

    public void printChooseWhoStartsPlayerOrMachine() {
        System.out.println("Choose who starts (1-2)!\n Enter '1' for You to start \n Enter '2' for Computer to start \n");
    }

    public void printWrongFieldDimensionSizes() {
        System.out.println("Choose dimension sizes (4-16)!\n First: a number for height + enter \n Second: a number for width + enter");
    }

    public static void printWhichPlayerChooses(int XO12) {
        if (XO12 == 1) {
            System.out.println("Player #1`s turn. First choose a row with a number and enter, than the column with a number and enter.");
        } else {
            System.out.println("Player #2`s turn. First choose a row with a number and enter, than the column with a number and enter.");
        }
    }

    public static void printWrongCoordinates() {
        System.out.println("Choose empty coordinates.");
    }

    public static void printWinner(int XO12) {
        if(XO12 == 1) {
            System.out.println("\n\nThe Winner is Player #1!!! (\"X\") Congratulations!");
        } else {
            System.out.println("\n\nThe Winner is Player #2!!! (\"O\") Congratulations!");
        }
    }

    public static void printDraw() {
        System.out.println("No Player won, draw-match.");
    }
}
