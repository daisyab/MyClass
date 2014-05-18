import javax.tools.ToolProvider;
import javax.tools.JavaCompiler;

public class RunClass {
    public static void main(String[] args){
        String fileToCompile = "/home/guestu/Downloads/langtools-ce654f4ecfd8/Helloworld.java";
        
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilationResult = compiler.run(null, null, null, fileToCompile);
        if(compilationResult == 0){
            System.out.println("Compilation complete");
        } else {
            System.out.println("Compilation failed");
        }
        Helloworld.main(args);
        

      try{       
        Runtime re = Runtime.getRuntime();  
        Process theProcess = re.exec("usr/lib/jvm/java-7-oracle/bin/java -cp home/guestu/Downloads/langtools-ce654f4ecfd8/Helloworld.java");
        }
        catch(Exception e)
        {
        
         System.err.println("Error on exec() method");  
        }
          
         
    }
    
}
   
