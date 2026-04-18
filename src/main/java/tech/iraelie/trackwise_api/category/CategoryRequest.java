package tech.iraelie.trackwise_api.category;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryRequest {
    private String name;
}
