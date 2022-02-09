public class Year{
   public static boolean isLeapYear(int year) {
      if (year % 4 != 0) {
         return false;
      }
      else if (year % 400 == 0) {
         return true; 
      }
      else if (year % 100 == 0) {
         return false;
      } 
      else {
         return true;
      } 
  }

  public static void main(String[] args){
     int year = Integer.parseInt(args[0]);

     if (isLeapYear(year)) {
       System.out.println (year + " is a leap year");
     }
     else {
      System.out.println (year + " is not a leap year");
    } 
  }

}
