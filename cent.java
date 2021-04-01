package pyvect.cent;

public class cent
{
    public static double[] triangle(int[] arr1, int[] arr2,int[] arr3)
    {
        double res[] = new double[3];
        for (int i = 0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i])*0.25;
        return res;
    }

    public static double[] tetrahedron(int[] arr1, int[] arr2,int[] arr3, int[] arr4)
    {
        double res[] = new double[3];
        for (int i=0; i<3; i++) res[i] = (arr1[i]+arr2[i]+arr3[i]+arr4[i])*0.25;
        return res;
    }
} 