package dev.dorianhardy.lemonsqueezy.api;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LemonSqueezyResponse<D, M, L, I> {
    private Jsonapi jsonapi;
    private L links;
    private M meta;
    private D data;
    private I[] included;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Jsonapi {
        private String version;
    }
}