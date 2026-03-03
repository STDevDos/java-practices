package quick;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.*;
import java.util.stream.IntStream;

public class AppQuick {
    @java.lang.SuppressWarnings("all")
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(AppQuick.class.getName());

    public static void main(String[] args) throws Exception {
        // whenIsEncryptedAndDecrypted_thenDecryptedEqualsOriginal();
        quick10();
    }

    public static void whenIsEncryptedAndDecrypted_thenDecryptedEqualsOriginal() throws Exception {
        byte[] salt = new byte[32];
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        random.nextBytes(salt);
        KeySpec spec = new PBEKeySpec("passwordm".toCharArray(), salt, 65536, 256);
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

    public static void quick9() {
        String[] headers = { "Content-Type", "Authorization" };
        for (String header : headers) {
            log.info(header);
        }
    }

    // Lógica nativa para reemplazar NumberUtils
    public static boolean isCreatable(String str) {
        if (str == null || str.isEmpty())
            return false;
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDigits(String str) {
        if (str == null || str.isEmpty())
            return false;
        return str.chars().allMatch(Character::isDigit);
    }

    public static void quick10() {
        System.out.println(isCreatable("2.33"));
        System.out.println(isDigits("2.33"));
        System.out.println(isCreatable("2.33f"));
        System.out.println(isDigits("2.33f"));
        System.out.println(isCreatable("-2.33"));
    }

    public static void quick8() {
        // Reemplazo de RandomStringGenerator con SecureRandom nativo de Java
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom random = new SecureRandom();
        String returnStr = IntStream.range(0, 4)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(chars::charAt)
                .map(Object::toString)
                .collect(java.util.stream.Collectors.joining());

        log.info("Generated string: " + returnStr);
    }

    public static void quick7() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "uno");
        map.put("3", "tres");
        List<String> listString = new ArrayList<>(map.keySet());
        List<Object> listInteger = new ArrayList<>();
        listInteger.add("11");
        listInteger.add("22");
        listInteger.add("33");
        listInteger.add("44");
        System.out.println(listInteger);
        System.out.println(listInteger.stream().sorted());
        Collections.reverse(listString);
        for (String index : listString) {
            listInteger.remove(Integer.valueOf(index));
        }
        listInteger.remove(1);
        System.out.println(listInteger);
        List<String> list = List.of("node", "java", "c++", "react", "javascript");
        String result = list.stream().reduce((first, second) -> second).orElse("no last element");
        System.out.println(result);
    }

    public static void quick6() {
        BigDecimal bigDecimalA = new BigDecimal(50);
        BigDecimal bigDecimalB = new BigDecimal(49);
        System.out.println(bigDecimalA.compareTo(bigDecimalB) > 0);
        Persona persona = new Persona();
        persona.setNombre("Loco");
        System.out.println(Optional.ofNullable(persona).map(Persona::getNombre).orElse("Chato"));
    }

    public static void quick5() {
        Integer psnId = null;
        Map<String, Object> map = new HashMap<>();
        map.put("psnId", psnId);
        System.out.println(map.get("psnId"));
        System.out.println(map);
    }

    public static void quick4() {
        Integer valorA = null;
        Integer valorB = 1;
        System.out.println(!Objects.equals(valorA, valorB));
    }

    public static void quick3() {
        List<String> listString = null;
        try {
            System.out.println(listString.isEmpty());
        } catch (NullPointerException e) {
            System.out.println("listString is null");
        }
    }

    public void quick2() {
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom random = new SecureRandom();
        String result = IntStream.range(0, 4)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(chars::charAt)
                .map(Object::toString)
                .collect(java.util.stream.Collectors.joining());
        log.info(result);
    }

    public void quick1() {
        String inputMask = "MM/dd/yyyy";
        String stringData = "05/25/2020 12:13";
        try {
            stringData = stringData.substring(0, inputMask.length());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inputMask)
                    .withResolverStyle(ResolverStyle.STRICT);
            LocalDate date = LocalDate.parse(stringData, formatter);
            log.info(date.toString());
        } catch (Exception pe) {
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
