package quick;

import lombok.extern.java.Log;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.owasp.esapi.ESAPI;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Log
public class AppQuick {

    public static void main(String[] args) {

        //ESAPI.encoder().encodeForHTML("");
        quick3();

    }

    public static void quick3(){
        List<String> listString = null;
        System.out.println(listString.isEmpty());
    }

    public void quick2() {
        log.info(RandomStringUtils.randomAlphanumeric(4));
    }

    public void quick1() {

        String inputMask = "MM/dd/yyyy";
        String stringData = "05/25/2020 12:13";

        try {
            stringData = StringUtils.substring(stringData, 0, inputMask.length());
            Date date = DateUtils.parseDateStrictly(stringData, inputMask);
            log.info(date.toString());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

    }

}
