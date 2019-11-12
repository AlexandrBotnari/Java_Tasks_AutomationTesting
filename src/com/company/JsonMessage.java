package com.company;

public class JsonMessage extends MessageProcessor implements Message {

    public JsonMessage(String body) {
        this.name = "Json";
        this.body = body;
    }

    @Override
    public void prepareMessage() {
        System.out.println("No message in DB");
    }

    @Override
    public void prepareMessage(String s) {
        this.body = s;
        System.out.println(getName() + ": " +getBody() );
    }

    @Override
    public void prepareMessage(String s, String ss) {
        this.name = s;
        this.body = ss;   // this.body = ss + " " + s;    If it is need to change only 'body'
        System.out.println(getName() + ": " +getBody() );
    }

    @Override
    public void messageConvert(MessageProcessor messageProcessor){
        messageProcessor.body = this.body;
        messageProcessor.name = "Xml: ";
        System.out.println(messageProcessor.name + "" + messageProcessor.body);
    }
}
