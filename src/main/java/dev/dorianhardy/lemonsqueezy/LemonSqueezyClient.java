package dev.dorianhardy.lemonsqueezy;


import feign.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@AllArgsConstructor
@Getter
@Setter
public class LemonSqueezyClient {

    private String apiKey;
    private LemonSqueezyConfig config;
    private HttpClient client;

    public LemonSqueezyClient(String apiKey) {
        this.apiKey = apiKey;
        this.config = new LemonSqueezyConfig(apiKey, "aze");
        this.client = HttpClient.newHttpClient();
    }

    public HttpRequest newRequest(Request.HttpMethod method, String url, String body) {
        // TODO : change body to be a json object

        return HttpRequest.newBuilder()
                .uri(URI.create(this.config.getBaseUrl() + "/api/v1/price"))
                .header("Authorization", "Bearer " + this.apiKey)
                .header("Content-Type", "application/vnd.api+json")
                .header("Accept", "application/vnd.api+json")
                .method(method.name(), HttpRequest.BodyPublishers.ofString(body))
                .build();

    }

    public void sendRequest(Request.HttpMethod method, String url, String body) {
        HttpRequest request = newRequest(method, url, body);
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
