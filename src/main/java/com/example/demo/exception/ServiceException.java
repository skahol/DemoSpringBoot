package com.example.demo.exception;


public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer httpStatus;
    private String shortMessage;
    private String longMessage;
    private String messageType;
    private String messageCode;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Integer httpStatus, String shortMessage, String longMessage, String messageType, String messageCode) {
        super(longMessage);
        this.httpStatus = httpStatus;
        this.longMessage = longMessage;
        this.shortMessage = shortMessage;
        this.messageCode = messageCode;
        this.messageType = messageType;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public String getLongMessage() {
        return longMessage;
    }

    public void setLongMessage(String longMessage) {
        this.longMessage = longMessage;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }
}