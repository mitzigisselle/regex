
package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    
    
    
    public static void main(String[] args){
       
        
        System.out.println("Nombre: "+validanombre("Marco Fernando"));
        System.out.println("Codigo Postal: "+validacp("12345"));
        System.out.println("Correo Institucional: "+validaemail("171190094@milpaalta2.tecnm.mx"));
        System.out.println("Correo Externo: "+validaemailext("gisselle220495@gmail.com"));
        System.out.println("Telefono Fijo: "+validatelfijo("5551312074"));
        System.out.println("Telefono celular : "+validatelfijo("5576577600"));
        System.out.println("Numero de contrtol : "+validanocontrol("171190094"));
        System.out.println("Direccion: "+validadireccion("Reforma 23, Centro ,  Cuactemoc , Chiapas"));
        System.out.println("Fecha : "+validafecha("2013-12-14"));
        System.out.println("Edad : "+validaedad("30"));
        
    }
    
    public static boolean validanombre(String nombre) {
        return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    }
    
    public static boolean validacp(String cp) {
        return cp.matches("^[0-9]+{5}$");
    }
    public static boolean validaemail(String email) {
        return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static boolean validaemailext(String emailext) {
        return emailext.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static boolean validatelfijo(String telfijo) {
        return telfijo.matches("^(\\d{10})$");
    }
    public static boolean validatelcel(String telcel) {
        return telcel.matches("^(\\d{10})$");
    }
    public static boolean validanocontrol(String nocontrol) {
        return nocontrol.matches("^(\\d{9})$");
    }
    public static boolean validadireccion(String direccion) {
        return direccion.matches("^([A-Z]{1}[a-z]+[ ]+[0-9]{2},[ ]+[A-Z]{1}[a-z]+[ ],[ ]+[A-Z]{1}[a-z]+[ ],[ ]+[A-Z]{1}[a-z]+[ ]?)$");
    }
    public static boolean validafecha(String fecha) {
        return fecha.matches("^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$");
    }
    public static boolean validaedad(String edad) {
        return edad.matches("^(\\d{2})$");
    }

    
    
}
