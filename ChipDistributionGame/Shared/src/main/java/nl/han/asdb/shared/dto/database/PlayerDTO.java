package nl.han.asdb.shared.dto.database;

import java.util.UUID;

public class PlayerDTO {
    private UUID playerId;
    private String role;

    public UUID getPlayerId() {
        return playerId;
    }

    public void setPlayerId(UUID playerId) {
        this.playerId = playerId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
