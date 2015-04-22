/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islands_comparable_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author erso
 */
public class FilesReader {

    private File inFile;
    private List<DanishIsland> islandList;

    public FilesReader(String fName) {
        inFile = new File(fName);
    }

    private void readFile() {
        islandList = new ArrayList<DanishIsland>();
        Scanner scan = null;
        String line;
        String[] tokens;

        String name = "";
        double circ;
        double area;
        int addr;
        int adkm;

        try {
            scan = new Scanner(inFile);
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                tokens = line.split(" ");
                name = tokens[0];
                circ = Double.parseDouble(tokens[1]);
                area = Double.parseDouble(tokens[2]);
                addr = Integer.parseInt(tokens[3]);
                adkm = Integer.parseInt(tokens[4]);
                islandList.add(new DanishIsland(name, circ, area, addr, adkm));

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ne) {
            System.err.println("NumberFormatException in " + name
                    + "\n" + ne.getMessage());
        } finally {
            scan.close();
        }
    }
    
    public List<?> getList(){
        return islandList;
    }

    // Opgave 1b Vælg algoritme til sortering
    public void sortList() {
        Collections.sort(islandList);
        
    }
    
    // Opgave 2b Vælg algoritme til sortering med Comparator
    public void sortWithComparator()
    {
        Collections.sort(islandList, new IslandComparator());
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilesReader fr = new FilesReader("Islands punktum.txt");// Skift fil hvis ikke double-vaerdier laeses korrekt
        fr.readFile();
        
        
        System.out.println("Result:\n" + fr.getList());
        fr.sortList();
        System.out.println("\nSorted1:\n" + fr.getList());

        // Opg 2a: Implementer en klasse der implementerer Comparator<DanishIsland> 
        // og kald med en instance heraf.
        fr.sortWithComparator();
        System.out.println("\nSorted2:\n" + fr.getList());

    }

}
