package dev.dorianhardy.lemonsqueezy;

/*
      "name": "My Store",
      "slug": "my-store",
      "domain": "my-store.lemonsqueezy.com",
      "url": "https:\/\/demo-store.lemonsqueezy.com",
      "avatar_url": "https:\/\/app.lemonsqueezy.com\/storage\/avatars\/stores\/1\/czTkMkDm4Vfb8PZehb5c29XFCm9JZyJx0AjEZP7s.png",
      "plan": "fresh",
      "country": "US",
      "country_nicename": "United States",
      "currency": "USD",
      "total_sales": 1,
      "total_revenue": 999,
      "thirty_day_sales": 0,
      "thirty_day_revenue": 0,
      "created_at": "2021-05-24T14:15:06.000000Z",
      "updated_at": "2021-06-15T10:03:14.000000Z"
 */

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Store {

    private String name;
    private String slug;
    private String domain;
    private String url;
    private String avatarUrl;
    private String plan;
    private String country;
    private String countryNiceName;
    private String currency;
    private Integer totalSales;
    private Integer totalRevenue;
    private Integer thirtyDaySales;
    private Integer thirtyDayRevenue;
    private String createdAt;
    private String updatedAt;


}
