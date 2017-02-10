import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Nandhu
 */
public class telefind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String dirpa;
        // TODO code application logic here
    System.out.println("Give a directory path for example(E://txt//)");
    Scanner scan=new Scanner(System.in);
    dirpa=scan.nextLine();
    File inpfolder=new File(dirpa);
    traverse(inpfolder,"");
    }
    static void traverse(File parent,String node){
    if(parent.isDirectory()){
    node+=" ";
    File childNodes[]=parent.listFiles();
    for(File childNode : childNodes){
    traverse(childNode,node);
    }
    }
    else{
        BufferedReader reader=null;
        try{
         
 reader=new BufferedReader(new FileReader(parent.getAbsoluteFile()));       
   String extrac = null;
System.out.println("Telephone numbers in file:"+parent.getName()+": \n");
    while ((extrac = reader.readLine()) != null) {
         String[] words = extrac.split(" ");
         for(int i=0;i<words.length;i++){
           if(((words[i].charAt(0)=='9' || words[i].charAt(0)=='8' || words[i].charAt(0)=='7') && words[i].length()==10) || ((words[i].charAt(0)=='0')&&(words[i].charAt(1)=='9' || words[i].charAt(1)=='8' || words[i].charAt(1)=='7') && words[i].length()==11) || ((words[i].charAt(0)=='9' && words[i].charAt(1)=='1')&&(words[i].charAt(2)=='9' || words[i].charAt(2)=='8' || words[i].charAt(2)=='7') && words[i].length()==12) || ((words[i].charAt(0)=='+' && words[i].charAt(1)=='9' && words[i].charAt(2)=='1')&&(words[i].charAt(3)=='9' || words[i].charAt(3)=='8' || words[i].charAt(3)=='7') && words[i].length()==13) || ((words[i].charAt(0)=='0' && words[i].charAt(1)=='0' && words[i].charAt(2)=='9' && words[i].charAt(3)=='1')&&(words[i].charAt(4)=='9' || words[i].charAt(4)=='8' || words[i].charAt(4)=='7') && words[i].length()==14) || ((words[i].charAt(0)=='(' && words[i].charAt(4)==')' && words[i].charAt(5)=='-' && words[i].charAt(9)=='-' && words[i].charAt(9)=='-')&&(words[i].charAt(1)=='9' || words[i].charAt(1)=='8' || words[i].charAt(1)=='7') && words[i].length()==14)){
           System.out.println(words[i]);
           }
         }
      
    }
        
        }
 catch(Exception e){
 }
        
    
    }
    }
    
}
