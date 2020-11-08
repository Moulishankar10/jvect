// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
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
}
