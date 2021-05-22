class mindist
{
 static void miner(int n)
 {
    int arr[]={1,2,3,4,5};
    int c=0;
    
    for(int i=4;i>=0;i--)
    {
        
            c=c+(n/arr[i]);
            n=(n%arr[i]);
        
    }
    
    System.out.println(c);
 }
}