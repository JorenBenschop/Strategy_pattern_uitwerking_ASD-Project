package nl.han.asdb.shared.interfaces.eventmanager.events.game;

public class SellChipsEvent {
    private String uuid;
    private String buyerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBuyerUuid() {
        return buyerUuid;
    }

    public void setBuyerUuid(String buyerUuid) {
        this.buyerUuid = buyerUuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(short pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
