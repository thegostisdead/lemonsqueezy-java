package dev.dorianhardy.lemonsqueezy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
class PriceAttributesTiers {
    @JsonProperty("last_unit")
    private Integer  lastUnit;

    @JsonProperty("unit_price")
    private Integer  unitPrice;

    @JsonProperty("unit_price_decimal")
    private Object unitPriceDecimal;

    @JsonProperty("fixed_fee")
    private Integer  fixedFee;
}

@Data
@NoArgsConstructor()
@AllArgsConstructor()
@Builder
public class Price {

    @JsonProperty("variant_id")
    private int variantID;

    @JsonProperty("category")
    private String category;

    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("usage_aggregation")
    private Object usageAggregation;

    @JsonProperty("unit_price")
    private int unitPrice;

    @JsonProperty("unit_price_decimal")
    private Object unitPriceDecimal;

    @JsonProperty("setup_fee_enabled")
    private boolean setupFeeEnabled;

    @JsonProperty("setup_fee")
    private Object setupFee;

    @JsonProperty("package_size")
    private int packageSize;

    @JsonProperty("tiers")
    private PriceAttributesTiers[] tiers;

    @JsonProperty("renewal_interval_unit")
    private String renewalIntervalUnit;

    @JsonProperty("renewal_interval_quantity")
    private int renewalIntervalQuantity;

    @JsonProperty("trial_interval_unit")
    private String trialIntervalUnit;

    @JsonProperty("trial_interval_quantity")
    private int trialIntervalQuantity;

    @JsonProperty("min_price")
    private Object minPrice;

    @JsonProperty("suggested_price")
    private Object suggestedPrice;

    @JsonProperty("tax_code")
    private String taxCode;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            return null;
        }
    }

}
