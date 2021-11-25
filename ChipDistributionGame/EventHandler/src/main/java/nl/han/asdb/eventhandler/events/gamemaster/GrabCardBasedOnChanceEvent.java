package nl.han.asdb.eventhandler.events.gamemaster;

public class GrabCardBasedOnChanceEvent {
    private double CalculatedChance;
    private short Round;

    public double getCalculatedChance() {
        return CalculatedChance;
    }

    public void setCalculatedChance(double calculatedChance) {
        CalculatedChance = calculatedChance;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        Round = round;
    }
}
