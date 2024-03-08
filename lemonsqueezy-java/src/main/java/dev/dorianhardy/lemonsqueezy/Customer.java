package dev.dorianhardy.lemonsqueezy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

enum Status {
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed"),
    ARCHIVED("archived"),
    REQUIRES_VERIFICATION("requires_verification"),
    INVALID_EMAIL("invalid_email"),
    BOUNCED("bounced");

    private final String status;

    Status( String status) {
        this.status = status;
    }
}


@RequiredArgsConstructor
class CustomerUrl {
    private String customerPortal;
}

@RequiredArgsConstructor
@Getter
@Setter
public class Customer {
    private Integer storeId;
    private String name;
    private String email;
    private Status status;
    private String city;
    private String region;
    private String country;
    private Integer totalRevenueCurrency;
    private Integer mrr;
    private String statusFormatted;
    private String countryFormatted;
    private String totalRevenueCurrencyFormatted;
    private String mrrFormatted;
    private CustomerUrl urls;
    private String createdAt;
    private String updatedAt;
    private Boolean testMode;
}
