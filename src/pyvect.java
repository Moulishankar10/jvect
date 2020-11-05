class pyvect
{
    public static int dot(int arr1[], int arr2[])
    {
        int dot_product = 0, n = 3;
        for(int i=0;i<n;i++)
        {
            dot_product = dot_product + arr1[i]*arr2[i];
        }
        return dot_product;
    }

    public static int[] cross(int arr1[],int arr2[])
    {
        int cross_product[] = {0,0,0};
        cross_product[0] = arr1[1]*arr2[2] - arr1[2]*arr2[1];
        cross_product[1] = arr1[2]*arr1[0] - arr1[0]*arr2[2];
        cross_product[2] = arr1[0]*arr2[1] - arr1[1]*arr2[0];
        return cross_product;
    }
}
