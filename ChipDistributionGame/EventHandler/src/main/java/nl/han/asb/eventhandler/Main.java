package nl.han.asb.eventhandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(nl.han.asb.gameruleprovider.Main.test());
        System.out.println(nl.han.asb.networkhandler.Main.test());
        System.out.println(nl.han.asb.database.Main.test());
    }
    public static String test(){
        return "event handler";
    }
}

