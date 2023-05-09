package Petshop;

import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Uniquewordcalculation {
    public static void main(String[] args) throws IOException

    {
        final Logger logger = LogManager.getLogger(String.valueOf(Uniquewordcalculation.class));

        //Read text from file
        File file=new File("src\\main\\java\\Petshop\\Inputfile.txt");
        String text=FileUtils.readFileToString(file,"UTF-8");
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z\\s]", "")
                   .replace("\n", " ")
                   .replace("\r", " ");

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
        logger.info("Number of unique words:"+numUniqueWords);
        logger.info("Unique words:"+uniquewords);

        //write result to file
        File outputfile= new File("src\\main\\java\\Petshop\\Outputfile.txt");
        String result="Number of unique words:" +numUniqueWords;
        FileUtils.writeStringToFile(outputfile,result,"UTF-8");

    }
}
