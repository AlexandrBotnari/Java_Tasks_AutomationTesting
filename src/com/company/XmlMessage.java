package com.company;

import com.company.Message;

public class XmlMessage extends MessageProcessor implements Message {


    public XmlMessage(String body) {
        this.name = "Xml";
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
        this.body = ss;
        System.out.println(getName() + ": " +getBody() );
    }

    @Override
    public void messageConvert(MessageProcessor messageProcessor){
        messageProcessor.body = this.body;
        messageProcessor.name = "Json: ";
        System.out.println(messageProcessor.name + "" + messageProcessor.body);
    }
}
