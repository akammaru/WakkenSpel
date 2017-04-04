package com.BasHorselenberg;

import java.util.ArrayList;

/**
 * Created by Bas_Horselenberg on 30-3-2017.
 */
public class MainHandler {
    private static int inputWak;
    private static int inputIjsbeer;
    private static int inputPinguin;
    public static ArrayList<DiceLogic> diceList;

    public MainHandler() {
        diceList = new ArrayList<>();
    }

    public static void setInputData(String inputWak, String inputIjsbeer, String inputPinguin){
        if(inputWak != ""){
            MainHandler.inputWak = Integer.valueOf(inputWak);
        }else{

        }
        if(inputIjsbeer != ""){
            MainHandler.inputIjsbeer = Integer.valueOf(inputIjsbeer);
        }
        if(inputPinguin != ""){
            MainHandler.inputPinguin = Integer.valueOf(inputPinguin);
        }
    }



    private static void setDiceList(ArrayList<DiceLogic> diceList) {
        MainHandler.diceList = diceList;
    }



    public static void work(){


    }

}
