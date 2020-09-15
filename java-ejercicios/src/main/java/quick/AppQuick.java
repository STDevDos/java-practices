package quick;

import lombok.extern.java.Log;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

@Log
public class AppQuick {

    public static void main(String[] args) {

        //ESAPI.encoder().encodeForHTML("");
//        quick6();

//        AtomicInteger atomicInteger = new AtomicInteger();
//        System.out.println(atomicInteger.getAndIncrement());
//        System.out.println(atomicInteger.getAndIncrement());
//        System.out.println(atomicInteger);
//
//        // Initially value as 18
//        AtomicInteger val = new AtomicInteger();
//
//        System.out.println("Previous value: " + val.getAndIncrement());
//        // Prints the updated value
//        System.out.println("Current value: "  + val);

        quick7();


    }

    public static void quick7(){

        Map<String,String> map = new HashMap<>();
        map.put("1","uno");
//        map.put("2","dos");
        map.put("3","tres");
//        map.put("4","cuatro");

        List<String> listString = new ArrayList<>(map.keySet());

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        Collections.reverse(listString);
        for(String index : listString){
            listInteger.remove(Integer.valueOf(index));
        }

        System.out.println(listInteger);

    }

    public static void quick6(){

        BigDecimal bigDecimalA = new BigDecimal(50);
        BigDecimal bigDecimalB = new BigDecimal(49);

        System.out.println(bigDecimalA.compareTo(bigDecimalB) > 0);

        Persona persona = new Persona();
        persona.setNombre("Loco");
        System.out.println(Optional.ofNullable(persona).map(Persona::getNombre).orElse("Chato"));

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

    static class Persona {
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

}
