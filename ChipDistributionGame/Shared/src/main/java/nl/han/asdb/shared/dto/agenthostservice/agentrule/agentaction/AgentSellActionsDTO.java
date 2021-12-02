package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.List;

public class AgentSellActionsDTO {
    List<AgentSellActionDTO> sellActions;

    public AgentSellActionsDTO() {}

    public AgentSellActionsDTO(List<AgentSellActionDTO> actions) {
        this.sellActions = actions;
    }


    public List<AgentSellActionDTO> getSellActions() {
        return sellActions;
    }

    public void setSellActions(List<AgentSellActionDTO> sellActions) {
        this.sellActions = sellActions;
    }


}
