package dev.dorianhardy.lemonsqueezy;

/*
{
  "type": "users",
  "id": "1",
  "attributes": {
    "name": "Darlene Daugherty",
    "email": "gernser@yahoo.com",
    "color": "#898FA9",
    "avatar_url": "https://www.gravatar.com/avatar/1ace5b3965c59dbcd1db79d85da75048?d=blank",
    "has_custom_avatar": false,
    "createdAt": "2021-05-24T14:08:31.000000Z",
    "updatedAt": "2021-08-26T13:24:54.000000Z"
  }
}
 */

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
