package nl.han.asdb.shared.interfaces.ruleengine;

import java.time.LocalDateTime;
import java.util.*;

public class checker {
    public void checkAgentUuid(UUID agentUuid) throws EventValueIncompleteException {
        //kijken of de uuid klopt
        if (agentUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable agentUuid incomplete");
        }
    }

    public void checkPlayerUuid(UUID playerUuid) throws EventValueIncompleteException {
        //kijken of de uuid klopt
        if (playerUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable playerUuid incomplete");
        }
    }

    public void checkAgentRules(HashMap rules) throws EventValueIncompleteException {
        if (rules.isEmpty()) {
        } else {
            throw new EventValueIncompleteException("Variable agentUuid incomplete");
        }
    }

    public void checkAgentCode(String agentCode) throws EventValueIncompleteException {
        //kijken of de agentcode klopt
        if (agentCode != null) {
        } else {
            throw new EventValueIncompleteException("Variable agentCode incomplete");
        }
    }

    public void checkPlayerIp(String ownIp) throws EventValueIncompleteException {
        //kijken of de ip klopt
        if (ownIp != null) {
        } else {
            throw new EventValueIncompleteException("Variable ownIp incomplete");
        }
    }

    public void checkPeerIp(String peerIp) throws EventValueIncompleteException {
        if (peerIp != null) {
        } else {
            throw new EventValueIncompleteException("Variable peerIp incomplete");
        }
    }

    public void checkPeerUuid(UUID peerUuid) throws EventValueIncompleteException {
        if (peerUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable peerUuid incomplete");
        }
    }

    public void checkPeerIps(List<String> peerIps) throws EventValueIncompleteException {
        if (peerIps.isEmpty()) {
        } else {
            throw new EventValueIncompleteException("Variable peerIps incomplete");
        }
    }

    public void checkSellerUuid(UUID sellerUuid) throws EventValueIncompleteException {
        if (sellerUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable sellerUuid incomplete");
        }
    }

    public void checkBuyerUuid(UUID buyerUuid) throws EventValueIncompleteException {
        if (buyerUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable buyerUuid incomplete");
        }
    }

    public void checkBacklogValidity(short backlog) throws EventValueIncompleteException {
        if (backlog >= 0 && backlog <= 30) {
        } else {
            throw new EventValueIncompleteException("Variable backlog incomplete");
        }
    }

    public void checkRoundValidity(short round) throws EventValueIncompleteException {
        //check of de ronde klopt
        if (round >= 0 && round <= 30) {
        } else {
            throw new EventValueIncompleteException("Variable AgentUuid incomplete");
        }
    }

    public void checkOrderAmountValidity(short orderAmount) throws EventValueIncompleteException {
        if (orderAmount >= 0 && orderAmount <= 10000) {
        } else {
            throw new EventValueIncompleteException("Variable orderAmount incomplete");
        }
    }

    public void checkValidMessage(String message) throws EventValueIncompleteException {
        if (message != null) {
        } else {
            throw new EventValueIncompleteException("Variable message incomplete");
        }
    }

    public void checkTimeDate(LocalDateTime localDateTime) throws EventValueIncompleteException {
        LocalDateTime dateTimeCheck = LocalDateTime.parse("2021-01-01T00:00:00.000");
        if (localDateTime.isAfter(dateTimeCheck)) {
        } else {
            throw new EventValueIncompleteException("Variable TimeDate incomplete");
        }
    }

    public void checkChanceEventWithinBounds(double chanceValue) throws EventValueIncompleteException {
        if (chanceValue >= 0 && chanceValue <= 1) {
        } else {
            throw new EventValueIncompleteException("Variable AgentUuid incomplete");
        }
    }

    public void checkCardExists(String card) throws EventValueIncompleteException {
        if (card != null) {
        } else {
            throw new EventValueIncompleteException("Variable card incomplete");
        }
    }

    public void checkRecipientUuid(UUID recipientUuid) throws EventValueIncompleteException {
        if (recipientUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable recipientUuid incomplete");
        }
    }

    public void checkSenderUuid(UUID senderUuid) throws EventValueIncompleteException {
        if (senderUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable senderUuid incomplete");
        }
    }

    public void checkEntityUuid(UUID entityUuid) throws EventValueIncompleteException {
        if (entityUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable entityUuid incomplete");
        }
    }

    public void checkGameUuid(UUID gameUuid) throws EventValueIncompleteException {
        if (gameUuid != null) {
        } else {
            throw new EventValueIncompleteException("Variable gameUuid incomplete");
        }
    }

    public void checkPriceAmountValidity(double priceAmount) throws EventValueIncompleteException {
        if (priceAmount >= 0.00 && priceAmount <= 1000.00) {
        } else {
            throw new EventValueIncompleteException("Variable AgentUuid incomplete");
        }
    }

    public void checkPricePerItem(double pricePerItem) throws EventValueIncompleteException {
        if (pricePerItem >= 0.00 && pricePerItem <= 1000.00) {
        } else {
            throw new EventValueIncompleteException("Variable AgentUuid incomplete");
        }
    }

    public void checkSettings(HashMap<String, String> settings) throws EventValueIncompleteException {
        if (settings.isEmpty()) {
        } else {
            throw new EventValueIncompleteException("Variable settings incomplete");
        }
    }

    public void checkAgentName(String agentName) throws EventValueIncompleteException {
        if (agentName != null) {
        } else {
            throw new EventValueIncompleteException("Variable agentName incomplete");
        }
    }
}
