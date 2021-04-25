// JVECT.DIST SUBPACKAGE

// PACKAGE DEFINITION   
package jvect.dist; 

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;

public class dist
{
    // FUNCTION TO FIND DOT PRODUCT
    public static int dot(int[] x, int[] y)
    {
        int dot_prod = 0;
        for(int i=0;i<3;i++) dot_prod += x[i]*y[i];
        return dot_prod;
    }

    // FUNCTION TO FIND CROSS PRODUCT
    public static int[] cross(int[] x,int[] y)
    {
        int[] cross_prod = new int[3];
        cross_prod[0] = x[1]*y[2] - x[2]*y[1];
        cross_prod[1] = (x[0]*y[2] - x[2]*y[0])*-1;
        cross_prod[2] = x[0]*y[1] - x[1]*y[0];
        return cross_prod;
    }

    // FUNCTION TO FIND MODULUS OF A VECTOR
    public static double modVector(int[] arr)
    {
        return Math.sqrt((arr[0]*arr[0])+(arr[1]*arr[1])+(arr[2]*arr[2]));
    }

    // FUNCTION TO FIND THE DISTANCE BETWEEN TWO PARALLEL LINES
    public static double pl_line(int[] a1, int[] a2, int[] u)
    {
        int arr[] = new int[3];
        for (int i = 0; i<3; i++) arr[i] = a2[i] - a1[i];
        double x = modVector(cross(u, arr));
        return x/modVector(u);
    }

    // FUNCTION TO FIND THE DISTANCE BETWEEN TWO SKEW LINES
    public static double sk_line(int[] a1, int[] a2, int[] u, int[] v)
    {
        int arr[] = new int[3];
        for (int i = 0; i<3; i++) arr[i] = a2[i] - a1[i];
        int x = arr[0]*(u[1]*v[2] - (u[2]*v[1])) - (arr[1]*(u[0]*v[2] - (u[2]*v[0]))) + (arr[2]*(u[0]*v[1] - (u[1]*v[0])));
        return Math.abs(x/modVector(cross(u,v)));
    }

    
    // FUNCTION TO FIND THE DISTANCE BETWEEN A POINT AND A PLANE
    public static double pt_plane(int[] point, int[] plane)
    {
        return Math.abs(((plane[0]*point[0])+(plane[1]*point[1])+(plane[2]*point[2])+plane[3])/(Math.pow((plane[0]*plane[0])+(plane[1]*plane[1])+(plane[2]*plane[2]),0.5)));
    }

    
    // FUNCTION TO FIND THE DISTANCE BETWEEN THE ORIGIN AND A PLANE
    public static double or_plane(int[] plane)
    {
        return Math.abs(plane[3]/(Math.pow((plane[0]*plane[0])+(plane[1]*plane[1])+(plane[2]*plane[2]),0.5)));
    }
    
    
    // FUNCTION TO FIND THE DISTANCE TWO PARALLEL PLANES
    public static double pl_planes(int[] plane1, int[] plane2) 
    {
        if (plane1[0]%plane2[0] == 0){
            int x = plane1[0]/plane2[0];
            for (int i=0;i<4;i++) plane2[i] *= x;
        }
        else if (plane2[0]%plane1[0] == 0){
            int x = plane2[0]/plane1[0];
            for (int i=0;i<4;i++) plane1[i] *= x;
        }

        return Math.abs(plane2[3]-plane1[3])/(Math.pow((plane1[0]*plane2[0])+(plane1[1]*plane2[1])+(plane1[2]*plane2[2]),0.5));
    }

    /*
    // FUNCTION TO FIND THE DISTANCE BETWEEN TWO VECTORS
    public static double distance(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        return Math.sqrt(Math.abs(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2)));
    }
      

    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args){
        int a[] = {10,2,4}, b[] = {4,2,6}, c[] = {-7,-6,-9}, d[] = {4,20,12}, b1[] = {1,2,-2,9}, b2[] = {2,4,-4,-6};      
        System.out.println(pl_planes(b2,b1));
    }
     */ 

}