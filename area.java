// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
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
}
