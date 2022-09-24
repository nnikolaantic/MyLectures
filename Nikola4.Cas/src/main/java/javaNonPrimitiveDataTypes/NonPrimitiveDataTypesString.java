/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaNonPrimitiveDataTypes;

/**
 *
 * @author Anta
 */
public class NonPrimitiveDataTypesString {
    public static void main(String[] args) {
        //        Non-primitive data Types
        String str = "string"; //reusing the same object
        System.out.println("Ovo je nas string " + str);
        String str1 = new String("String"); //creating a new objcet
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        System.out.println(str.length());
        
        String konkatenacija = str +str1;
        System.out.println(konkatenacija);
        
        System.out.println(str1.charAt(0));
        
        String prvi = "test";
        String prviDuplikat = "test";
        System.out.println("prvi " + prvi);
        System.out.println("prviDuplikat " + prviDuplikat);
//        == operator je ovde nas prevario onje proveravao da li pokazuju na istu lokaciju a ne njihovu vrednost
        System.out.println(prvi == prviDuplikat);
        
        String drugi = new String("test");
        System.out.println("prvi "  + prvi);
        System.out.println("drugi " + drugi);
        
        System.out.println(prvi == drugi);
        
        System.out.println(prvi.equalsIgnoreCase(drugi));
        System.out.println(prvi.equalsIgnoreCase(prviDuplikat));
        
        
        System.out.println("Kokatenacija---------------------------");
        String abcd = "abcd";
        String efgh = "efgh";
        
        String abcdefgh = abcd.concat(efgh);
        System.out.println(abcdefgh);
        
        System.out.println(abcd.contains("bcd"));
        System.out.println(abcd.contains("efgh"));
    }
}
