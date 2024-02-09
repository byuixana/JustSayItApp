import java.io.File

public class FileHandler
    (fileName : String){
        var _fileName: String = fileName;

        fun readFile() : String
        {
            /*
            Reads user file
            */
            var text : String = ""
            try{
                text = File(_fileName).readText()
            } catch (e: Exception){
                println("Error reading file!")
            }
            return text
        }

        fun writetoFile()
        {
            //Write stuff to file
        }
    }