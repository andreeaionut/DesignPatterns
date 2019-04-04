package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private static FileService fileService = new FileService();

    private FileService(){}

    public static FileService getInstance(){
        if(fileService == null){
            fileService = new FileService();
        }
        return fileService;
    }

    public List<String> getLinesFromFile(String filename){
        List<String> linesFromFile = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesFromFile.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesFromFile;
    }
}
