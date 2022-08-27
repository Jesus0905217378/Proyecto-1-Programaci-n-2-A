
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesus Alberto
 */
public class ClsListas {
    public static void main(String[] args) {
        

       List<ClsVendedores> misEmp = new ArrayList();
       
       ClsVendedores ven = new ClsVendedores();
       

       encabezado();
       
       ven.setNombre("Miguel");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Jose");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Raul");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Pablo");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Rosa");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Karla");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Lucas");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Laura");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       misEmp.add(ven);
       
       double sumaEnero =0;
       double sumaFebrero =0;
       double sumaMarzo =0;
       double totalvend =0;
       double sumaMeses = 0;

       
       for(ClsVendedores v : misEmp){
       double aux1 = 0;
       double aux2 = 0;
       double aux3 = 0;
       double com20 =0;
       double com35 =0;
       double TotVC =0;
       double ISR =0;
       double Liqu =0;
           
           System.out.print(v.getNombre()+"\t\t");
           System.out.print(v.getEnero()+"\t\t");
           System.out.print(v.getFebrero()+"\t\t");
           System.out.print(v.getMarzo()+"\t\t");
           
           sumaEnero = sumaEnero + v.getEnero();
           sumaFebrero = sumaFebrero + v.getFebrero();
           sumaMarzo = sumaMarzo + v.getMarzo();
           
           aux1 = v.getEnero();                 //**** Total ****
           aux2 = v.getFebrero();
           aux3 = v.getMarzo();
           
           totalvend = aux1 + aux2 + aux3;
           System.out.print(d.format(totalvend) + "\t\t");
           com20 = totalvend * 0.20;
           com35 = totalvend * 0.35;
           if(totalvend<2000){                //**** 20% ****
               System.out.print(d.format(com20) + "\t\t" );
           }
           else{
               com20 = 0;
               System.out.print(com20 + "\t\t");
           }
           if(totalvend >= 2000){             //**** 35% ****
               System.out.print(d.format(com35) + "\t\t" );
           }
           else{
               com35 = 0;
               System.out.print(com35 + "\t\t");
           }
           
                                              //**** TOTAL VENTAS Y COMISIONES
        TotVC = totalvend + com20 + com35;
        System.out.print(d.format(TotVC) + "\t\t");
                                              //**** -ISR ***
        ISR = TotVC * 0.05;
        System.out.print(d.format(ISR) + "\t\t");
                                              //**** LIQUIDO ***
        Liqu = TotVC - ISR;
        System.out.println(d.format(Liqu) + "\t\t");
       }
        System.out.println("\nLa suma de Enero es: "+ d.format(sumaEnero));
        System.out.println("La suma de Febrero es: "+ d.format(sumaFebrero));
        System.out.println("La suma de Marzo es: "+ d.format(sumaMarzo)+"\n");
        
        sumaMeses=sumaEnero+sumaFebrero+sumaMarzo;
        System.out.println("Venta total por todos los meses es: "+ d.format(sumaMeses));
    }
    
    public static double ram(){
        double numero = (double)(Math.random()*2000+1);
        return Double.parseDouble(d.format(numero));
    }
    
    public static void encabezado(){
        System.out.println("Nombre"+"\t\t"+"Enero"+"\t\t"+"Febrero"+"\t\t"+"Marzo"+"\t\t"+"Total"
        +"\t\t"+"20%"+"\t\t"+"35%"+"\t\t"+"Total V.C"+"\t"+"-ISR"+"\t\t"+"Liquido");
    }
   
    private static  DecimalFormat d = new DecimalFormat("###.##");

}
