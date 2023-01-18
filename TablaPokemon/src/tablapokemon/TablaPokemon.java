/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablapokemon;


import java.util.Scanner;
/**
 *
 * @author usuari
 */
public class TablaPokemon {

     public static void main(String[] args) {
        String[] tiposPokemon = {
                                            "ACERO", 
                                            "AGUA", 
                                            "BICHO",
                                            "DRAGON",
                                            "ELECTRICO",
                                            "FANTASMA",
                                            "FUEGO",
                                            "HADA",
                                            "HIELO",
                                            "LUCHA",
                                            "NORMAL",
                                            "PLANTA",
                                            "PSIQUICO",
                                            "ROCA",
                                            "SINIESTRO",
                                            "TIERRA",
                                            "VENENO",
                                            "VOLADOR"
                                          };
 
        
 /*
        FILAS = Pokemon atacante
        COLUMNAS = Pokemon que recibe el ataque
         
        Significados de los números:
            - 0.5: el atacante hace la mitad de daño al oponente (No es muy eficaz) 
            - 1: el atacante hace un daño neutro al oponente (No se da información pero diremos neutro)
            - 2: el atacante hace el doble de daño al oponente (Es muy eficaz)
            - 0: el atacante hace un daño nulo al oponente (No afecta)
 
    */
    double[][] efectividadesPokemon = {
         
        /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
         
        { 0.5   , 0.5  ,   1   ,   1    , 0.5  ,  1   ,  0.5   ,  2  ,   2   ,   1   ,    1    ,   1   ,  1   ,  2  ,   1   ,   1   ,    1   ,   1},   //ACERO
        {  1    , 0.5  ,   1   ,  0.5   ,  1   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,    1   ,   1},   //AGUA
        { 0.5   ,  1   ,   1   ,   1    ,  1   , 0.5  ,  0.5   , 0.5 ,   1   ,  0.5  ,    1    ,   2   ,  2   ,  1  ,   2   ,   1   ,   0.5  ,  0.5},  //BICHO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,   1    ,  0  ,   1   ,   1   ,    1    ,   1   ,  1   ,  1  ,   1   ,   1   ,    1   ,   1},   // DRAGÓN
        {  1    ,  2   ,   1   ,  0.5   , 0.5  ,  1   ,   1    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  1  ,   1   ,   0   ,    1   ,   2},   // ELÉCTRICO
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    ,  1  ,   1   ,   1   ,    0    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // FANTASMA
        {  2    , 0.5  ,   2   ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   2   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // FUEGO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   2   ,    1    ,   1   ,  1   ,  1  ,   2   ,   1   ,   0.5  ,   1},   // HADA
        { 0.5   , 0.5  ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,  0.5  ,   1   ,    1    ,   2   ,  1   ,  1  ,   1   ,   2   ,    1   ,   2},   // HIELO
        {  2    ,  1   ,  0.5  ,   1    ,  1   ,  0   ,   1    , 0.5 ,   2   ,   1   ,    2    ,   1   , 0.5  ,  2  ,   2   ,   1   ,   0.5  ,  0.5},  // LUCHA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  0   ,   1    ,  1  ,   1   ,   1   ,    1    ,   1   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // NORMAL
        { 0.5   ,  2   ,  0.5  ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,   0.5  ,  0.5},  // PLANTA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   1   , 0.5  ,  1  ,   0   ,   1   ,    2   ,   1},   // PSÍQUICO
        { 0.5   ,  1   ,   2   ,   1    ,  1   ,  1   ,   2    ,  1  ,   2   ,  0.5  ,    1    ,   1   ,  1   ,  1  ,   1   ,  0.5  ,    1   ,   2},   // ROCA
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    , 0.5 ,   1   ,  0.5  ,    1    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // SINIESTRO
        {  2    ,  1   ,  0.5  ,   1    ,  2   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   1   ,    2   ,   0},   // TIERRA
        {  0    ,  1   ,   1   ,   1    ,  1   , 0.5  ,   1    ,  2  ,   1   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,  0.5  ,   0.5  ,   1},   // VENENO
        { 0.5   ,  1   ,   2   ,   1    , 0.5  ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1}    // VOLADOR
    };
    
    int opcion;
    
    do
    {
        opcion = menu();
        
        switch(opcion)
        {
            case 1: //mostrarAtaquepara  2 pokemons
                ataquePokemon(tiposPokemon,efectividadesPokemon);
                break;
            case 2: //debilidades
                mostrarDebilidades(tiposPokemon,efectividadesPokemon);
                break;
            case 3: //todos los daños
                mostrarDanyos(tiposPokemon,efectividadesPokemon);
                break;
            case 4: //efectivo
                mostrarAtaquesEfectivos(tiposPokemon,efectividadesPokemon);
                break;
            case 5: //buscarAtauesDobles
                buscarAtaques(tiposPokemon,efectividadesPokemon);
                break;
            case 0:
                System.out.println("Adeu");
                break;
              
        }
    }while(opcion!=0);
    
    
    
   
    
    
    
    
    
    }

    /**
     *  Pide tipo Pokemon y devuelve
     * @param pedir_tipo_pokemon_ataca
     * @return 
     */
    private static String pedirFrase(String frase) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        return sc.nextLine();
    }

