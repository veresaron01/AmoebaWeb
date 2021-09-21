package com.webproject.amoeba.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    BufferedReader reader;

    public UserInput() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInputFromConsole() throws IOException {
        String s;
        while (!(s = reader.readLine()).matches("[\\d]{1,3}")) {
        }
        return s;
    }

    public int getStepInput(int reg) throws IOException {
        String regex = "[1-" + reg + "]";
        String inputChar = null;
        System.out.println(regex);

        boolean b = true;
        while (b) {
            int val = (Integer.valueOf(inputChar = getInputFromConsole()));
            if (val <= reg && val >= 1) {
                break;
            }

            System.out.println("Number from 1 - " + reg);
        }
        int result = Integer.parseInt(inputChar);

        return result;
    }


    public int getRangeInput(int min, int max) throws IOException {
        int result = 0;

        boolean wrongNumber = true;
        while (wrongNumber) {
            result = Integer.parseInt(String.valueOf(getInputFromConsole()));
            System.out.println(result);
            if (result <= max && result >= min){
                wrongNumber = false;
                break;
            }
            System.out.println("Number from 4 - 8");
        }
        return result;
    }

}
