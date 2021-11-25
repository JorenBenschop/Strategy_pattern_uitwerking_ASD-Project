package nl.han.asdb.eventhandler.events.game;



public class OrderChipsEvent {
    private String UUID;
    private String SellerUUID;
    private short Amount;
    private short PricePerItem;
    private short Round;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getSellerUUID() {
        return SellerUUID;
    }

    public void setSellerUUID(String sellerUUID) {
        SellerUUID = sellerUUID;
    }

    public short getAmount() {
        return Amount;
    }

    public void setAmount(short amount) {
        Amount = amount;
    }

    public short getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(short pricePerItem) {
        PricePerItem = pricePerItem;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        Round = round;
    }
}
