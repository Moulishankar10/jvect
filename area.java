// JVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package jvect.area;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class area 
{
    // FUNCTION TO FIND DOT PRODUCT
    public static int dot(int x[], int y[])
    {
        int dot_prod = 0;
        for(int i=0;i<3;i++) dot_prod += x[i]*y[i];
        return dot_prod;
    }

    // FUNCTION TO FIND CROSS PRODUCT
    public static int[] cross(int x[],int y[])
    {
        int[] cross_prod = new int[3];
        cross_prod[0] = x[1]*y[2] - x[2]*y[1];
        cross_prod[1] = x[2]*x[0] - x[0]*y[2];
        cross_prod[2] = x[0]*y[1] - x[1]*y[0];
        return cross_prod;
    }

    // FUNCTION TO FIND MODULUS OF A VECTOR
    public static double modVector(int arr[])
    {
        return Math.sqrt((arr[0]*arr[0])+(arr[1]*arr[1])+(arr[2]*arr[2]));
    }

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
    
    public static void main(String[] args){
        int a[] = {-2,2,-3}, b[] = {3,4,-5};
        System.out.println(parallelogram(a,b));
        System.out.println(modVector(a));
    }
}
