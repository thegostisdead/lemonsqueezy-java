package dev.dorianhardy.lemonsqueezy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class User {

    private String name;
    private String email;
    private String color;
    private String avatarUrl;
    private Boolean hasCustomAvatar;
    private String createdAt;
    private String updatedAt;

}
