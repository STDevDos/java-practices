package quick;

import java.util.stream.Stream;

public class AppStreams {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4) //Creates a stream containing the integers: 1, 2, 3, 4.
                .filter(e -> e > 2) //Filters the stream to keep only the numbers greater than 2.
                .map(e -> e * 10) //Transforms the remaining numbers by multiplying each one by 10.
                .forEach(System.out::println); //Iterates over the final results and prints them to the console.

    }

}
