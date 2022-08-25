
package POO;

import java.util.Scanner;


public class Main {
    
    public static void main(String [] args)
    { 
         int opcion = 4;
         Transporte trans1 = new Transporte();
         Tren objeto1 = new Tren();
         Scanner acceso = new Scanner(System.in);
         Scanner acceso2 = new Scanner(System.in);
        
         System.out.println("\t\t\tBienvenido al programa sobre la Herencia en POO");
         
                 
       do
       {
           
             System.out.println("\n\n\t\t---Menu de opciones--");
             System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
             System.out.println("\n\t1. La opcion de registrar");
             System.out.println("\n\t2. La opcion de editar");
             System.out.println("\n\t3. La opcion de imprimir");
             System.out.println("\n\t4. salir de la aplicacion");
             opcion = acceso.nextInt();
           
           switch(opcion)
           {
               case 1:
                    System.out.println("\n\n\tUsted eligio la opcion de registrar");
                    System.out.println("\n\n\tRegistre los datos:");
                    System.out.println("\n\tAltura:");
                    float altura = acceso2.nextFloat();
                    trans1.setAltura(altura);
                        acceso2.nextLine();
                    System.out.println("\n\tColor:");
                    String color = acceso2.nextLine();
                    trans1.setColor(color);
                        acceso2.nextLine();
                    System.out.println("\n\tEl gasto de gasolina: ");
                    double gastoGasolina = acceso2.nextDouble();
                    trans1.setGastoGasolina(gastoGasolina);
                        acceso2.nextLine();
                    System.out.println("\n\tModelo: ");
                    String modelo = acceso2.nextLine();
                    objeto1.setModelo(modelo);
                        acceso2.nextLine();
                    System.out.println("\n\tPeso: ");
                    double peso = acceso2.nextDouble();
                    objeto1.setPeso(peso);
                        acceso2.nextLine();
                    System.out.println("\n\tVelocidad: ");
                    float velocidad = acceso2.nextFloat();
                        acceso2.nextLine();
                    objeto1.setVelocidad(velocidad);

                   break;
                   
               case 2:
                   
                   int op = 5 ;
                     
                     System.out.println("\n\n\tUsted eligio la opcion de editar");
                     Scanner acceso3 =  new Scanner(System.in);
                     Scanner acceso4 = new Scanner(System.in);
                     
                     do
                     {
                         System.out.println("\n\n\t---Menu para editar los datos---");
                         System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
                         System.out.println("\n\t1. Editar altura");
                         System.out.println("\n\t2. Editar color");
                         System.out.println("\n\t3. Editar gasto de gasolina");
                         System.out.println("\n\t4. Editar modelo");
                         System.out.println("\n\t5. tipo de carga");
                         System.out.println("\n\t6. velocidad");
                         System.out.println("\n\t7. salir");
                         op = acceso3.nextInt();
                         
                         switch(op)
                         {
                             case 1:
                                 System.out.println("\n\tIntroduzca la altura nueva ");
                                 altura = acceso4.nextFloat();
                                 trans1.setAltura(altura);
                                 break;
                                 
                             case 2:
                                 System.out.println("\n\tIntroduza el color nuevo");
                                 color = acceso4.nextLine();
                                 trans1.setColor(color);
                                 break;
                                 
                             case 3:
                                 System.out.println("\n\tIntroduza el gasto de gasolina nuevo");
                                 gastoGasolina = acceso4.nextDouble();
                                 trans1.setGastoGasolina(gastoGasolina);
                                 break;
                                 
                             case 4:
                                 System.out.println("\n\tIntroduca el modelo nuevo");
                                 modelo = acceso4.nextLine();
                                 objeto1.setModelo(modelo);
                                 break;
                                 
                             case 5:
                                 System.out.println("\n\tIntroduzca el peso nuevo");
                                 peso = acceso4.nextDouble();
                                 objeto1.setPeso(peso);
                                 break;
                                 
                             case 6:
                                 System.out.println("\n\tIntroduza la nueva velocidad");
                                 velocidad = acceso4.nextFloat();
                                 objeto1.setVelocidad(velocidad);
                                 break;
                                 
                             case 7:
                                 break;
                             
                            default: System.out.println("sted puso una opcion que no esta el menu, por favor vuelva a intentarlo");

                         }
                         
                     }while(op != 7);
                   
                   
                   break;
               case 3:
                     System.out.println("\n\n\tUsted eligio la opcion de imprimir");
                     System.out.println("\n\tLa altura es: "+trans1.getAltura());
                     System.out.println("\n\tLa color es: "+trans1.getColor());
                     System.out.println("\n\tel gasto de gasolina es: "+trans1.getGastoGasolina());
                     System.out.println("\n\tEl modelo: "+objeto1.getModelo());
                     System.out.println("\n\tEl peso: "+objeto1.getPeso());
                     System.out.println("\n\tLa velocidad es: "+objeto1.getVelocidad());
                   break;
                   
               case 4:
                System.out.println("\n\n\t\t---Gracias por tu visita:)");
                   break;
                
               default: System.out.println("sted puso una opcion que no esta el menu, por favor vuelva a intentarlo");
                           
               
               
           }
           
       }while(opcion != 4);
         
    }
    
    
}
