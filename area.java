// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package area;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
//import jvect.*;
//import jvect.pyvect;

public class area 
{
    //jvect.pyvect jvect.pyvect = new jvect.pyvect();
    // FUNCTION TO FIND AREA OF TRIANGLE WHEN ADJACENT SIDES ARE GIVEN
    public static double triangle_adj(int arr1[], int arr2[]) 
    {
        int c[] = jvect.pyvect.cross(arr1, arr2);
        double mod = jvect.pyvect.modVector(c);
        double res = Math.abs(Math.sqrt(mod));
        return res;
    }

    // FUNCTION TO FIND AREA OF TRIANGLE WHEN POSITION VECTORS ARE GIVEN
    public static double triangle_pos(int arr1[], int arr2[], int arr3[])
    {
        int c1[] = jvect.pyvect.cross(arr1,arr2);
        int c2[] = jvect.pyvect.cross(arr2,arr3);
        int c3[] = jvect.pyvect.cross(arr3,arr1);
        int c[] = new int[3];
        
        for (int i = 0;i<3;i++) c[i] = c1[i]+c2[i]+c3[i];

        return Math.abs(0.5*jvect.pyvect.modVector(c));
    }

    // FUNCTION TO FIND AREA OF QUADRILATERAL BASED ON DIAGONALS
    public static double quad(int arr1[],int arr2[])
    {
        return Math.abs(0.5*jvect.pyvect.modVector(jvect.pyvect.cross(arr1,arr2)));
    }

    // FUNCTION TO FIND AREA OF PARALLELOGRAM WHEN TWO ADJACENT SIDES ARE GIVEN
    public static double parallelogram(int arr1[], int arr2[])
    {
        return Math.abs(jvect.pyvect.modVector(jvect.pyvect.cross(arr1,arr2)));
    }

    // FUNCTION TO FIND THE AREA OF TETRAHEDRON WHEN THREE POSITIONAL VECTORS ARE GIVEN
    public static double tetrahedron(int arr1[],int arr2[],int arr3[])
    {
        return Math.abs(0.1666*jvect.pyvect.dot(jvect.pyvect.cross(arr1,arr2),arr3));
    }
    
    public static void main(String[] args){
        int a[] = {1,2,3}, b[] = {3,4,5};
        System.out.println(quad(a,b));
    }
}
