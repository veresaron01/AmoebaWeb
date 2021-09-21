package com.webproject.amoeba.model;

import com.webproject.amoeba.controller.UserInput;
import com.webproject.amoeba.view.ConsoleTexts;

import java.io.IOException;

public class GameLogic {

    public void startGame() throws IOException {

        UserInput userInput = new UserInput();
        ConsoleTexts consoleTexts = new ConsoleTexts();
        GameInitializer gameInitializer = null;

        consoleTexts.printGameIntro();

        consoleTexts.printWrongFieldDimensionSizes();
        int yDim = userInput.getRangeInput(4,16);// 4 8
        int xDim = userInput.getRangeInput(4,16);

        gameInitializer = new GameInitializer(yDim,xDim);
        gameInitializer.initializeGame();



    }

}
