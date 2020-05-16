package todo.ejemplo1;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Estudiante {

    private ArrayList<Integer> scores;
    private double average;
    public static String ATRIBUTO_ESTATICO = "ESTATICO1";

    private void computeAverage() {
        if (!this.scores.isEmpty()) {
            //valid code to compute average
            average = this.scores.stream().mapToInt(Integer::intValue).average().getAsDouble();
        }
    }

    public Estudiante() {
        this.scores = new ArrayList<>();
        computeAverage();
    }

}
