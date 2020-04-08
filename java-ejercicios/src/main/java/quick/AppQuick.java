package quick;

import ejemplo1.Estudiante;
import ejemplo1.IEstudiante;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

@Log
public class AppQuick {

    public static void main(String[] args) {

        String inputMask = "MM/dd/yyyy";
        String stringData = "05/25/2020 12:13";

        try{
            stringData = StringUtils.substring(stringData,0,inputMask.length());
            Date date = DateUtils.parseDateStrictly(stringData,inputMask);
            log.info(date.toString());
        }catch(ParseException pe){
            pe.printStackTrace();
        }


    }

}
