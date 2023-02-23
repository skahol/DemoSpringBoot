package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

@Table(name = "tenantsSubscriptions")
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter@Setter
public class TenantSubscription extends AbstractDocument {

    @Id
    @GeneratedValue
    private String id;
    private String tenantId;
    private String email;
    private String planId;
    private String planType;
    private String planName;
    private DateTime startDate;
    private DateTime endDate;
    private int campaignCount;
    private DateTime unsubscribedDate;
    private boolean isUnsubscribed;
}
