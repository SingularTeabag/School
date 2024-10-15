public class StringInvestigation {
    public static void main(String[] args) {
        /* 
        String str = "Von Neumann, John";
        System.out.println(str.substring(str.indexOf(",") + 2) + " " + str.substring(0, str.indexOf(",")));
        */
        int x = 5;
        Integer x1 = new Integer(5);
        
        double y = 3.2;
        Double y1 = new Double(y);

        System.out.println(x);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(y1);

        int x2 = x1;
        
    }

    public static String scroll(String str)
   {
       return str.substring(1) + str.substring(0,1);
   }
   
   public static Boolean StartsWith(String str, String start){
       return str.substring(0,start.length()).equals(start);
    }
    
   public static Boolean EndsWith(String str, String end){
      return str.substring(str.length()- end.length()).equals(end);
   }
}
