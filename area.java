// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import pyvect.pyvect;

public class area 
{
    pyvect obj = new pyvect();
    public static double triangle_adj(int arr1[], int arr2[])
    {
        int c[] = obj.cross(arr1, arr2);
        double mod = obj.modVector(c);
        double res = Math.abs(Math.sqrt(mod));
        return res;
    }
}
