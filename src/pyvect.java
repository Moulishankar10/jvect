class pyvect
{
    public static int dot(int arr1[], int arr2[])
    {
        int dot_product = 0, n = 3;
        for(int i =0;i<n;i++)
        {
            dot_product = dot_product + arr1[i]*arr2[i];
        }
        return dot_product;
    }
}
