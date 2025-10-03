public class debug 
{
    public static void main(String args[])
    {
        String str1 = "baddadda";
        String str2 = "dd";
        String str3 = "n";

        String modified = "";
        int idx = 0;
        int found = str1.indexOf(str2);

        while(found != -1)
        {
            modified = modified + str1.substring(idx, found);
            modified = modified + str3;
            idx = found + str2.length();
            found = str1.indexOf(str2,idx);
        }

        modified = modified + str1.substring(idx);

        System.out.println(modified);

        System.out.println(modified);
    }    
}
