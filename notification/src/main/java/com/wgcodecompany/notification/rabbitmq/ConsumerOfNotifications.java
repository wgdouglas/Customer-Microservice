package com.wgcodecompany.notification.rabbitmq;

import com.wgcodecompany.notification.NotificationService;
import com.wgcodecompany.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class ConsumerOfNotifications {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(NotificationRequest notificationRequest){
        log.info("Consumer {} from queue", notificationRequest);
        notificationService.send(notificationRequest);

    }
}
