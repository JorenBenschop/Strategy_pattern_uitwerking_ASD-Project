package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class SaveCardForReplayEvent extends Event{
    private String card;
    private short round;

    public SaveCardForReplayEvent(UUID eventUuid, String card, short round) {
        super(eventUuid);
        this.card = card;
        this.round = round;
        this.eventType = EventType.SaveCardForReplayEvent;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
