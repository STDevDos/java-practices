import java.rmi.RemoteException;
import java.text.ParseException;

/**
 *  Documentation: http://opencsv.sourceforge.net/index.html#general
 */
public class AppCSV {

    private static final String CSV_STUDENTS =
            "name,score,hobby,birthday\n" +
                    "Cometín,95.75,Chess,12/25/1980\n" +
                    "Estela,97.14,soccer,12/25/1985\n" +
                    "Lucas,99.09,painting,12/25/1990";

    public static void main(String[] args) throws RemoteException, ParseException {

                    QuickStart quickStart = new QuickStart(CSV_STUDENTS);
        quickStart.exportCSVToBeans().forEach(System.out::println);
        quickStart.exportBeansToCSV();


    }
}
