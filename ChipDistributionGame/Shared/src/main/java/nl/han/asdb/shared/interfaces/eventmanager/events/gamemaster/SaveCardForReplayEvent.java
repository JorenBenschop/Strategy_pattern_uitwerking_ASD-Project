package nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster;

public class SaveCardForReplayEvent {
    private String Card;
    private short Round;

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        this.Card = card;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        this.Round = round;
    }
}
