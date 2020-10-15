import java.lang.*;
import java.io.*;
import java.util.*;

class Revers{
    public static void main(String[] args) {
        String input = "Falih";
        byte[] strAsByteArray = input.getBytes(); 
  
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++) 
        result[i] = strAsByteArray[strAsByteArray.length - i - 1]; 

    System.out.println(new String(result)); 
    }
}