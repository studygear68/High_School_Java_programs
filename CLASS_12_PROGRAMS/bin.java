package CLASS_12_PROGRAMS;
class bin 
{
    void bin(int a ) 
    {
        if(a>1)
        bin(a/2);
        System.out.print(a%2);
    }
}