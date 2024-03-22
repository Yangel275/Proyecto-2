/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

import Objetos.Reservación;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;


/**
 *
 * @author yangel
 */
public class Intento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String[][] employees ={
                {"Man", "Sparkes", "msparkes0@springhow.com", "Engineering"},
                {"Dulcinea", "Terzi", "dterzi1@springhow.com", "Engineering"},
                {"Tamar", "Bedder", "tbedder2@springhow.com", "Legal"},
                {"Vance", "Scouller", "vscouller3@springhow.com", "Sales"},
                {"Gran", "Jagoe", "gjagoe4@springhow.com", "Business Development"}
        };
        File csvFile  = new File("employees.csv");
        FileWriter fileWriter = new FileWriter(csvFile);
        
        
        
        for (String[] data : employees){
            StringBuilder line = new StringBuilder();
            for (int i=0; i < data.length; i++){
                line.append("\"");
                line.append(data[i].replaceAll("\"", "\"\""));
                line.append("\"");
                if (i != data.length - 1){
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
    
    
}
