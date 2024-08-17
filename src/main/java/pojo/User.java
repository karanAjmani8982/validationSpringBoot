package pojo;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import validation.OptionalForId51And52;

@Setter
@Getter
@Builder
@AllArgsConstructor

@ToString
public class User {
    @NotNull(message = "ID cannot be null")
    private String id;
    private String name;
    @NotNull(message = "Number cannot be null")
//    @NotNull(message = "Number cannot be null", groups = OptionalForId51And52.class) // we can use this and check the optional validation
    private String number;
}
