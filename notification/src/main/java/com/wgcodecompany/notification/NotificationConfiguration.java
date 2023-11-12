package com.wgcodecompany.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfiguration {

    @Value("${}")
    private String internalExchange;
    private String notificationQueue;
    private String internalNotificationRoutingKey;
}
