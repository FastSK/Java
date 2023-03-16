package Class.WrapperClass;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        // wrapper class =  provides a way to use primitive data types as reference data types(=objects)
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char   Character
        // int   Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        ArrayList<Integer> number = new ArrayList<Integer>(); // primitive type int is not valid

        // toString :  convert Integer to a String
        String newC = c.toString();
        System.out.println(newC); // newC is string
        System.out.println(a);
        System.out.println(d);
    }
}
