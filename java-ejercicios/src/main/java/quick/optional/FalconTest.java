package quick.optional;

import java.util.Optional;

public class FalconTest {

    public static void main(String[] args) {

        Spaceship falcon = new Spaceship();
        Optional<Spaceship> optionalFalcon = Optional.of(falcon);

        Optional<Velocity> velocity = optionalFalcon //
                .flatMap(Spaceship::getEngine)
                .flatMap(Engine::getVelocityMonitor)
                .map(VelocityMonitor::getVelocity);

        Velocity velocityElse = new Velocity();
        velocityElse.setData("VELOCITY ELSE...");

        System.out.println(velocity.orElse(velocityElse));

    }

}
