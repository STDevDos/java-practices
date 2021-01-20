package quick;

import lombok.extern.java.Log;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.text.RandomStringGenerator;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.text.ParseException;
import java.util.*;

import static org.apache.commons.text.CharacterPredicates.DIGITS;
import static org.apache.commons.text.CharacterPredicates.LETTERS;

@Log
public class AppQuick {

    public static void main(String[] args) throws Exception {
        //whenIsEncryptedAndDecrypted_thenDecryptedEqualsOriginal();
        quick10();
    }

    public static void whenIsEncryptedAndDecrypted_thenDecryptedEqualsOriginal() throws Exception {

        //https://www.baeldung.com/java-secure-random
        byte[] salt = new byte[32];

        SecureRandom random = SecureRandom.getInstance("SHA1PRNG"); //apply Default algorithm -> SHA1PRNG
        random.nextBytes(salt); //apply random to salt variable.

        //TODO: PBEKeySpec -> https://stackoverrun.com/es/q/1527120
        KeySpec spec = new PBEKeySpec("passwordm".toCharArray(), salt, 65536, 256); // AES-256
        SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] key = f.generateSecret(spec).getEncoded();

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key, "AES");

        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedMessageBytes = cipher.doFinal("$Xolos197204".getBytes());

        Base64.Encoder encoder = Base64.getEncoder();
        String base64Encoder = encoder.encodeToString(encryptedMessageBytes);
        System.out.println(base64Encoder);

        Base64.Decoder decoder = Base64.getDecoder();

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedMessageBytes = cipher.doFinal(decoder.decode(base64Encoder));
        System.out.println(new String(decryptedMessageBytes));


    }

    public static void quick9(){
        String[] headers = null;

        for(String header : headers){
            System.out.println(header);
        }
    }

    public static void quick10(){
        System.out.println(NumberUtils.isCreatable("2.33"));
        System.out.println(NumberUtils.isDigits("2.33"));
        System.out.println(NumberUtils.isParsable("2.33"));

        System.out.println(NumberUtils.isCreatable("2.33f"));
        System.out.println(NumberUtils.isDigits("2.33f"));
        System.out.println(NumberUtils.isParsable("2.33f"));

        System.out.println(NumberUtils.isCreatable("-2.33"));
        System.out.println(NumberUtils.isDigits("-2.33"));
        System.out.println(NumberUtils.isParsable("-2.33"));

        System.out.println(NumberUtils.isCreatable("a"));
        System.out.println(NumberUtils.isDigits("a"));
        System.out.println(NumberUtils.isParsable("a"));

        System.out.println(NumberUtils.isCreatable(""));
        System.out.println(NumberUtils.isDigits(""));
        System.out.println(NumberUtils.isParsable(""));

        System.out.println(NumberUtils.isCreatable(null));
        System.out.println(NumberUtils.isDigits(null));
        System.out.println(NumberUtils.isParsable(null));

        System.out.println(NumberUtils.isCreatable("0"));
        System.out.println(NumberUtils.isDigits("0"));
        System.out.println(NumberUtils.isParsable("0"));

    }

    public static void quick8(){
        System.out.println(RandomStringUtils.randomAlphanumeric(4));

        String returnStr = new RandomStringGenerator.Builder() //
                .withinRange('0', 'z') //
                .filteredBy(LETTERS,DIGITS)
                .build()
                .generate(4);

        System.out.println(returnStr);

    }

    public static void quick7(){

        Map<String,String> map = new HashMap<>();
        map.put("1","uno");
//        map.put("2","dos");
        map.put("3","tres");
//        map.put("4","cuatro");

        List<String> listString = new ArrayList<>(map.keySet());

        List<Object> listInteger = new ArrayList<>();
        listInteger.add("11");
        listInteger.add("22");
        listInteger.add("33");
        listInteger.add("44");

        System.out.println(listInteger);
        System.out.println(listInteger.stream().sorted());

        Collections.reverse(listString);
        for(String index : listString){
            listInteger.remove(Integer.valueOf(index));
        }

        listInteger.remove(1);

        System.out.println(listInteger);


        List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");
        String result = list.stream().reduce((first, second) -> second).orElse("no last element");
        System.out.println(result);

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
