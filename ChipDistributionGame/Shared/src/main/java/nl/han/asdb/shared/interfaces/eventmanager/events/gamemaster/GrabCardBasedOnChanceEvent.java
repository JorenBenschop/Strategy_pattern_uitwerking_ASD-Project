package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

public class GrabCardBasedOnChanceEvent {
    private double CalculatedChance;
    private short Round;

    public double getCalculatedChance() {
        return CalculatedChance;
    }

    public void setCalculatedChance(double calculatedChance) {
        this.CalculatedChance = calculatedChance;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        this.Round = round;
    }
}
