// JVECT.CENT SUBPACKAGE

// PACKAGE DEFINITION
package jvect.cent;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class cent
{
    //FUNCTION TO FIND CENTROID IOF A TRIANGLE
    public static double[] triangle_cent(int[] arr1, int[] arr2,int[] arr3)
    {
        double res[] = new double[3];
        for (int i = 0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i])*0.33;
        return res;
    }

    //FUNCTION TO FIND CENTROID OF A TETRAHEDRON
    public static double[] tetrahedron_cent(int[] arr1, int[] arr2,int[] arr3, int[] arr4)
    {
        double res[] = new double[3];
        for (int i=0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i]+arr4[i])*0.25;
        return res;
    }
    
    /*
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args) 
    {
        int a[] = {10,2,4};
        int b[] = {4,2,6};
        int c[] = {-7,-6,-9};
        int d[] = {4,20,12};
        double result[] = tetrahedron_cent(a,b,c,d);
        System.out.println(Arrays.toString(result));
        System.out.println();
        
        
        
    }
  */  
} 