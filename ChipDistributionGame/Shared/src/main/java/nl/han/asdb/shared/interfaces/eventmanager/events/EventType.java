package nl.han.asdb.shared.interfaces.eventmanager.events;

public enum EventType {
    ConfigureAgentEvent,
    GiveControlToAgentEvent,
    StartAgentEvent,
    TakeControlFromAgentEvent,
    DisconnectEvent,
    RegisterConnectionEvent,
    SearchForGameEvent,
    SynchroniseGameEvent,
    BacklogOrderEvent,
    ChatEvent,
    ConfigureGameEvent,
    JoinGameEvent,
    LeaveGameEvent,
    OrderChipsEvent,
    ReplayGameEvent,
    SellChipsEvent,
    SetupGameEvent,
    StartGameEvent,
    StopGameEvent,
    WithdrawMoneyEvent,
    GrabCardBasedOnChanceEvent,
    SaveCardForReplayEvent,
    GetGameStatisticsEvent,
    ShowGameStatisticEvent
}
