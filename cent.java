// JVECT.AREA SUBPACKAGE

// PACKAGE DEFINITION
package jvect.cent;

public class cent
{
    public static double[] triangle(int[] arr1, int[] arr2,int[] arr3)
    {
        double res[] = new double[3];
        for (int i = 0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i])*0.33;
        return res;
    }

    public static double[] tetrahedron(int[] arr1, int[] arr2,int[] arr3, int[] arr4)
    {
        double res[] = new double[3];
        for (int i=0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i]+arr4[i])*0.25;
        return res;
    }
    /*
    // MAIN FUNCTION FOR TESTING PURPOSE
    public static void main(String[] args) 
    {
        int a[] = {1,2,3};
        int b[] = {4,2,6};
        int c[] = {2,4,8};
        int d[] = {6,1,3};
        double res[] = tetrahedron(a,b,c,d);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        
        
    }
    */
} 