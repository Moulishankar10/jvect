// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;

public class area 
{
    
    // FUNCTION TO FIND AREA OF TRIANGLE WHEN ADJACENT SIDES ARE GIVEN
    public static double triangle_adj(int arr1[], int arr2[]) 
    {
        int c[] = cross(arr1, arr2);
        double mod = modVector(c);
        double res = Math.abs(Math.sqrt(mod));
        return res;
    }

    // FUNCTION TO FIND AREA OF TRIANGLE WHEN POSITION VECTORS ARE GIVEN
    public static double triangle_pos(int arr1[], int arr2[], int arr3[])
    {
        int c1[] = cross(arr1,arr2);
        int c2[] = cross(arr2,arr3);
        int c3[] = cross(arr3,arr1);
        int c[] = new int[3];
        
        for (int i = 0;i<3;i++) c[i] = c1[i]+c2[i]+c3[i];

        return Math.abs(0.5*modVector(c));
    }

    // FUNCTION TO FIND AREA OF QUADRILATERAL BASED ON DIAGONALS
    public static double quad(int arr1[],int arr2[])
    {
        return Math.abs(0.5*modVector(cross(arr1,arr2)));
    }

    // FUNCTION TO FIND AREA OF PARALLELOGRAM WHEN TWO ADJACENT SIDES ARE GIVEN
    public static double parallelogram(int arr1[], int arr2[])
    {
        return Math.abs(modVector(cross(arr1,arr2)));
    }

    // FUNCTION TO FIND THE AREA OF TETRAHEDRON WHEN THREE POSITIONAL VECTORS ARE GIVEN
    public static double tetrahedron(int arr1[],int arr2[],int arr3[])
    {
        return Math.abs(0.1666*dot(cross(arr1,arr2),arr3));
    }
    
}
