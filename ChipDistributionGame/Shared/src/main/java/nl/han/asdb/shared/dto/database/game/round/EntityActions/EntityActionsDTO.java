package nl.han.asdb.shared.dto.database.game.round.EntityActions;

import nl.han.asdb.shared.dto.database.game.GameDTO;
import nl.han.asdb.shared.dto.database.game.entity.EntityDTO;
import nl.han.asdb.shared.dto.database.game.entity.EntityType;
import nl.han.asdb.shared.dto.database.game.round.EntityActions.backlog.BacklogDTO;
import nl.han.asdb.shared.dto.database.game.round.EntityActions.delivery.DeliveryDTO;
import nl.han.asdb.shared.dto.database.game.round.EntityActions.order.OrderDTO;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EntityActionsDTO {
    private UUID entityId;
    private EntityType entityType;
    private int stock;
    private int costs;
    private List<BacklogDTO> backlogs;
    private List<DeliveryDTO> deliveries;
    private List<OrderDTO> orders;

    public EntityActionsDTO() {
    }

    public EntityActionsDTO(UUID entityId, EntityType entityType, int stock, int costs, List<BacklogDTO> backlogs, List<DeliveryDTO> deliveries, List<OrderDTO> orders) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.stock = stock;
        this.costs = costs;
        this.backlogs = backlogs;
        this.deliveries = deliveries;
        this.orders = orders;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public List<BacklogDTO> getBacklogs() {
        return backlogs;
    }

    public void setBacklogs(List<BacklogDTO> backlogs) {
        this.backlogs = backlogs;
    }

    public List<DeliveryDTO> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<DeliveryDTO> deliveries) {
        this.deliveries = deliveries;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public void setNewIncomingOrder(OrderDTO order){orders.add(order);}

    public EntityDTO getEntityFromID(UUID entityId, GameDTO gameDTO){
        return gameDTO.getEntities().stream().filter(EntityDTO -> EntityDTO.getEntityId().equals(entityId)).toList().get(0);
    }
}
