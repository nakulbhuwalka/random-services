package com.example.simple.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Response {
    private String message;
    private long code;
    private List<String> stringList;
    private List<Long> listLong;
    private long currentTimestamp;
    private Instant timestamp;

    public Response() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Long> getListLong() {
        return listLong;
    }

    public void setListLong(List<Long> listLong) {
        this.listLong = listLong;
    }

    public long getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", stringList=" + stringList +
                ", listLong=" + listLong +
                ", currentTimestamp=" + currentTimestamp +
                '}';
    }

    public static Response populateWithRandomValues() {
        Response response = new Response();
        Random random = new Random();

        // Generate random message
        String[] messages = { "Success", "Error", "Warning", "Info", "Debug" };
        response.setMessage(messages[random.nextInt(messages.length)]);

        // Generate random code
        response.setCode(random.nextLong());

        // Generate random stringList
        List<String> stringList = new ArrayList<>();
        int stringListSize = random.nextInt(5) + 1;
        for (int i = 0; i < stringListSize; i++) {
            stringList.add("String_" + random.nextInt(1000));
        }
        response.setStringList(stringList);

        // Generate random listLong
        List<Long> listLong = new ArrayList<>();
        int listLongSize = random.nextInt(5) + 1;
        for (int i = 0; i < listLongSize; i++) {
            listLong.add(random.nextLong());
        }
        response.setListLong(listLong);

        // Set current timestamp
        response.setCurrentTimestamp(System.currentTimeMillis());
        response.timestamp = Instant.now();

        return response;
    }
}
