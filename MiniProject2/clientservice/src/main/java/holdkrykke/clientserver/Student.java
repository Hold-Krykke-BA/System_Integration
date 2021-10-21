package holdkrykke.clientserver;

import lombok.Data;
import lombok.NonNull;

@Data
public class Student {
    private Long id;
    @NonNull private String name;
}
