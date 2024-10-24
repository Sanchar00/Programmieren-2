package Lektion18;

import java.io.*;

public class Ubung {
    public void splitStudiengaenge(String dataeiname) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dataeiname));
             BufferedWriter winfwriter = new BufferedWriter(new FileWriter("WInfNr.txt"));
             BufferedWriter infwriter = new BufferedWriter(new FileWriter("InfNr.txt"));
             BufferedWriter ecwriter = new BufferedWriter(new FileWriter("ECNr.txt"))) {
            String line;
            char[] array;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.toCharArray();
                if ((char) array[0] == 5 && (char) array[1] == 0) {
                    winfwriter.write(line);
                } else if ((char) array[0] == 5 && (char) array[1] == 1) {
                    infwriter.write(line);
                } else if ((char) array[0] == 6 && (char) array[1] == 1) {
                    ecwriter.write(line);
                } else throw new MatrikelNummerException("Bitte geben Sie ein gültige Matrikelnummer ein");
            }
            }catch(IOException e){
                System.out.println("Hata");
            }catch (MatrikelNummerException e){
            System.out.println(e.getMessage());

        }
         {

        }
        }
    }

