package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class GrabCardBasedOnChanceEvent extends Event{
    private double calculatedChance;
    private short round;

    public GrabCardBasedOnChanceEvent(){
    }

    public GrabCardBasedOnChanceEvent(UUID eventUuid, double calculatedChance, short round) {
        super(eventUuid);
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
