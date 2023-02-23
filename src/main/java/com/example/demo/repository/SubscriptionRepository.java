package com.example.demo.repository;

import com.example.demo.model.TenantSubscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<TenantSubscription, Integer> {

}
