import java.io.*;
class FileOperations{
    
    
        public static void main(String args[]){
            try{
            File file=new File("demo.txt");
            FileWriter writer = new FileWriter(file,true);
            writer.write("hello good afternoon! this is bits");
            writer.close();
            System.out.println("data written successfully");
            

            // if(file.createNewFile()){
            //     System.out.println("File"+ file.getName()+"created succesfully");
            // }
            // else{
            //     System.out.println("file already exists "+file.getName());
            // }/
        }
        
        catch(IOException e){
            System.out.println("issue while creating file");
        }
    }
}