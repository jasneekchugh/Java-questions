package Strings;

public class repeat_String_n_times {
    public static void main(String args[]){
    String result = repeatStringnTimes("Hello", 3);
    System.out.print(result);
    }

    public static String repeatStringnTimes( String str, int n) {

        String result = "";
        while (n != 0) {
            result += str;
            n--;
        }
        return result;
    }
}
.
