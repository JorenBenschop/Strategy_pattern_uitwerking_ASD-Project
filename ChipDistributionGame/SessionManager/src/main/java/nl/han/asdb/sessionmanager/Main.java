package nl.han.asdb.sessionmanager;



public class Main {

    public static void main(String[] args) {
        System.out.println(nl.han.asdb.gamestatistics.Main.test());
        System.out.println(nl.han.asdb.activegame.Main.test());
        System.out.println(nl.han.asdb.clientsettingprovider.Main.test());
        System.out.println(nl.han.asdb.agentcompiler.Main.test());
        System.out.println(nl.han.asdb.gamemasterprovider.Main.test());
        System.out.println(nl.han.asdb.gamemodeprovider.Main.test());
        System.out.println(nl.han.asdb.entitymanager.Main.test());
        System.out.println(nl.han.asdb.agenthostservice.Main.test());
        System.out.println(nl.han.asdb.clientsettingprovider.Main.test());
        System.out.println(nl.han.asdb.eventhandler.Main.test());
        System.out.println(nl.han.asdb.gameruleprovider.Main.test());

    }
    public static String test(){
        return "session manager";
    }
}
