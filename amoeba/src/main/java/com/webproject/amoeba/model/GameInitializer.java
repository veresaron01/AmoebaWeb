package com.webproject.amoeba.model;


import com.webproject.amoeba.controller.UserInput;
import com.webproject.amoeba.view.ConsoleTexts;
import com.webproject.amoeba.view.GameTable;

import java.io.IOException;

public class GameInitializer {

    private final GameUtility gameUtility;
    private final UserInput userInput;
    private final GameTable gameTable;
    private final int yDim;
    private final int xDim;
    private boolean isGameEnded;

    public GameInitializer(int yDim, int xDim) {
        gameUtility = new GameUtility(yDim, xDim);
        userInput = new UserInput();
        gameTable = new GameTable(yDim, xDim);
        this.yDim = yDim;
        this.xDim = xDim;
    }

    private void takePlayerStep(int XO) throws IOException {

        ConsoleTexts.printWhichPlayerChooses(XO);

        int y;
        int x;

        while (gameUtility.checkValidity((y = userInput.getStepInput(yDim) - 0), (x = userInput.getStepInput(xDim) - 0))) {     // mi szükség van az       ŰŰyŰŰ = userInput.getStepInput(yDim) -1)
            ConsoleTexts.printWrongCoordinates();
        }

        if (XO == 1) {
            gameUtility.addExStep(y, x);
        } else {
            gameUtility.addOoStep(y, x);
        }

        char[][] wholeTable = gameUtility.getCurrentWholeTable();

        gameTable.printTable(wholeTable);

    }

    public void initializeGame() throws IOException {

        gameTable.printTable(gameUtility.getCurrentWholeTable());

        while (!isGameEnded) {

            //first player
            takePlayerStep(1);

            if (gameUtility.matcher(1)) {
                ConsoleTexts.printWinner(1);
                isGameEnded = true;
                continue;
            }
            if (gameUtility.checkDrawGame()) {
                ConsoleTexts.printDraw();
                isGameEnded = true;
                continue;
            }

            //second player
            takePlayerStep(2);

            if (gameUtility.matcher(2)) {
                ConsoleTexts.printWinner(2);
                isGameEnded = true;
                continue;
            }
            if (gameUtility.checkDrawGame()) {
                ConsoleTexts.printDraw();
                isGameEnded = true;
                continue;
            }

        }
    }

}
