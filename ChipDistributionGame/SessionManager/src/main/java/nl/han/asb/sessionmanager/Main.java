package nl.han.asb.sessionmanager;

public class Main {

    public static void main(String[] args) {
        System.out.println(nl.han.asb.gamestatistics.Main.test());
        System.out.println(nl.han.asb.activegame.Main.test());
        System.out.println(nl.han.asb.clientsettingprovider.Main.test());
        System.out.println(nl.han.asb.intelligentagentcompiler.Main.test());
        System.out.println(nl.han.asb.gamemasterprovider.Main.test());
        System.out.println(nl.han.asb.gamemodeprovider.Main.test());
        System.out.println(nl.han.asb.entitymanager.Main.test());
    }
    public static String test(){
        return "session manager hurrduuurr";
    }
}
