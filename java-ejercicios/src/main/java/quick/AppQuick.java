package quick;

import lombok.extern.java.Log;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.owasp.esapi.ESAPI;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

@Log
public class AppQuick {

    public static void main(String[] args) {

        //ESAPI.encoder().encodeForHTML("");
        quick6();

    }

    public static void quick6(){

        BigDecimal bigDecimalA = new BigDecimal(50);
        BigDecimal bigDecimalB = new BigDecimal(49);

        System.out.println(bigDecimalA.compareTo(bigDecimalB) > 0);

    }

    public static void quick5(){
        Integer psnId = null;

        Map<String,Object> map = new HashMap<>();
        map.put("psnId",psnId);

        System.out.println(map.get("psnId"));

        System.out.println(map);
    }

    public static void quick4(){

//        Integer valorA = Integer.valueOf("1");
        Integer valorA = null;
//        int valorA = 1;
//        Long valorA = 1L;
        Integer valorB = 1;

        //System.out.println(valorA != valorB);
        //System.out.println(valorA.equals(valorB)); NPE
        System.out.println(!Objects.equals(valorA,valorB));



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
