package dev.dorianhardy.lemonsqueezy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceTest {

    @Test
    public void shouldLookToJson() {

        Price price = new Price();
        price.setVariantID(1);
        price.setCategory("subscription");
        price.setScheme("graduated");
        price.setUsageAggregation(null);
        price.setUnitPrice(999);
        price.setUnitPriceDecimal(null);
        price.setSetupFeeEnabled(false);
        price.setSetupFee(null);
        price.setPackageSize(1);
        price.setTiers(new PriceAttributesTiers[] {
            new PriceAttributesTiers(2, 10000, null, 1000),
            new PriceAttributesTiers(2, 1000, null, 1000) // "inf" in null in this case
        });
        price.setRenewalIntervalUnit("year");
        price.setRenewalIntervalQuantity(1);
        price.setTrialIntervalUnit("day");
        price.setTrialIntervalQuantity(30);
        price.setMinPrice(null);
        price.setSuggestedPrice(null);
        price.setTaxCode("eservice");
        price.setCreatedAt("2023-05-24T14:15:06.000000Z");
        price.setUpdatedAt("2023-06-24T14:44:38.000000Z");

        String json = price.toJson();

        final String expected = """
                {"variant_id":1,"category":"subscription","scheme":"graduated","usage_aggregation":null,"unit_price":999,"unit_price_decimal":null,"setup_fee_enabled":false,"setup_fee":null,"package_size":1,"tiers":[{"last_unit":2,"unit_price":10000,"unit_price_decimal":null,"fixed_fee":1000},{"last_unit":2,"unit_price":1000,"unit_price_decimal":null,"fixed_fee":1000}],"renewal_interval_unit":"year","renewal_interval_quantity":1,"trial_interval_unit":"day","trial_interval_quantity":30,"min_price":null,"suggested_price":null,"tax_code":"eservice","created_at":"2023-05-24T14:15:06.000000Z","updated_at":"2023-06-24T14:44:38.000000Z"}""";

        assertEquals(expected, json);

    }
}
