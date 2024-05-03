public class StringDemo {

    public static String removedup(String str) {
        String res = "";


        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if (res.indexOf(ch) == -1) {
                res = res + ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String output = removedup("praveen sharma");
        System.out.println(output);
    }
}
