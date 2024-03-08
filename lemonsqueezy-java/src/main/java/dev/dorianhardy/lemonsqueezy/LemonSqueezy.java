package dev.dorianhardy.lemonsqueezy;

import feign.Param;
import feign.RequestLine;

import java.util.List;

// TODO change prototypes to fit API

public interface LemonSqueezy {

    // user
    @RequestLine("/v1/users/me")
    User retrieveUser();

    // store
    @RequestLine("GET /v1/stores")
    List<Store> listAllStores();

    @RequestLine("GET /v1/stores/{storeId}")
    List<Store> retrieveStore(@Param("storeId") Integer storeId);

    // customer
    @RequestLine("POST /v1/customers")
    void createCustomer();

    @RequestLine("GET /v1/customers/{id}")
    Customer retrieveCustomer();

    @RequestLine("PATCH /v1/customers/{id}")
    void updateCustomer(@Param("id") String owner);

    @RequestLine("GET /v1/customers")
    List<Customer> listAllCustomer();

    // products
    @RequestLine("GET /v1/products/{id}")
    Product retrieveProduct();

    @RequestLine("GET /v1/products")
    List<Product> getAllProducts();

    // variants
    @RequestLine("GET /v1/variants/{id}")
    Variant retrieveVariant();

    @RequestLine("GET /v1/variants")
    List<Variant> listAllVariants();

    // price
    @RequestLine("GET /v1/prices/{id}")
    Price retrievePrice();

    @RequestLine("GET /v1/prices")
    List<Price> listAllPrices();

    // file
    @RequestLine("GET /v1/files/{id}")
    File retrieveFile();

    @RequestLine("GET /v1/files")
    List<File> ListAllFiles();

    // order

    @RequestLine("GET /v1/orders/{id}")
    Order retrieveOrder();

    @RequestLine("GET /v1/orders")
    List<Order> listAllOrders();

    // order item
    @RequestLine("GET /v1/order-items/{id}")
    OrderItem retrieveOrderItem();

    @RequestLine("GET /v1/order-items")
    List<OrderItem> listAllOrderItems();

    // subscriptions
    @RequestLine("PATCH /v1/subscriptions/{id}")
    void updateSubscription();

    @RequestLine("GET /v1/subscriptions/{id}")
    Subscription retrieveSubscription();

    @RequestLine("GET /v1/subscriptions")
    List<Subscription> listAllSubscriptions();

    @RequestLine("DELETE /v1/subscriptions/{id}")
    void CancelSubscription();

    // subscriptions invoice

    @RequestLine("GET /v1/subscription-invoices/{id}")
    SubscriptionInvoice retrieveSubscriptionInvoice();

    @RequestLine("GET /v1/subscription-invoices")
    List<SubscriptionInvoice> listAllSubscriptionInvoices();

    @RequestLine("POST /v1/subscription-invoices/{id}/generate-invoice")
    void GenerateSubscriptionInvoice();

    // subscription-item

    @RequestLine("GET /v1/subscription-items/{id}")
    SubscriptionItem retrieveSubscriptionItem();

    @RequestLine("PATCH /v1/subscription-items/{id}")
    void updateSubscriptionItem();

    @RequestLine("GET /v1/subscription-items")
    List<SubscriptionItem> listAllSubscriptionItems();

    @RequestLine("GET /v1/subscription-items/{id}/current-usage")
    void retrieveSubscriptionItemCurrentUsage();

    // record
    @RequestLine("POST /v1/usage-records")
    void CreateUsageRecord();


    @RequestLine("GET /v1/usage-records/{id}")
    void retrieveUsageRecord();

    @RequestLine("GET /v1/usage-records")
    void listAllUsageRecords();

    // discounts
    @RequestLine("POST /v1/discounts")
    void createDiscount();

    @RequestLine("GET /v1/discounts/{id}")
    void retrieveDiscount();

    @RequestLine("DELETE /v1/discounts/{id}")
    void deleteDiscount();

    @RequestLine("GET /v1/discounts")
    void listAllDiscounts();

    // discount redemption

    @RequestLine("GET /v1/discount-redemptions/{id}")
    void retrieveDiscountRedemption();

    @RequestLine("GET /v1/discount-redemptions")
    void listAllDiscountRedemptions();

    // license-key
    @RequestLine("GET /v1/license-keys/{id}")
    void retrieveLicenseKey();

    @RequestLine("PATCH /v1/license-keys/{id}")
    void updateLicenseKey();

    @RequestLine("GET /v1/license-keys")
    void listAllLicenseKeys();

    @RequestLine("GET /v1/license-key-instances/{id}")
    void retrieveLicenseKeyInstance();

    @RequestLine("GET /v1/license-key-instances")
    void listAllLicenseKeyInstances();

    @RequestLine("POST /v1/checkouts")
    void createCheckout();

    @RequestLine("GET /v1/checkouts/{id}")
    void retrieveCheckout();

    @RequestLine("GET /v1/checkouts")
    void ListAllCheckouts();

    @RequestLine("POST /v1/webhooks")
    void createWebhook();

    @RequestLine("GET /v1/webhooks/{id}")
    void retrieveWebhook();

    @RequestLine("PATCH /v1/webhooks/{id}")
    void updateWebhook();

    @RequestLine("DELETE /v1/webhooks/{id}")
    void deleteWebhook();

    @RequestLine("GET /v1/webhooks")
    void listAllWebhooks();
}


