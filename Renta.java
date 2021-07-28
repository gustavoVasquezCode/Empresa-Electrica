public class Renta extends Servicio{

private int cantidadDias;
private float precio;
private float total;

//atributo adicional
private int cantidad;

@Override
public void calcular( ){
validarDias( );
total = precio * cantidad;
}

private void validarDias( ){
if(cantidadDias >= 1 && cantidadDias <= 30)
   precio = 650;
else
   precio = 489;
}

public void setCantidadDias(int cantidadDias){
this.cantidadDias = cantidadDias;
}

public void setPrecio(float precio){
this.precio = precio;
}

public void setTotal(float total){
this.total = total;
}

public void setCantidad(int cantidad){
this.cantidad = cantidad;
}

public int getCantidadDias( ){ return cantidadDias; }

public float getPrecio( ) { return precio; }

public float getTotal( ){ return total; }

public int getCantidad( ){ return cantidad; }

}