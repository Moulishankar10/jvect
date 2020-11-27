package pyvect.cent;

public class cent
{
    public static double[] triangle(int[] arr1, int[] arr2,int[] arr3)
    {
        double res[] = {0,0,0};
        for (int i = 0; i<3; i++)
        {
            res[i] = arr1[i]+arr2[i]+arr3[i];
            res[i] = res[i]*0.33;
        }
        return res;
    }
} 