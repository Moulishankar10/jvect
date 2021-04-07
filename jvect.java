// PACKAGE DEFINITION
package jvect;

// IMPORTING REQUIRED LIBRARIES
import java.lang.Math;
import java.util.*;


// PYVECT MAIN CLASS
public class jvect
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
        return Math.sqrt((arr[0]^2)+(arr[1]^2)+(arr[2]^2));
    }

    // FUNCTION TO FIND ANGLE BETWEEN TWO VECTORS
    public static double angle(int x[],int y[])
    {
        return Math.acos((dot(x,y))/(modVector(x)*modVector(y)));
    }

    // FUNCTION TO FIND PROJECTION OF A VECTOR OVER ANOTHER
    public static double projection(int x[], int y[])
    {
        return dot(x,y)/modVector(y);
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE PERPENDICULAR
    public static boolean isPerpendicular(int x[], int y[])
    {
        boolean res = (dot(x,y) == 0)?true:false;
        return res;
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE COLLINEAR
    public static boolean isCollinear(int x[], int y[])
    {
        int c[] = cross(x,y);
        boolean result = ((c[0]==0)&&(c[1]==0)&&(c[2]==0))?true:false;
        return result;
    }

    // FUNCTION TO FIND UNIT VECTOR
    public static double[] unitVector(int arr[])
    {
        double[] unit = new double[3];
        for(int i=0;i<3;i++) unit[i] = arr[i]/modVector(arr);
        return unit;
    }

    // FUNCTION TO FIND UNIT NORMAL 
    public static double[][] unitNormal(int x[],int y[])
    {   
        double u_norm[] = unitVector(cross(x,y));
        double u_norm_inv[] = new double[3];
        for (int i=0;i<3;i++)
        {
            u_norm_inv[i] = u_norm[i]*-1;
        }
        return new double[][] {u_norm,u_norm_inv};
    }

    // FUNCTION TO FIND BISECTOR OF TWO VECTORS
    public static double[] bisector(int x[],int y[])
    {
        double[] bsect = new double[3];
        double unit_a[] = unitVector(x);
        double unit_b[] = unitVector(y);
        for (int i=0;i<3;i++) bsect[i] = unit_a[i] + unit_b[i];
        return bsect;
    }

    // FUNCTION TO FIND POSITION VECTOR
    public static double[] pos_vector(int x[],int y[])
    {
        double[] pos = new double[3];
        for(int i=0;i<3;i++) pos[i] = 0.5*(x[i]+y[i]);
        return pos;
    }

    // FUNCTION TO FIND IF TWO VECTORS ARE COPLANAR
    public static boolean isCoplanar(int x[],int y[],int z[])
    {
        boolean res = (dot(cross(x,y),z) == 0)?true:false;
        return res;
    }

    // FUNCTION TO FIND RECIPROCAL OF THREE VECTORS
    public static int[][] reciprocal(int x[],int y[],int z[])
    {
        int rec1[] = new int[3];
        int rec2[] = new int[3];
        int rec3[] = new int[3];
        int c1[] = cross(y,z);
        int c2[] = cross(z,x);
        int c3[] = cross(x,y);
        int d = dot(cross(x,y),z);
        for (int i=0;i<3;i++)
        {
            rec1[i] = c1[i]/d;
            rec2[i] = c2[i]/d;
            rec3[i] = c3[i]/d;
        }
        return new int[][] {rec1,rec2,rec3};
    }

    // FUNCTION TO FIND THE MAXIMUM VALUE OF ANY TWO VECTORS
    public static double maxValue(int x[],int y[])
    {
        return modVector(x)*modVector(y);
    }

    // FUNCTION TO FIND THE MINIMUM VALUE OF ANY TWO VECTORS
    public static double minValue(int x[],int y[])
    {
        return -1.0*(modVector(x)*modVector(y));
    }

/*
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args) 
    {
        int a[] = {1,7,3};
        int b[] = {4,2,6};
        int c[] = {6,4,8};
        int res[][] = reciprocal(a,b,c);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }

*/    
}
