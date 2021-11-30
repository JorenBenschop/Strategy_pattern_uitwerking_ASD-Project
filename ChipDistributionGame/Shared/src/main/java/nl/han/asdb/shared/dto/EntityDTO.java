package nl.han.asdb.shared.dto;

import java.util.List;
import java.util.UUID;

public class EntityDTO {
    private UUID entityId;
    private Enum entityLocation;
    private List<EntityDTO> suppliers;
}
