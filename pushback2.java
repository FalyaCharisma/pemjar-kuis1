import java.io.*;


public class pushback2
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            String s = "123456789";
            String s2 ="23";
            StringReader str_reader = new StringReader(s2);
            PushbackReader push1 = new PushbackReader(str_reader);
            System.out.println("Stream ready : " + push1.ready());
           
            // Use of read() :
            System.out.print("\ndata terbaca : ");
            for (int i = 0; i < 6; i++)
            {
                char c = (char) push1.read();
                System.out.print(c);
                push1.skip(1);
            }
            System.out.println("");
  
            push1.mark(15);
            push1.close();
  
        }
        catch (IOException excpt)
        {
            System.out.println();
  
        }
    }
}