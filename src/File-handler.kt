import java.io.File

public class FileHandler
    (fileName : String){
        var _fileName: String = fileName;

        fun readFile()
        {
            try{
                val text = File(_fileName).readText()
                println("File content: \n $text")
            } catch (e: Exception){
                println("Error reading file!")
            }

        }

        fun writetoFile()
        {
            //Write stuff to file
        }
    }