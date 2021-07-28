public class Reparacion extends Servicio{

private int tipo;
private int cantidad;
private float precio;
private float total;

@Override
public void calcular( ){
asignarPrecio( );
total = precio * cantidad;
}

private void asignarPrecio( ){
if(tipo == 1)
   precio = 8359;
else if(tipo == 2)
   precio = 12647;
}

public void setTipo(int tipo){
this.tipo = tipo;
}

public void setCantidad(int cantidad){
this.cantidad = cantidad;
}

public void setPrecio(float precio){
this.precio = precio;
}

public void setTotal(float total){
this.total = total;
}

public int getTipo( ){ return tipo; }

public int getCantidad( ){ return cantidad; }

public float getPrecio( ){ return precio; }

public float getTotal( ){ return total; }

}