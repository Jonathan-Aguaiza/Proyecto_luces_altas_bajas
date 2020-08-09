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
    public static String Menu_principal(){
    int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"         UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE         \n"
                + "Nombre: Aguaiza Quimbita Jonathan Fabricio\n"
                + "Carrera: Ingeniería Automotriz\n"
                + "NRC: 7450\n"
                + "\n"
                + "  ENCENDIDO DEL SISTEMA DE LUCES ALTAS Y BAJAS \n"
                + "\n"
                + "Seleccione la opción a desarrollar.\n"
                + "\n"
                + "[1] Diseño del diagrama de luces Altas y Bajas.\n"
                + "[2] Materiales empleados para la construcción del circuito.\n"
                + "[3] Identificación el tipo de bombillo.\n"
                + "[4] Verificación del tipo de socket.\n"
                + "[5] Comparación de los relays.\n"
                + "[6] Ubicación de la fusilera.\n"
                + "[7] Asignación de los fusibles a ocupar.\n"
                + "[8] Características del cable automotriz.\n"
                + "[9] Interruptor trifásico.\n"
                + "[10] Batería.\n"
                + "[11] Voltaje de la batería.\n"
                + "[12] Probar encendido de luces.\n"
                + "\n"
                + "[13] Comprobar un Sistema de Encendido de Luces Altas y Bajas.\n"
                + "\n"
                + "[0] Salir.","PROYECTO",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion){
            case 1: Diseniar_diagrama_luces_altas_bajas(); break;
            case 2: Establecer_Materiales(); break;
            case 3: Identificar_tipo_bombillo(); break;
            case 4: Verificar_tipo_socket(); break;
            case 5: Comparar_tipos_relay(); break;
            case 6: Ubicar_fusilera(); break;
            case 7: Asignar_fusible(); break;
            case 8: Especificar_cable_automotriz(); break;
            case 9: Conectar_interruptor_trifasico(); break;
            case 10: Usar_bateria(); break;
            case 11: Medir_voltaje(); break;
            case 12: Probar_encendido_luces(); break;
            case 13: Comprobar_sistema_encendido(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion!=2);
        return null;
    }
    
    public static String Diseniar_diagrama_luces_altas_bajas(){
        
        int  relay, opcion1;
        String bombillo;
        String software;
        String interruptor;
        String fusible;
        String celda_energia;
        software=(JOptionPane.showInputDialog("INGRESE EL SOFTWARE A OCUPAR PARA EL DISEÑO DEL DIAGRAMA: "));
        bombillo=(JOptionPane.showInputDialog("INGRESAR NÚMERO DE BOMBILLOS A IMPLEMENTAR EN EL DIAGRAMA: "));
        relay=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE RELAY A OCUPAR EN EL DIAGRAMA: "));
        fusible=(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE FUSIBLES A IMPLEMETAR EN EL DIAGRAMA "
                + "SU VALOR DE AMPERAJE: "));
        interruptor=(JOptionPane.showInputDialog("INGRESE EL INTERRUPTOR A OCUPAR: "));
        celda_energia=(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA CELDA PARA SU FUNCIONAMIENTO: "));
       
        do{
        opcion1=Integer.parseInt(JOptionPane.showInputDialog(null,"El software a ocupar para el diseño del diagrama es "+software+"\n"
                + "con un numero de "+bombillo+" tanto para altas como para bajas\n"
                + "con "+relay+" relay uno para bajas y uno para altas,\n "
                + "con "+fusible+" para que los elementos implementados funcionen con normalidad,\n"
                + "un "+interruptor+" para la activación de las luces altas como para bajas y\n"
                + "una "+celda_energia+" para el funcionamiento de la simulación.\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Elementos a ocupar.\n"
                + "\n"
                + "[0] Salir.","DISEÑO DEL DIAGRAMA",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion1){
            case 1: Menu_principal(); break;
            case 2: Establecer_Materiales(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion1!=2);
        return null;
    }
    
    public static String Establecer_Materiales(){
        
        int   opcion2;
        String tipo_material;
        String materiales;
        tipo_material=(JOptionPane.showInputDialog("INGRESE EL TIPO DE MATERIAL PARA CONSTRUIR EL CIRCUITO: "));
        materiales=(JOptionPane.showInputDialog("INGRESE LOS MATERIALES A OCUPAR: "));
        
        do{
        opcion2=Integer.parseInt(JOptionPane.showInputDialog(null,"Los materiales a ocupar con : "+tipo_material+"\n"
                + "Ya que se va a armar un circuito electrico.\n"
                + "\n"
                + "Los materiales a ocupar son los siguientes:\n"
                + materiales+".\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Identificar tipo de bombillo.\n"
                + "\n"
                + "[0] Salir.","MATERIALES EMPLEADOS",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion2){
            case 1: Menu_principal(); break;
            case 2: Identificar_tipo_bombillo(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion2!=2);
        return null;
    }
    
    public static String Identificar_tipo_bombillo(){
        
        int   opcion3;
        String tipo_bombillo;
        String marca_bombillo;
        String color_bombillo;
        String tamanio_bombillo;
        String numero_filamento;
        tipo_bombillo=(JOptionPane.showInputDialog("QUE TIPO DE BOMBILLO SE ESTA OCUPANDO: "));
        marca_bombillo=(JOptionPane.showInputDialog("INGRESE LA MARCA DEL BOMBILLO: "));
        color_bombillo=(JOptionPane.showInputDialog("QUE TIPO DE ILUMINACIÓN GENERA EL BOMBILLO: "));
        tamanio_bombillo=(JOptionPane.showInputDialog("IDENTIFIQUE EL TAMAÑO DEL BOMBILLO: "));
        numero_filamento=(JOptionPane.showInputDialog("DESCRIBA DE CUANTOS FILAMENTOS ES EL BOMBILLO A OCUPAR: "));
        
        do{
        opcion3=Integer.parseInt(JOptionPane.showInputDialog(null,"El tipo de bombillo a ocupar es "+tipo_bombillo+" de la marca "+marca_bombillo+",\n"
                + "con un color de iluminación de "+color_bombillo+" de tamaño "+tamanio_bombillo+".\n"
                + "con "+numero_filamento+"."
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Verificar socket.\n"
                + "\n"
                + "[0] Salir.","CARACTERÍSTICAS DEL BOMBILLO",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion3){
            case 1: Menu_principal(); break;
            case 2: Verificar_tipo_socket(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion3!=2);
        return null;
    }
    
    public static String Verificar_tipo_socket(){
        
        int   opcion4;
        String tipo_socket;
        String modelo_socket;
        tipo_socket=(JOptionPane.showInputDialog("DESCRIBA EL TIPO DE SOCKET: "));
        modelo_socket=(JOptionPane.showInputDialog("DETERMINE EL MODELO DE SOCKET A OCUPAR: "));
        
        do{
        opcion4=Integer.parseInt(JOptionPane.showInputDialog(null,"El tipo de socket a ocuapar es un "+tipo_socket+",\n"
                + "de un modelo "+modelo_socket+"."
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Comparar relay.\n"
                + "\n"
                + "[0] Salir.","VERIFICAR SOCKET",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion4){
            case 1: Menu_principal(); break;
            case 2: Comparar_tipos_relay(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion4!=2);
        return null;
    }
    
    public static String Comparar_tipos_relay(){
        
        int   opcion5;
        String tipo_relay;
        String funcion_relay;
        String tamanio_relay;
        tipo_relay=(JOptionPane.showInputDialog("IDENTIFICAR EL TIPO DE RELAY A OCUPAR: "));
        funcion_relay=(JOptionPane.showInputDialog("CUÁL ES EL FUNCIONAMIENTO DEL RELAR SELECCIONADO: "));
        tamanio_relay=(JOptionPane.showInputDialog("DETERMINE EL TAMANIO DEL RELAY: "));
        
        do{
        opcion5=Integer.parseInt(JOptionPane.showInputDialog(null,"El relay a ocupar es un "+tipo_relay+" con el siguiente funcionamiento:\n"
                + funcion_relay+" con un tamano "+tamanio_relay+"."
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Fusilera.\n"
                + "\n"
                + "[0] Salir.","COMPARAR RELAY",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion5){
            case 1: Menu_principal(); break;
            case 2: Ubicar_fusilera(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion5!=2);
        return null;
    }
    
    public static String Ubicar_fusilera(){
        
        int   opcion6;
        String tamanio_fusilera;
        String forma_fusilera;
        String modelo_fusilera;
        tamanio_fusilera=(JOptionPane.showInputDialog("DETERIMNAR EL TAMAÑO DE LA FUSILERA A UTILIZAR: "));
        forma_fusilera=(JOptionPane.showInputDialog("FORMA DE LA FUSILERA CON RESPECTO AL FUSIBLE: "));
        modelo_fusilera=(JOptionPane.showInputDialog("DETERMINE EL MODELO DE LA FUSILERA CON RESPECTO AL FUSIBLE: "));
        
        do{
        opcion6=Integer.parseInt(JOptionPane.showInputDialog(null,"La fusilera es "+tamanio_fusilera+" en forma "+forma_fusilera+"\n"
                + "con un modelo: "+modelo_fusilera+"."
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Fusible.\n"
                + "\n"
                + "[0] Salir.","FUSILERA",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion6){
            case 1: Menu_principal(); break;
            case 2: Asignar_fusible(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion6!=2);
        return null;
    }
    
    public static String Asignar_fusible(){
        
        int   opcion7;
        String tamanio_fusible;
        String forma_fusible;
        String capacidad_conduccion;
        tamanio_fusible=(JOptionPane.showInputDialog("DETERMINAR TAMAÑO DE FUSIBLE A OCUPAR: "));
        forma_fusible=(JOptionPane.showInputDialog("DESCRIBA LA FORMA DE FUSIBLE A OCUPAR: "));
        capacidad_conduccion=(JOptionPane.showInputDialog("INDIQUE LA CAPACIDAD DE CONDUCCIÓN DEL FUSIBLE EN AMPERIOS: "));
        
        do{
        opcion7=Integer.parseInt(JOptionPane.showInputDialog(null,"Le tamaño del fusible a ocupar es de "+tamanio_fusible+",\n"
                + "con una forma "+forma_fusible+", con una conducción de "+capacidad_conduccion+"."
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Cable automotriz.\n"
                + "\n"
                + "[0] Salir.","FUSIBLE",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion7){
            case 1: Menu_principal(); break;
            case 2: ; break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion7!=2);
        return null;
    }
    
    public static String Especificar_cable_automotriz(){
        
        int   opcion8;
        String numero_cable;
        String tipo_cable;
        String longitud_cable;
        String color_cable;
        numero_cable=(JOptionPane.showInputDialog("DETERMINAR EL NÚMERO DE CABLE A UTILIZAR: "));
        tipo_cable=(JOptionPane.showInputDialog("DESCRIBIR EL TIPO DE CABLE: "));
        longitud_cable=(JOptionPane.showInputDialog("LONGITUD DE CABLE A UTILIZAR PARA LA CIRCUITO: "));
        color_cable=(JOptionPane.showInputDialog("COLOR DE CABLE O CABLES A UTILIZAR: "));
        
        do{
        opcion8=Integer.parseInt(JOptionPane.showInputDialog(null,"El número de cable a utilizar es: "+numero_cable+".\n"
                + "El tipo de cables es "+tipo_cable+", con una longitud de "+longitud_cable+" para la su costrucción,\n"
                + "con dos cables de color "+color_cable+" para identificar el positivo y negativo de la batería.\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Interruptor trifásico.\n"
                + "\n"
                + "[0] Salir.","CABLE AUTOMOTRIZ",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion8){
            case 1: Menu_principal(); break;
            case 2: Conectar_interruptor_trifasico(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion8!=2);
        return null;
    }
    
    public static String Conectar_interruptor_trifasico(){
        
        int   opcion9;
        String tamanio_interruptor;
        String numero_conector;
        String disenio_interruptor;
        tamanio_interruptor=(JOptionPane.showInputDialog("DETERMINAR EL TAMANIO DEL INTERRUPTOR: "));
        numero_conector=(JOptionPane.showInputDialog("DESCRIBIR EL NUMERO DE CONECTORES A TENER EL INTERRUPTOR: "));
        disenio_interruptor=(JOptionPane.showInputDialog("DEFINIR EL DISEÑO DEL INTERRUPTOR A OCUPAR: "));
        
        do{
        opcion9=Integer.parseInt(JOptionPane.showInputDialog(null,"El interruptor a ocupar es de tamaño "+tamanio_interruptor+" con \n"
                + numero_conector+" para poder activar a un lado altas y al otro bajas,\n"
                + "con un diseño de "+disenio_interruptor+".\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Batería.\n"
                + "\n"
                + "[0] Salir.","TIPO INTERRUPTOR",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion9){
            case 1: Menu_principal(); break;
            case 2: Usar_bateria(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion9!=2);
        return null;
    }
    
    public static String Usar_bateria(){
        
        int   opcion10;
        String estado_bateria;
        String voltaje_bateria;
        String tamanio_bateria;
        String marca_bateria;
        estado_bateria=(JOptionPane.showInputDialog("DETERMINA ESTADO DE BATERÍA: "));
        voltaje_bateria=(JOptionPane.showInputDialog("MEDIR EL VOLTAJE DE LA BATERÍA: "));
        tamanio_bateria=(JOptionPane.showInputDialog("ESTABLECER EL TAMAÑO DE LA BATERÍA A OCUPAR: "));
        marca_bateria=(JOptionPane.showInputDialog("ESPECIFICAR LA MARCA DE LA BATERIA A OCUPAR: "));
        
        do{
        opcion10=Integer.parseInt(JOptionPane.showInputDialog(null,"La batería  se encuenta en "+estado_bateria+" con un volta de: "+voltaje_bateria+".\n"
                + "De tamaño "+tamanio_bateria+" de la marca "+marca_bateria+".\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Voltaje de la batería.\n"
                + "\n"
                + "[0] Salir.","BATERÍA",JOptionPane.QUESTION_MESSAGE));
                
        switch(opcion10){
            case 1: Menu_principal(); break;
            case 2: Medir_voltaje(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion10!=2);
        return null;
    }
    
    public static String Medir_voltaje(){
        
        int   opcion11;
        double valor_voltaje=7;
        
        valor_voltaje=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VOLTAJE DE LA BATERÍA A UTILIZAR"));
        
        if (valor_voltaje>=7){
            do{
            opcion11=Integer.parseInt(JOptionPane.showInputDialog(null, "Batería con alto voltaje de "+valor_voltaje+" voltios.\n"
                + "El sistema de luces encendera con normalidad.\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Probar encendido de luces.\n"
                + "\n"
                + "[0] Salir.","VOLTAJE BATERÍA",JOptionPane.QUESTION_MESSAGE));
            switch(opcion11){
            case 1: Menu_principal(); break;
            case 2: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion11!=2);
        return null;
        }else{
            do{
            opcion11=Integer.parseInt(JOptionPane.showInputDialog(null, "Batería con bajo voltaje de "+valor_voltaje+" voltios.\n"
                + "El sistema de luces no encendera.\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "[2] Probar encendido de luces.\n"
                + "\n"
                + "[0] Salir.","VOLTAJE BATERÍA",JOptionPane.QUESTION_MESSAGE));
            switch(opcion11){
            case 1: Menu_principal(); break;
            case 2: Probar_encendido_luces(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion11!=2);
        return null;
        }
    }
    
    public static String Probar_encendido_luces(){
        
        int opcion12;
        int estado_bateria=0;
        double valor_voltaje=7;
        String forma_encendido;
        forma_encendido=(JOptionPane.showInputDialog("DESCRIBA LA FORMA DE ENCENDIDO: "));
        estado_bateria=Integer.parseInt(JOptionPane.showInputDialog("DETERMINA ESTADO DE BATERÍA:\n"
                + "[0] Buen estado de la batería.\n"
                + "[1] Mal estado de la batería"));
        
        if (estado_bateria==0){
            valor_voltaje=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VOLTAJE DE LA BATERÍA A UTILIZAR"));
            if(valor_voltaje>=7){
                do{
            opcion12=Integer.parseInt(JOptionPane.showInputDialog(null, "La bateria esta en buen estado.\n"
                + "La batería tiene un alto voltaje de "+valor_voltaje+" voltios.\n"
                + "El sistema de luces encendera con normalidad, con un "+forma_encendido+".\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "\n"
                + "[0] Salir.","COMPROBACIÓN",JOptionPane.QUESTION_MESSAGE));
            switch(opcion12){
            case 1: Menu_principal(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion12!=2);
        return null;
            }else{
                do{
            opcion12=Integer.parseInt(JOptionPane.showInputDialog(null, "La bateria esta en buen estado.\n"
                + "La batería tiene un bajo voltaje de "+valor_voltaje+" voltios.\n"
                + "El sistema de luces no encendera por su bajo voltaje, aunque tenga un "+forma_encendido+".\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "\n"
                + "[0] Salir.","VOLTAJE BATERÍA",JOptionPane.QUESTION_MESSAGE));
            switch(opcion12){
            case 1: Menu_principal(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion12!=2);
            }
        }else{
            do{
            opcion12=Integer.parseInt(JOptionPane.showInputDialog(null, "La bateria esta en mal estado.\n"
                + "El sistema de luces no encendera, aunque tenga un "+forma_encendido+"\n"
                + "\n"
                + "[1] Menu principal.\n"
                + "\n"
                + "[0] Salir.","COMPROBACIÓN",JOptionPane.QUESTION_MESSAGE));
            switch(opcion12){
            case 1: Menu_principal(); break;
            case 0: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DÍA");System.exit(0); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion12!=2);
        return null;
        }
        return null;
    }
    ////////////////////////////////////////////////////////////////////////////
    public static String Comprobar_sistema_encendido(){
        
        int opcion_1;
        do{
        opcion_1 = Integer.parseInt(JOptionPane.showInputDialog(null,""
                + "[1] Bombillo tipo Piloto.\n"
                + "[2] Bombillo tipo Halógeno.","Tipo de bombillo",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_1){
            case 1: Tipo_bombillo_Piloto(); break;
            case 2: Tipo_bombillo_Halogeno(); break;
            default: JOptionPane.showMessageDialog(null, "La opcion seleccionada es incorrecta "
                    + "vuelva a seleccionar.\n.","ERROR OPCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        }while(opcion_1!=2);
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
                + "[1] Para regresar al menu principal.\n"
                + "[0] Para salir.\n"
                + "","Bombillo de un filamento",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion_3){
            case 1: Menu_principal(); break;
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
                + "[1] Voltaje de batería de [0 a 7]v.\n"
                + "[2] Voltaje de bateria de [8 a 12]v.\n"
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
            case 1: Menu_principal(); break;
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
        System.out.println(Menu_principal());
        
    }
    
}