    /**
     * Devuelve la posición del tipo que buscamos
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes lista con todos los tipos de pokemon
     * @param tipo el tipo de pokemon que buscamos
     * @return devuelve la fila del tipo pokemon, -1 si no lo encuentra
     */
    private static int filaPokemon(String[] tiposPokemon, String tipo) {
        int fila=-1;
        for (int i = 0; i < tiposPokemon.length; i++) {
            if (tiposPokemon[i].equalsIgnoreCase(tipo))
            {
                fila = i;
            }
        }
        
        return fila;
    }



    private static int menu() {
         Scanner sc = new Scanner(System.in);
         int opcion;
         do
         {
            System.out.println("0.- Salir");
            System.out.println("1.- Mostrar impacto de atacante 1 al atacante 2");
            System.out.println("2.- Mostrar debilidades para un tipo pokemon");
            System.out.println("3.- Mostrar todos los daños para un tipo de pokemon");
            System.out.println("4.- Mostrar con que pokemons es mas efectivo un tipo pokemon y contar cuantos hay");
            System.out.println("5.- Mostrar todas las combinaciones de ataques que tenga la efectividad buscada y contar cuantos hay");
            System.out.print("Pon opción: ");
            opcion = sc.nextInt();        
         }while(opcion<0 || opcion > 5);
         return opcion;
    }

    /**
     * Pedira dos tipos de pokemon y mostrarà la fuerza de ataque del primer pokemon s
     * sobre el segundo
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes
     * @param efectividadesPokemon combinaciones ataques por tipo pokemon
     */
    private static void ataquePokemon(String[] tiposPokemon, double[][] efectividadesPokemon) {
    
        String tipo = pedirFrase("Pedir tipo pokemon ataca");
        int fila_ataque = filaPokemon(tiposPokemon,tipo);
        String tipo2 = pedirFrase("Pedir tipo pokemon recibe ataque");
        int fila_recibe = filaPokemon(tiposPokemon,tipo2);    
        if (fila_ataque!=-1 && fila_recibe != -1)
        {
            System.out.println("Pokemon tipo " + tiposPokemon[fila_ataque] + " ataca a " 
                +  tiposPokemon[fila_recibe] + " con:" 
                + efectividadesPokemon[fila_ataque][fila_recibe]);
        }
        else
        {
            System.out.println("Tipos inexistente");
        }        
    }

    /**
     * Pedira un tipo pokemon, y se mostrara todos los tipos que 
     * le atacan con fuerza dos
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes
     * @param efectividadesPokemon combinaciones ataques por tipo pokemon 
     */
    private static void mostrarDebilidades(String[] tiposPokemon, double[][] efectividadesPokemon) {
        
        String tipo = pedirFrase("Pedir tipo pokemon que recibe el ataque");
        int columna_pokemon = filaPokemon(tiposPokemon,tipo);
        
        
        if(columna_pokemon!=-1)
        {
            //fijo la fila y vario SOLO LAS FILAS SI ENCUENTRO
            //UN DOS, MUESTRO EL POKEMON Y LO CUENTO;
            int pokemon_debilitan=0;
            for (int i = 0; i < efectividadesPokemon.length; i++) 
            {
                if (efectividadesPokemon[i][columna_pokemon]==2)
                {
                    pokemon_debilitan++;
                    System.out.println("Le debilitan los pokemon tipo... " + tiposPokemon[i]);
                }
            }
            //al terminar recorrido puedo mostrar contador
            System.out.println("Numero de pokemons debilitan " + pokemon_debilitan);
        }
        else
        {
            System.out.println("Tipo inexistente");
        }        
        pedirFrase("Aprieta return para continuar");
    }

