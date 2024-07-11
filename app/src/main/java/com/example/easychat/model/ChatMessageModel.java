//package com.example.easychat.model;
//
//import com.google.firebase.Timestamp;
//
//public class ChatMessageModel {
//    private String message;
//    private String senderId;
//    private Timestamp timestamp;
//
//    public ChatMessageModel() {
//    }
//
//    public ChatMessageModel(String message, String senderId, Timestamp timestamp) {
//        this.message = message;
//        this.senderId = senderId;
//        this.timestamp = timestamp;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getSenderId() {
//        return senderId;
//    }
//
//    public void setSenderId(String senderId) {
//        this.senderId = senderId;
//    }
//
//    public Timestamp getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Timestamp timestamp) {
//        this.timestamp = timestamp;
//    }
//}



package com.example.easychat.model;

import com.google.firebase.Timestamp;

public class ChatMessageModel {
    private String message;
    private String senderId;
    private Timestamp timestamp;
    private String keyString; // Add this field

    public ChatMessageModel() {
    }

    public ChatMessageModel(String message, String senderId, Timestamp timestamp, String keyString) {
        this.message = message;
        this.senderId = senderId;
        this.timestamp = timestamp;
        this.keyString = keyString;
    }

    // Getters and setters for all fields
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getKeyString() {
        return keyString;
    }

    public void setKeyString(String keyString) {
        this.keyString = keyString;
    }
}

