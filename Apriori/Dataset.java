package apriori_confidence;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Dataset {

    public void generateDataset(int m , int n) {
        //this function generates the dataset each time it is called. When you wish to run this on your computer
        //DO not forget to change the path of file here
        //basically randomly generates a trasation summary
        
        
        File f = new File("C:/DataMining/Dataset.txt");
        String ran , ran2;
        
       
        FileWriter f2 = null ;
        Random r = new Random();
        try {
            f2 = new FileWriter(f);
        
        f2.write(Integer.toString(m) + " " + Integer.toString(n) + "\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
       try {
        while(n-- > 0)
        {
            int temp = 1 + (Math.abs(r.nextInt()%m));
            ran = Integer.toString(temp);
            f2.write(ran);
            
            boolean []a = new boolean[m];
            for(int i=0;i<m;i++)
                a[i] = false ;
                
            for(int i = 0;i<temp;i++)
            {
                int temp2 = Math.abs(r.nextInt()%m);
                while(a[temp2])
                     temp2= Math.abs(r.nextInt()%m);
                a[temp2] = true;
                ran2 = Integer.toString(temp2);
                f2.write(" " + ran2);
            }
            f2.write("\r\n");
        }
        f2.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
