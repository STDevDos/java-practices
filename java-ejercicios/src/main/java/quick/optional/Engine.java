package quick.optional;

import lombok.Data;

import java.util.Optional;

@Data
public class Engine {

    private Optional<VelocityMonitor> velocityMonitor;

}
