package nl.han.asdb.shared.dto.database.game.entity;

import java.util.List;
import java.util.UUID;

public class EntityDTO {
    private UUID entityId;
    private EntityLocation entityLocation;
    private List<EntityDTO> suppliers;

    public EntityDTO() {
    }

    public EntityDTO(UUID entityId, EntityLocation entityLocation, List<EntityDTO> suppliers) {
        this.entityId = entityId;
        this.entityLocation = entityLocation;
        this.suppliers = suppliers;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public EntityLocation getEntityLocation() {
        return entityLocation;
    }

    public void setEntityLocation(EntityLocation entityLocation) {
        this.entityLocation = entityLocation;
    }

    public List<EntityDTO> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<EntityDTO> suppliers) {
        this.suppliers = suppliers;
    }
}
