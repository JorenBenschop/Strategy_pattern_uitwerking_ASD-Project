package nl.han.asdb.eventhandler.events.gamemaster;

public class SaveCardForReplayEvent {
    private String card;
    private short round;

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
