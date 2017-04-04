package com.BasHorselenberg;

import java.util.Random;

/**
 * Created by Bas_Horselenberg on 22-3-2017.
 */
public class DiceLogic {

    public int diceRoll;

    /**
     * When dice is initialised a random number is generated.
     */
    public DiceLogic() {
        diceRoll = randIntDice();
    }

    /**
     * random number generator max 6 min 1 for getting the dice rollList.
     *
     * @return a random number between 1 and 6
     */
    private static int randIntDice() {
        int randomNum = (new Random().nextInt(6) + 1);
        return randomNum;
    }

    /**
     * get the rolled number on the dice.
     *
     * @return int returns the number rolled for dice.
     */
    public int getDiceRoll() {
        return diceRoll;
    }

    /**
     * get the exact oposite number of the dice roll. all dots on the dice front side and opposite side are always 7.
     *
     * @return int returns the exact opposite of rolled number.
     */
    public int getOposite() {
        return (7 - diceRoll);
    }
}
