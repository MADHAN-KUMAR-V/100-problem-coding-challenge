class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
       String ans="";
       for(int i=0;i<str.length();i++){
           ans=str.charAt(i)+ans;
       }
       return ans;
    }
}
