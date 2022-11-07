public class StringService {
    public static int Count(String[] arr, char s) {
        int k = 0;
        for (String i : arr) {
            if (i == null || i.equals("")) {
                continue;
            }
            if (i.charAt(0) == s) {
                k++;
            }
        }
        return k;
    }
    public static int Element(String[] arr, String s) {
        int k = 0;
        for (String i : arr) {
            if (i == null) {
                continue;
            }
            if (i.equals(s)) {
                k++;
            }
        }
        return k;
    }
    public static int NoCount(String[] arr, String s) {
        int k = 0;
        for (String i : arr) {
            if (i == null) {
                continue;
            }
            if (!i.contains(s)) {
                k++;
            }
        }
        return k;
    }
    public static int OneElement(String[] arr, String s) {
        int k = 0;
        for (String i : arr) {
            if (i == null) {
                continue;
            }
            if (i.contains(s)) {
                if (i.indexOf(s) == i.lastIndexOf(s)) {
                    k++;
                }
            }
        }
        return k;
    }
    public static String[] Plus(String[] arr) {
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                newArr[i] = String.format("%d", i);
            }
            newArr[i] = String.format("%d", i) + arr[i];
        }
        return newArr;
    }










}
