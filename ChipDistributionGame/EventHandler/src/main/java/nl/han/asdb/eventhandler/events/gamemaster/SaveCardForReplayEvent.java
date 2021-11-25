package nl.han.asdb.eventhandler.events.gamemaster;

public class SaveCardForReplayEvent {
    private String Card;
    private short Round;

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        Round = round;
    }
}
