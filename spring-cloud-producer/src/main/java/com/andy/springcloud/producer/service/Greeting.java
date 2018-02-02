package com.andy.springcloud.producer.service;

/**
 * User: andy
 * Date: 2018/1/27
 * Time: 19:52
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

