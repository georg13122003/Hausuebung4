/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Georg Mairhuber
 */
public class readFile {

    public void readFile() throws FileNotFoundException {

        String[] splitted = null;
        isNumber is = new isNumber();
        File file = new File("numbers.csv");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            splitted = line.split(":");
            
        }
        for(int i = 0; i < splitted.length; i++){
            is.isNumber(splitted[i]);
        }
        
    }
}
