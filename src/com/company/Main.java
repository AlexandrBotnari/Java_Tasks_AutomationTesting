package com.company;

public class Main {
    public static void main(String[] args) {
        XmlMessage xmlMessage = new XmlMessage("This is one");
        System.out.println(xmlMessage.name + ": " + xmlMessage.body);
//        xmlMessage.prepareMessage();
        xmlMessage.prepareMessage("gicu");
//        xmlMessage.prepareMessage("himili", "gogiu");
        JsonMessage jsonMessage = new JsonMessage("Hello Saniok, u r my creator i love u");
        System.out.println(jsonMessage.name + ": " + jsonMessage.body);
//        jsonMessage.prepareMessage();
        jsonMessage.prepareMessage("Sho za koder");
//        jsonMessage.prepareMessage("Ne Json", "Vot tebe i pervii task");

        jsonMessage.messageConvert(jsonMessage);

        xmlMessage.messageConvert(xmlMessage);
    }
}
