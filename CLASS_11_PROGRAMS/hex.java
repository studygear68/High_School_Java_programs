package CLASS_11_PROGRAMS;
class hex
{
    void hex(int a ) 
    {
        String h = "0123456789ABCDEF";
        if(a>16)
        hex(a/16);
        System.out.print(h.charAt(a%16));
    }
}