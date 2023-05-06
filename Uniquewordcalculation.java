package Homework4;

import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class Uniquewordcalculation {
    public static void main(String[] args) throws IOException

    {
        //Read text from file
        File file=new File("src\\main\\java\\Homework4\\Inputfile.txt");
        String text=FileUtils.readFileToString(file,"UTF-8");

        //Split text into words
        String[] words= StringUtils.split(text," ");

        //Calculate number of unique words
        HashSet<String> uniquewords=new HashSet<>();
        for (String word : words)
        {
            uniquewords.add(word);

        }

        int numUniqueWords=uniquewords.size();

        //print result to console
        System.out.println("Number of unique words:"+numUniqueWords);

        //write result to file
        File outputfile= new File("src\\main\\java\\Homework4\\Outputfile.txt");
        String result="Number of unique words:" +numUniqueWords;
        FileUtils.writeStringToFile(outputfile,result,"UTF-8");

    }
}
