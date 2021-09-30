
import java.io.*;
import java.util.Scanner;

public class kuis1 {

    public static void main(String[] args) throws IOException{
/
        File file = new File("input.txt");
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr); 
        String[] kalimat = null; 
        String spasi;
        int huruf = 0;
        int baris = 0;
        int kata = 0;

       Scanner fileReader = new Scanner(file);
           while(fileReader.hasNextLine()){
               String readFile = fileReader.nextLine();
               System.out.println(readFile);
           }
        while ((spasi = br.readLine())!=null){
            kalimat = spasi.split(" ");
            baris++;
            kata += kalimat.length;
            for (String kalimat1 : kalimat) {
                for(int j = 0; j < kalimat1.length(); j++){
                     char karakter = kalimat1.charAt(j); 
                     huruf++;
                }
            }
        }
        
        
        br.close();
        System.out.println("Banyaknya baris adalah : " + baris);
        System.out.println("Banyaknya kata adalah : " + kata);
        System.out.println("Banyaknya karakter adalah : " + huruf);
      
    }
}