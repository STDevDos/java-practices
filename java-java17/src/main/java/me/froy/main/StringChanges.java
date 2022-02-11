package me.froy.main;

public class StringChanges {

    record UserRecord(int userId, String userName) {
    }

    public static void main(String[] args) {

        UserRecord userRecord = new UserRecord(1111, "JavaBeam");
        System.out.println(userRecord.userName());

        var textBlock = """
                Name | Address | City
                Bob Smith | 123 Anytown St
                Apt 100 | Vancouver
                Jon Brown | 1000 Golden Place
                Suite 5 | Santa Ana
                """;
        System.out.println(textBlock);

    }

}
