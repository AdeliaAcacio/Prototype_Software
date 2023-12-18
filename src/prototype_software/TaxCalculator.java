/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype_software;

/**
 *
 * @author Adelia Acacio & Stefani Nunes
 */
public class TaxCalculator {
    
    /*
    *PAYE TAX 
    *if Salary  => 40000 (salary * 0.2)  
    *If Salary =< 40001 (Result = Salary - 40000 ) Result * 0.4
    *if (PAYE TAX Result > 7176 ) {PAYE TAX Result = 7176}
    */
    
     /*
    *USC TAX 
    *if (Salary => 12012 && Age > 70) {salary * 0.005} 
    *if (Salary >= 12013 || Salary => 22920)  calc {salary * 0.02}
    *(Salary >= 22921 || Salary => 70044) calc {salary * 0.045}
    *if ( Salary =< 70045) {salary * 0.08}
    *If Salary =< 40001 (Reselt = Salary - 40000 ) 
    */
    
     /*
    *PRSI TAX 
    *if Salary  => 1873 ( PRSI result = salary * 0.4)  
    *if (PRSI result > 1873 ) {PRSI result = 1783 }
    */
    
}
