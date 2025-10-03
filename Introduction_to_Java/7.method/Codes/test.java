
class test
{
    public static void main(String[] args)
    {
        int num = 63;
        String hex = "";
        int hexDigit;
        while(num>0)
        {
            hexDigit = num%16;
            num = num/16;

            if(hexDigit == 10)
            {
                hex = "A" + hex;
            }
            else if(hexDigit == 11)
            {
                hex = "B" + hex;
            }
            else if(hexDigit == 12)
            {
                hex = "C" + hex;
            }
            else if(hexDigit == 13)
            {
                hex = "D" + hex;
            }
            else if(hexDigit == 14)
            {
                hex = "E" + hex;
            }
            else if(hexDigit == 15)
            {
                hex = "F" + hex;
            }
            else
            {
                hex = hexDigit + hex;
            }
        }

        
        System.out.println(hex);
    }

}