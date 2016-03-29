package wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class wc 
{
 public static void main(String[] args) throws IOException 
 {
  int countCharacter = 0;
  int countWord = 0;
  int countLine = 0;
  if (args.length > 0) 
  {
   Reader read = new FileReader(args[0]);
   BufferedReader bufRead = new BufferedReader(read);
   String line = null;
   while ((line = bufRead.readLine()) != null) 
   {
    String[] strs = line.split("\\s");
    for (int i = 0; i < strs.length; i++)
    {
     countWord++;
     countCharacter += strs[i].length();
    }
    countLine++;
   }
  }
  System.out.println("character: " + countCharacter);
  System.out.println("word: " + countWord);
  System.out.println("line :" + countLine);
 }
}