/*
Diseño e implementación de un algoritmo que le permita gestionar un Circuito
trifásico que active luces altas y bajas: "Mediante la utilizacion de relés".
 */
package encendidolucesaltasbajas;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EncendidoLucesAltasBajas {
    public static String Probar_encendido_luces(){
    int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"         UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE         \n"
                + "Nombre: Aguaiza Quimbita Jonathan Fabricio\n"
                + "Carrera: Ingeniería Automotriz\n"
                + "NRC: 7450\n"
                + "\n"
                + "  ENCENDIDO DEL SISTEMA DE LUCES ALTAS Y BAJAS \n"
                + "\n"
                + "Comprobación del sistema de luces altas y bajas.\n"
                + "\n"
                + "Seleccione el tipo de bombillo.\n"
                + "\n"
                + "[1] Bombillo tipo Piloto.\n"
                + "[2] Bombillo tipo Halógeno.\n"
                + "\n"
                + "[0] Salir.","PROYECTO",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion){
            case 1: Tipo_bombillo_Piloto(); break;
            case 2: Tipo_bombillo_Halogeno(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion!=2);
        return null;
    }
    public static String Tipo_bombillo_Piloto(){
        
        int opcion_1;
        do{
        opcion_1 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "[1] Bombillo de un filamento.\n"
                + "[2] Bombillo de dos filamentos.","Bombillo Piloto",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_1){
            case 1: Numero_filamento_1(); break;
            case 2: Numero_filamento_2(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_1!=2);
        return null;
    }
    
    public static String Tipo_bombillo_Halogeno(){
        
        int opcion_2;
        do{
        opcion_2 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "[1] Bombillo de un filamento.\n"
                + "[2] Bombillo de dos filamentos.","Bombillo Halógeno",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_2){
            case 1: Numero_filamento_1(); break;
            case 2: Numero_filamento_2(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_2!=2);
        return null;
    }
    
    
    public static String Numero_filamento_1(){
        int opcion_3;
        do{
        opcion_3 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El bombillo seleccionado no puede complementar un sistemas de luces "
                + "altas y bajas.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n "
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + ""
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Bombillo de un filamento",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_3){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_3!=2);
        return null;
        
        //JOptionPane.showMessageDialog(null, "Es un reconocimiento tipo .");
        //return null;
    }
    
    public static String Numero_filamento_2(){
        int opcion_4;
        do{
        opcion_4 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El bombillo seleccionado puede complementar un sistemas de luces "
                + "altas y bajas.\n"
                + "Seleccione:\n"
                + "\n"
                + "Estado de bateria\n"
                + "\n"
                + "[1] Conectado. \n"
                + "[2] No conectado.\n"
                + "","Estado de la bateria",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_4){
            case 1: Conectado(); break;
            case 2: Desconectado(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_4!=2);
        return null;
    }
    public static String Conectado(){
        int opcion_5;
        do{
        opcion_5 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         La bateria se encuentra conectada.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Voltaje de la bateria.\n"
                + "\n"
                + "[1] Voltaje de vateria de [0 a 7]v.\n"
                + "[2] Voltaje de vateria de [8 a 12]v.\n"
                + "","Batería conectada",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_5){
            case 1: Voltaje_bajo(); break;
            case 2: Voltaje_alto(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_5!=2);
        return null;
    }
    
    public static String Desconectado(){
        int opcion_5;
        do{
        opcion_5 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         La batería se encuentra desconectada el sistema de luces no encendera conectar la batería.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Batería desconectada",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_5){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_5!=2);
        return null;
    }
    
    public static String Voltaje_bajo(){
        int opcion_6;
        do{
        opcion_6 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         La batería se encuentra descargada el sistema de luces no encendera.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Batería baja",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_6){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_6!=2);
        return null;
    }
    
    public static String Voltaje_alto(){
        int opcion_7;
        do{
        opcion_7 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         Batería con buena carga, para encender el sistema de luces.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Estado de fusibles.\n"
                + "\n"
                + "[1] Excelente estado.\n"
                + "[2] Mal estado.\n"
                + "","Estado Fusibles",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_7){
            case 1: Exelente_estado(); break;
            case 2: Mal_estado(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_7!=2);
        return null;
    }
    
    public static String Mal_estado(){
        int opcion_8;
        do{
        opcion_8 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         Los fusibles se encuentra en mal estado, se recomienda cambiarlo.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Fusibles en mal estado",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_8){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_8!=2);
        return null;
    }
    
    public static String Exelente_estado(){
        int opcion_9;
        do{
        opcion_9 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         Fusibles en excelente estado de funcionamiento.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Estado del rele.\n"
                + "\n"
                + "[1] Buen estado rele.\n"
                + "[2] Mal estado rele.\n"
                + "","Fusibles en excelente estado",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_9){
            case 1: Buen_estado_rele(); break;
            case 2: Mal_estado_rele(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_9!=2);
        return null;
    }
    
    public static String Mal_estado_rele(){
        int opcion_10;
        do{
        opcion_10= Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El rele se encuentra en mal estado (las luces fallaran).\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Rele en mal estado",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_10){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_10!=2);
        return null;
    }
    
    public static String Buen_estado_rele(){
        int opcion_11;
        do{
        opcion_11 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El rele se encuentra en excelente funcionamiento.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Estado de cables.\n"
                + "\n"
                + "[1] Cables cortados.\n"
                + "[2] Cables sanos.\n"
                + "","Rele en excelente estado",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_11){
            case 1: Cables_cortados(); break;
            case 2: Cables_sanos(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_11!=2);
        return null;
    }
    
    public static String Cables_cortados(){
        int opcion_12;
        do{
        opcion_12 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El cable esta cortado las luces nunca encenderan.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Cables cortados",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_12){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_12!=2);
        return null;
    }
    
    public static String Cables_sanos(){
        int opcion_13;
        do{
        opcion_13 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         Los cables se encuentra en perfecto estado.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Estado del interruptor.\n"
                + "\n"
                + "[1] Interruptor en buen estado.\n"
                + "[2] Interruptor en mal estado.\n"
                + "","Cables sanos",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_13){
            case 1: Interruptor_buen_estado(); break;
            case 2: Interruptor_Mal_estado(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_13!=2);
        return null;
    }
    
    public static String Interruptor_Mal_estado(){
        int opcion_14;
        do{
        opcion_14 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El interrupor esta en estado se le recomienda un chequeo inmediato.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Interruptor mal estado",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_14){
            case 1: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_14!=2);
        return null;
    }
    
    public static String Interruptor_buen_estado(){
        int opcion_15;
        do{
        opcion_15 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         El interruptor se encuentra en perfecto estado.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "Seleccione ON a la derecha o On a la izquierda para encender luces altas o bajas.\n"
                + "\n"
                + "[1] ON a la derecha.\n"
                + "[2] ON a la izquierda.\n"
                + "","Interructor en funcionamiento",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_15){
            case 1: ON_derecha(); break;
            case 2: ON_izquierda(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_15!=2);
        return null;
    }
    
    public static String ON_izquierda(){
        int opcion_14;
        do{
        opcion_14 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         USTED A ENCEDIDO LUCES BAJAS.\n"
                + "         Sistema en buen funcionamiento.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[2] Atras.\n"
                + "\n"
                + "[0] Para salir.\n"
                + "","ON izquierda",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_14){
            case 1: Probar_encendido_luces(); break;
            case 2: Interruptor_buen_estado(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_14!=2);
        return null;
    }
    
    public static String ON_derecha(){
        int opcion_14;
        do{
        opcion_14 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "         USTED A ENCEDIDO LUCES ALTAS.\n"
                + "         Sistema en buen funcionamiento.\n"
                + "\n"
                + "Seleccione:\n"
                + "\n"
                + "[1] Para regresar al menu principal.\n"
                + "[2] Atras.\n"
                + "\n"
                + "[0] Para salir.\n"
                + "","ON derecha",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_14){
            case 1: Probar_encendido_luces(); break;
            case 2: Interruptor_buen_estado(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_14!=2);
        return null;
    }
    
    
     public static String Especificar_condiciones_conduccion(){
        
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(Probar_encendido_luces());
        
    }
    
}
