package com.orderupdate.order.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.orderupdate.order.dto.Order;
import com.orderupdate.order.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class KafkaConfiguration {
    
    @KafkaListener(topics = Constants.name, groupId = Constants.groupId)
    public void updateOrder(String id) {
        System.out.println(id);
        // log.info(id.toString());
    }
}
