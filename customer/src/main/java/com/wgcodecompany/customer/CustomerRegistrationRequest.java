package com.wgcodecompany.customer;
//using `record` allows for more immutability with toStrings(), ==, etc, and more for free
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
