/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author Juanes
 */
public class NameHandler {
    
    private String name;
    private String birth;

    public NameHandler() {
     name = null;
     birth = null;
    }
    
    public String getName() {
        
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        String welcome = "";
        if(hora >= 00 && hora < 12){welcome = "Good day ";}      
        else if(hora >= 12 && hora < 19){welcome = "Good afternoon ";}
        else if(hora >= 19 && hora <=24){welcome = "Good night ";}        
        
        return welcome +name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(birth, fmt);
        Period edad = Period.between(fechaNac, LocalDate.now());
       
        return edad.getYears() +" years old";
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    
    
    
}
