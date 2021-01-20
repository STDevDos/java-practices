package quick.optional;

import lombok.Data;

import java.util.Optional;

@Data
public class Spaceship {

    private Optional<Engine> engine;
    private String pilot;

}
