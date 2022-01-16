import java.util.Arrays;

public class Tasks {
    static int[] arr = new int[11];
    static int i;
    static int b = 5;

    public static void main(String[] args) {
        for (i = 0; i < arr.length; i++) {
            arr[i] = b;
            b++;
        }
        System.out.println(Arrays.toString(arr));

        String str = "Sometimes";
        System.out.println(str.charAt(2));

        String id1 = "Ivan Ivanov";
        String id2 = "vovan ivanov";
        System.out.println(id1.equals(id2));
        System.out.println(chekUserName(id1, id2));

        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

    }

    private static String removeWhiteSpaces(String s) {
        String str = s.replace(" ","");
        return str;
    }

    public static String chekUserName(String id1, String id2) {
        String resolve;
        if (id1.equalsIgnoreCase(id2)==true) {
            resolve = "Choose an another name!!";
        } else {
            resolve = "It is a great name!! Your name contains " + id2.length() + " letters!\n" +
                    "Without spaces length is " + id2.replace(" ","").length();
        }
        return resolve;
    }
}
