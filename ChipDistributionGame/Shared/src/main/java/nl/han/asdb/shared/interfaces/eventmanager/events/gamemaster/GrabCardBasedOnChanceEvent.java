package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

public class GrabCardBasedOnChanceEvent {
    private double calculatedChance;
    private short round;

    public double getCalculatedChance() {
        return calculatedChance;
    }

    public void setCalculatedChance(double calculatedChance) {
        this.calculatedChance = calculatedChance;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
