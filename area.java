// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
<<<<<<< HEAD
import java.lang.*;
import pyvect.pyvect;

public class area 
{
    
    public static double triangle_adj(int arr1[], int arr2[])
    {
        pyvect obj = new pyvect();
        int c[] = obj.cross(arr1, arr2);
        //for (int i=0;i<c.length;i++) System.out.println(i);    
        double mod = obj.modVector(c);
        //System.out.println(mod);    
        double res = Math.sqrt(mod);
        return res;
    }
    
    //public static void main(String[] args) 
    //{
      //  int a[] = {1,2,3};
       // int b[] = {4,5,6};
        //double res = triangle_adj(a,b);
        //System.out.println(res);    
    //}
=======
import java.lang.Math;
import pyvect.*;

public class area 
{
    static pyvect obj = new pyvect();

    public static double triangle_adj(int arr1[], int arr2[]) {
        int c[] = pyvect.cross(arr1, arr2);
        double mod = pyvect.modVector(c);
        double res = Math.abs(Math.sqrt(mod));
        return res;
    }

    public static void main(String[]args)
    {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        System.out.println(triangle_adj(a,b));

    }
>>>>>>> 25898c1dac1efbf45d0d1d1a5b2ecdc7ab791b09
}
