package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

public class GrabCardBasedOnChanceEvent {
    private double calculatedChance;
    private short round;

    public GrabCardBasedOnChanceEvent(){
    }

    public GrabCardBasedOnChanceEvent(double calculatedChance, short round) {
        this.calculatedChance = calculatedChance;
        this.round = round;
    }

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
