public class StringInvestigation {
    public static void main(String[] args) {
        String str1;
        str1 = "AP Computer Science";
        String str2 = "cats";
        String str3 = new String("dogs");

        String str = "Von Neumann, John";
        System.out.println(str.substring(str.indexOf(",") + 2) + " " + str.substring(0, str.indexOf(",")));
    }
}
