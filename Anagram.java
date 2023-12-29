			//	ANAGRAM

// Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string.
//In other words, we can say that two strings are anagrams if they contain the same characters but in a different order.

	// ex LISTEN - > SILENT

	//HEART - > EARTH

	//LIVES - > ELVIS

	//KEEP -> PEEK

	//TABLE - >BLEAT



import java.util.Scanner;
public class Anagram
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        
        boolean isAnagram=true;
        
        // boolean visited[]=new boolean[b.length()];
        
        // if(a.length() == b.length())
        // {
        // for(int i=0;i<a.length();i++)
        // {
        //     char c=a.charAt(i);
        //     isAnagram=false;
            
        //     for(int j=0;j<b.length();j++)
        //     {
        //         if(b.charAt(j) == c & !visited[j])
        //         {   
        //             visited[j]=true;
        //             isAnagram=true;
        //             break;
        //         }
        //     }
        //     if(!isAnagram)
        //     {
        //         break;
        //     }
        // }
        // }
        
        int al[]=new int[256];
        int bl[]=new int[256];
        
        // read char one by one and store the value in a c. 
        
        //second trick using array 
        /*
        for(char c:a.toCharArray())
        {
            int index =(int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index=(int) c;
            bl[index]++;
        }
        
        for(int j=0;j<256;j++){
            if(al[j] != bl[j]){
                isAnagram=false;
                break;
            }
        }
        */
        // end second 
        
        // third step using arruy but removing array index values..
        // if a=2 , b= 1,c=1 then reduce the array in the index .. like if present in a then -1 a=1 , if present 2nd
        // a then -1 a=0; , then b=0,and finally c=0...: so this conditon Anagram otherwise not...
        
        for(char c:a.toCharArray()){
            int index=(int)c;
            al[index]++;
        }
        for(char c:b.toCharArray()){
            int index=(int)c;
            al[index]--;
        }
        for(int i=0;i<256;i++){
         if(al[i] != 0)   {
             isAnagram=false;
             break;
         }
        }
        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("not Anagram");
        }
    }
}
