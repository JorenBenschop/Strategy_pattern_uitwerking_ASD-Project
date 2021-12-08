package nl.han.asdb.shared.interfaces.ruleengine;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

public class checker {

    public void checkAgentUuid(UUID agentUuid) {

    }

    public boolean checkPlayerUuid(UUID playerUuid) {

        return false;
    }

    public boolean checkBuyerUuid(UUID buyerUuid) {

        return false;
    }

    public boolean checkSellerUuid(UUID sellerUuid) {

        return false;
    }

    public boolean checkRecipientUuid(UUID recipientUuid) {

        return false;
    }

    public boolean checkSenderUuid(UUID senderUuid) {

        return false;
    }

    public boolean checkEntityUuid(UUID entityUuid) {

        return false;
    }

    public boolean checkGameUuid(UUID gameUuid) {

        return false;
    }

    public boolean checkPeerUuid(UUID peerUuid) {

        return false;
    }

    public boolean checkPlayerIp(String ownIp){

        return false;
    }

    public boolean checkPeerIp(String peerIp){

        return false;
    }

    public boolean checkBacklogValidity(short backlog){

        return false;
    }

    public boolean checkRoundValidity(short round){

        return false;
    }

    public boolean checkOrderAmountValidity(short orderAmount){

        return false;
    }

    public boolean checkValidMessage(String message){

        return false;
    }

    public boolean checkTimeDate(LocalDateTime TimeDate){

        return false;
    }

    public boolean checkChanceEventWithinBounds(double chanceValue) {

        return false;
    }

    public boolean checkCardExists(String card){

        return false;
    }

    public void checkRules(HashMap<String, String> rules){

    }

    public void checkAgentCode(String agentCode){

    }

}
