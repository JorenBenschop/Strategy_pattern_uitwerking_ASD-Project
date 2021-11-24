package nl.han.asdb.shared.interfaces.agentcompiler;

public interface IAgentCompiler {
    /**
     * Met deze functie wordt er een Agent via de Agent Compiler aangemaakt en verstuurd naar de Agent Host Service.
     * @param input Bevat de regel (Agent Rule) waarmee de Agent wordt geconfigureerd.
     * return: Indien het compileren van de Agent goed gaat niks.
     *         Indien het ergens in de compiler fout gaat throwt de functie een Exception.
     */
    void compileInput(String input);
}
