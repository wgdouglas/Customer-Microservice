package com.wgcodecompany.customer;

public record NotificationSentRequest(
        String firstName,
        String lastName,
        String notificationMessage
    ) {
}
