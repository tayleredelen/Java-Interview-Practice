//package TimeConversion;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class TimeConversion {
//
//    /*
//     * Complete the 'timeConversion' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
////    public static String timeConversion(String s) {
////        // Write your code here
////        String str = "";
////        if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
////            str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
////            s = str + s.substring(2, s.length());
////        }
////        if (s.substring(0, 2).equals("12") && s.contains("AM")) {
////            str = "00";
////            s = str + s.substring(2, s.length());
////        }
////        return s.substring(0, s.length() - 2);
////    }
//
//    public static String timeConversion(String s) {
//        // Initialize an empty string variable 'str'
//        String str = "";
//
//        // If the time is not 12:00 PM and contains "PM"
//        if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
//            // Convert the hour to military format by adding 12 to it
//            str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
//            // Update the input string with the new hour
//            s = str + s.substring(2, s.length());
//        }
//
//        // If the time is 12:00 AM
//        if (s.substring(0, 2).equals("12") && s.contains("AM")) {
//            // Set the hour to 00
//            str = "00";
//            // Update the input string with the new hour
//            s = str + s.substring(2, s.length());
//        }
//
//        // Return the converted time without the last two characters ("AM" or "PM")
//        return s.substring(0, s.length() - 2);
//    }
//
//
//
//    public static class TimeConversion {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String s = bufferedReader.readLine();
//
//            String result = TimeConversion.timeConversion(s);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//
//        private static String timeConversion(String s) {
//        }
//    }
//}