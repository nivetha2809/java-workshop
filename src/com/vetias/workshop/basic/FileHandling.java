
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file=new File("src");
        if(file.exists()){
            System.out.println("file exist"+file.getAbsolutePath());

        }
        else{
            System.out.println("file not exist:"+file.getAbsolutePath());
        }
        if (file.isDirectory())
        {
            System.out.println("it is a directory");
            File[] files=file.listFiles();
            if(files!=null)
            {
                System.out.println("files in the directory");
                for(File f: files)
                {
                  System.out.println(f.getName());
                }
            }
            else{
                System.out.println("file is not a directory");
            }
          

        }else{
            System.out.println("file is not a directory");
        }
        

    }
   
    
}