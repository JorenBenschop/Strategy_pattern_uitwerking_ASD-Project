package nl.han.asdb.shared.interfaces.eventmanager.events.game;

public class OrderChipsEvent {
    private String uuid;
    private String sellerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSellerUuid() {
        return sellerUuid;
    }

    public void setSellerUuid(String sellerUuid) {
        this.sellerUuid = sellerUuid;
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
