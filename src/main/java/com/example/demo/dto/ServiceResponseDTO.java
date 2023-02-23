package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceResponseDTO {
    private boolean success;
    private Integer httpStatus;
    private String shortMessage;
    private String longMessage;
    private String messageType;
    private String messageCode;
    private Object payload;

    public ServiceResponseDTO() {}

    public ServiceResponseDTO(boolean success, Integer httpStatus,  String shortMessage, String longMessage, String messageType, String messageCode, Object payload) {
        this.success = success;
        this.httpStatus = httpStatus;
        this.messageCode = messageCode;
        this.payload = payload;
        this.messageType = messageType;
        this.shortMessage = shortMessage;
        this.longMessage = longMessage;
    }

    public static class Builder {
        private boolean success;
        private Integer httpStatus;
        private String shortMessage;
        private String longMessage;
        private String messageType;
        private String errorCode;
        private Object payload;

        public Builder() {}

        public ServiceResponseDTO build() {
            return new ServiceResponseDTO(success, httpStatus, shortMessage, longMessage, messageType, errorCode, payload);
        }

        public Builder setSuccess(boolean success) {
            this.success = success;
            return this;
        }

        public Builder setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder setShortMessage(String shortMessage) {
            this.shortMessage = shortMessage;
            return this;
        }

        public Builder setLongMessage(String longMessage) {
            this.longMessage = longMessage;
            return this;
        }

        public Builder setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
