package dev.dorianhardy.lemonsqueezy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class LemonSqueezyConfig {

    private String baseUrl;
    private String apiKey;
    private String signingSecret;

    public LemonSqueezyConfig(String apiKey, String signingSecret) {
        this.baseUrl = "https://api.lemonsqueezy.com";
        this.apiKey = apiKey;
        this.signingSecret = signingSecret;
    }


    public LemonSqueezyConfig(String baseUrl, String apiKey, String signingSecret) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.signingSecret = signingSecret;
    }
}
