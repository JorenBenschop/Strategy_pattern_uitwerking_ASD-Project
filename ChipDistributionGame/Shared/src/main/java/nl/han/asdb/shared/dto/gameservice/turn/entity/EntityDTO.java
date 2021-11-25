package nl.han.asdb.shared.dto.gameservice.turn.entity;

import nl.han.asdb.shared.dto.gameservice.turn.entity.backlog.BacklogDTO;
import nl.han.asdb.shared.dto.gameservice.turn.entity.delivery.DeliveryDTO;
import nl.han.asdb.shared.dto.gameservice.turn.entity.order.OrderDTO;

import java.util.List;
import java.util.UUID;

public class EntityDTO {

    private UUID entityID;
    private OrderDTO order;
    private DeliveryDTO delivery;
    private int currentStock;
    private List<BacklogDTO> backlog;
    private EntityKind entityKind;
    private EntityLocation entityLocation;


    public EntityDTO() {
    }


    public EntityDTO(UUID entityID, OrderDTO order, DeliveryDTO delivery, int currentStock, List<BacklogDTO> backlog, EntityKind entityKind, EntityLocation entityLocation) {
        this.entityID = entityID;
        this.order = order;
        this.delivery = delivery;
        this.currentStock = currentStock;
        this.backlog = backlog;
        this.entityKind = entityKind;
        this.entityLocation = entityLocation;
    }

    public UUID getEntityID() {
        return entityID;
    }

    public void setEntityID(UUID entityID) {
        this.entityID = entityID;
    }

    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    public DeliveryDTO getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryDTO delivery) {
        this.delivery = delivery;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public List<BacklogDTO> getBacklog() {
        return backlog;
    }

    public void setBacklog(List<BacklogDTO> backlog) {
        this.backlog = backlog;
    }

    public EntityKind getEntityKind() {
        return entityKind;
    }

    public void setEntityKind(EntityKind entityKind) {
        this.entityKind = entityKind;
    }

    public EntityLocation getEntityLocation() {
        return entityLocation;
    }

    public void setEntityLocation(EntityLocation entityLocation) {
        this.entityLocation = entityLocation;
    }
}