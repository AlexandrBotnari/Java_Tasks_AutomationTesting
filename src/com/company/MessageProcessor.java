package com.company;

public  abstract  class MessageProcessor  {
    String name;
    String body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void messageConvert(MessageProcessor messageProcessor){};
}
