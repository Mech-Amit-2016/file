
package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SortNums {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        numbers are read from file Numbers.txt and stored int ArraList
        File fi=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\java_Basics\\src\\file\\Numbers.txt");
        FileReader fr=new FileReader(fi);
        BufferedReader br=new BufferedReader(fr);
        String number=br.readLine();
        ArrayList<Integer> list=new ArrayList<>();
        while(number!=null){
            list.add(Integer.parseInt(number));
            number=br.readLine();
        }
//      creating an array and storing the AyyayList elements into Ayyay to perform sorting operation  
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            arr[i]=list.get(i);
// after storing numbers into Ayyay from file we perform Bubble sort for sorting the Numbers
        
        for(int j=0;j<=arr.length-2;j++)
     {
        for(int i=0;i<=arr.length-2-j;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
     }
//        for(int i=0;i<arr.length;i++)
//        System.out.println(arr[i]);
//        after sorting the Numbers we write number on File Nubers.txt
        FileWriter fw=new FileWriter("C:\\Users\\DELL\\Documents\\NetBeansProjects\\java_Basics\\src\\file\\Numbers1.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        
        for(int i=0;i<arr.length;i++){
            bw.write(Integer.toString(arr[i]));
             bw.flush();
            bw.newLine();
           
        }
         }       
}
