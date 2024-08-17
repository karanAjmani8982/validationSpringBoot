package pojo;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@ToString
public class Product {
    @NotNull(message = "ID cannot be null")
    private String id;
    private String name;
    @NotNull(message = "Number cannot be null")
    private String number;
}
