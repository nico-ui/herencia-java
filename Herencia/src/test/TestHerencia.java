package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
//        Calendar c = new GregorianCalendar();
//        Calendar d= Calendar.getInstance();
        
        Date fecha = new Date();
        fecha.getDate();
        
        Cliente cliente1 = new Cliente("Nicolai", 'M', 23, "NA", fecha, true);
        System.out.println("cliente = " + cliente1);
        
        Cliente cliente2 = new Cliente("Pochincardo", 'M', 21, "NA", new Date(), true);
        System.out.println("cliente2 = " + cliente2);
        
        Cliente cliente3 = new Cliente("Karla", 'F', 25, "NA", new Date(), true);
        System.out.println("cliente3 = " + cliente3);
        
    }

}
