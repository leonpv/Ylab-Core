package Lesson2.Task3;

public class Main {

    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }

    static void fuzzySearch(String str1, String str2) {
        int match = 0;
        int i = 0;
        char[] chArrOfStr2 = str2.toCharArray();
        for (char chArrOfStr1 : str1.toCharArray()) {
            for (; i < str2.length(); i++) {
                if (chArrOfStr1 == chArrOfStr2[i]) {
                    match++;
                    i++;
                    break;
                }
            }
            if (match == str1.length()) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}