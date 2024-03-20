package dev.dorianhardy.lemonsqueezy.api;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinksResponse {
    private String self;
    private String first;
    private String last;
    private String next;
    private String prev;
}