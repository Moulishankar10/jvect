// PYVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package pyvect.area;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;

public class area 
{
    // PRIVATE FUNCTIONS
    private static int[] cross(int x[],int y[])
    {
        int cross_prod[] = {0,0,0};
        cross_prod[0] = x[1]*y[2] - x[2]*y[1];
        cross_prod[1] = x[2]*x[0] - x[0]*y[2];
        cross_prod[2] = x[0]*y[1] - x[1]*y[0];
        return cross_prod;
    }

    private static double modVector(int arr[])
    {
        double mod = Math.sqrt((arr[0]^2)+(arr[1]^2)+(arr[2]^2));
        return mod;
    }

    // PUBLIC FUNCTIONS
    public static double triangle_adj(int arr1[], int arr2[]) 
    {
        int c[] = cross(arr1, arr2);
        double mod = modVector(c);
        double res = Math.abs(Math.sqrt(mod));
        return res;
    }

    public static double triangle_pos(int arr1[], int arr2[], int arr3[])
    {
        int c1[] = cross(arr1,arr2);
        int c2[] = cross(arr2,arr3);
        int c3[] = cross(arr3,arr1);
        int c[] = {0,0,0};
        
        for (int i = 0;i<3;i++)
        {
            c[i] = c1[i]+c2[i]+c3[i];
        }

        return Math.abs(0.5*modVector(c));
    }

    public static double quad(int arr1[],int arr2[])
    {
        return Math.abs(0.5*modVector(cross(arr1,arr2)));
    }

    public static double parallelogram(int arr1[], int arr2[])
    {
        return Math.abs(modVector(cross(arr1,arr2)));
    }
    public static void main(String[]args)
    {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        System.out.println(triangle_adj(a,b));

    }
}