    /**
     * Pedira un tipo pokemon, y se mostrara todos los tipos a los 
     * que  ataca con fuerza dos
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes
     * @param efectividadesPokemon combinaciones ataques por tipo pokemon 
     */
    private static void mostrarAtaquesEfectivos(String[] tiposPokemon, double[][] efectividadesPokemon) {
        String tipo = pedirFrase("Dime un tipo Pokemon y te mostrare "
                + " todos los pokemons a los que es mejor que ataques ");
        int fila_pokemon = filaPokemon(tiposPokemon,tipo);
        
        if (fila_pokemon!=-1)
        {
            //fijo la fila y vario SOLO LAS columnas SI ENCUENTRO
            //UN DOS, MUESTRO EL POKEMON Y actualizo contador;
            int pokemon_efectivo=0;
            for (int i = 0; i < efectividadesPokemon[0].length; i++) {
                if (efectividadesPokemon[fila_pokemon][i]==2)
                {
                    pokemon_efectivo++;
                    System.out.println("Le debilitan los pokemon tipo... " + tiposPokemon[i]);
                }
            }
            //al terminar recorrido puedo mostrar contador
            System.out.println("Numero de pokemons que puede atacar " + pokemon_efectivo);
        }
        else
        {
            System.out.println("Tipo inexistente");
        }
        
    }

    /** 
     * Pedira un valor de ataque y mostrara todas las combinaciones 
     * de todos los pokemon que den ese valor
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes
     * @param efectividadesPokemon combinaciones ataques por tipo pokemon 
     */
    private static void buscarAtaques(String[] tiposPokemon, double[][] efectividadesPokemon) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Que valor de ataque quieres buscar? ");
        double ataque = sc.nextDouble();
        int contador=0;
        
        for (int filas = 0; filas < efectividadesPokemon.length; filas++) 
        {
            for (int columnas = 0; columnas < efectividadesPokemon[filas].length; columnas++) {
                if (efectividadesPokemon[filas][columnas]==ataque)
                {
                   System.out.println("Pokemon tipo " + tiposPokemon[filas] + " ataca a " 
            +  tiposPokemon[columnas] + " con:" 
            + efectividadesPokemon[filas][columnas]);
                   contador++;
                }
            }
    
        }
        //fuera for hago resumen
        System.out.println("Numero combinaciones: " + contador);
    }

    /**
     * Pregutnara un tipo de pokemon
     * y mostrara todas las combinaciones con los otros tipos
     * @param tiposPokemon Nombre de todos los pokemon existentes Nombre de todos los pokemon existentes
     * @param efectividadesPokemon combinaciones ataques por tipo pokemon 
     */
    private static void mostrarDanyos(String[] tiposPokemon, double[][] efectividadesPokemon) {
        String tipo = pedirFrase("Dime un tipo Pokemon ");
        
        int columna_pokemon = filaPokemon(tiposPokemon,tipo);
        if (columna_pokemon!=-1)
        {
            pedirFrase("Estas son las combinaciones de ataue con los otros pokemon (aprieta enter)");
        
            for (int fila = 0; fila < efectividadesPokemon[columna_pokemon].length; fila++)
            {
                System.out.println("Puedes atacar al tipo "
                +  tiposPokemon[fila] + " con:" 
                + efectividadesPokemon[fila][columna_pokemon]);

            }

            System.out.println("Numero de combinaciones motradas ... " + efectividadesPokemon[columna_pokemon].length);
            pedirFrase("(aprieta enter para continuar)");
        }
        else
        {
            System.out.println("Tipo inexistente");
        }
        
        
    }
    
}
