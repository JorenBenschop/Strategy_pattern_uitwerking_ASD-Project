package nl.han.asdb.eventhandler;

public class Main {

    public static void main(String[] args) {
        System.out.println(nl.han.asdb.gameruleprovider.Main.test());
//        System.out.println(nl.han.asdb.networkhandler.Main.test());
        System.out.println(nl.han.asdb.database.Main.test());
    }
    public static String test(){
        return "event handler";
    }
}

