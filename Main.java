import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
public static void main(String[ ] args) throws IOException{

int opc;
boolean valor = true;

InputStreamReader stream = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(stream);

Renta obj1 = new Renta( );
Reparacion obj2 = new Reparacion( );

while(valor){
System.out.println("\n\n*************** <Empresa Electrica> ***************");
System.out.println("Seleccione una opcion del menu: " +
		"\n1. Reparacion de transformador." +
		"\n2. Renta de transformador." +
		"\n3. Salir.");
System.out.print("\nOpcion: ");
opc = Integer.valueOf(reader.readLine( )).intValue( );

if(opc == 1){
System.out.println("\n\n*************** <Reparacion de transformador> ***************");
System.out.print("Ingrese el tipo de transformador [1:Pedestal, 2:Costa]: ");
obj2.setTipo(Integer.valueOf(reader.readLine( )).intValue( ));
System.out.print("Ingrese la cantidad a reparar: ");
obj2.setCantidad(Integer.valueOf(reader.readLine( )).intValue( ));
obj2.calcular( );
System.out.println("\n\nPrecio total: " + obj2.getTotal( ));
}

else if(opc == 2){
System.out.println("\n\n*************** <Renta de transformador> ***************");
System.out.print("Ingrese los dias a renta: ");
obj1.setCantidadDias(Integer.valueOf(reader.readLine( )).intValue( ));
System.out.print("Ingrese la cantidad a rentar: ");
obj1.setCantidad(Integer.valueOf(reader.readLine( )).intValue( ));
obj1.calcular( );
System.out.println("\n\nPrecio total: " + obj1.getTotal( ));
}
else if (opc == 3)
  valor = false;
else
  System.out.println("ERROR. La opcion no existe");

}

}
}