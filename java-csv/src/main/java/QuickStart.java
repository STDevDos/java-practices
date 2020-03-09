import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import model.Student;

import java.io.*;
import java.util.List;

public class QuickStart {

    private String CSV;
    private Reader reader;
    private CSVReader csvReader;

    private QuickStart() {
        throw new UnsupportedOperationException("Not valid operation.");
    }

    public QuickStart(String CSV) {
        this.CSV = CSV;
        this.reader = new StringReader(CSV);
        this.csvReader = new CSVReaderBuilder(reader).build();
    }

    public List<Student> exportCSVToBeans() {

        CsvToBean<Student> beans = new CsvToBeanBuilder<Student>(this.reader) //
                .withType(Student.class) //
                //Si en la tercera columna se encuetra el valor soccer, este será filtrado
                .withFilter(line -> !line[2].equals("soccer")) //
                .build();

        List<Student> students = beans.parse();

        return students;

    }

    public void exportBeansToCSV() {

        Student student1 = new Student();
        student1.setScore("8.8");
        student1.setBirthday("02/02/1995");
        student1.setHobby("basketball");
        student1.setName("Jordan");

        Student student2 = new Student();
        student2.setScore("7.8");
        student2.setBirthday("02/02/1996");
        student2.setHobby("basketball");
        student2.setName("Pipen");

        List<Student> listStudents = List.of(student1,student2);

        try {
            Writer writer = new FileWriter("studentCSV.csv");
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(listStudents);
            writer.close();
        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }

    }

}
