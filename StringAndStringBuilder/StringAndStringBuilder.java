package test;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        System.out.println("stringTime:");
        stringTime();
        System.out.println("stringBuilderTime:");
        stringBuilderTime();
    }

    public static void stringTime() {
        long time = System.currentTimeMillis();
        String str = new String();
        for (int i = 0; i < 100000; i++) {
            str = str + "abc" + ":" + i++;
        }
        System.out.println(System.currentTimeMillis() - time);

    }


    public static void stringBuilderTime() {

        long time = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {

            strBuilder = strBuilder.append("abc").append(":").append(i++);

        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
