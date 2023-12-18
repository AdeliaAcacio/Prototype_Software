/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Adelia Acacio
 */
public class FileReaderScanner {

    public static void main(String[] args) throws FileNotFoundException {

            try{
            
        
                    //int mySqLfile;
                    String myFileName = "salary.txt";

                    Scanner sc = new Scanner(System.in);

                    Scanner myFile = new Scanner(new FileReader(myFileName));

                    while (myFile.hasNext()) {

                        String input = myFile.nextLine(); //reads a line fromt the file
                        System.out.println("The data in the file is " + input);


                         double taxPaye = 0;

                        if (input < 40000){
                            taxPaye = 0;
                        }
                        else if (input > 40000){
                            taxPaye = input * 0.2;
                        }else{
                            taxPaye = (40000 * 0.2) + (input - 40000)* 0.4);


                            //taxPaye =  else if (it =< 40001){
                                System.out.println("Income Tax Paye is: " + taxPaye);
                }
            
            }
        }catch (Exception e) {
                System.out.println("Error founded ");
    }


