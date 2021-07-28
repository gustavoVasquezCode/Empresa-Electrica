public abstract class Servicio{

private int dato1;
private float dato2;
private String dato3;

public abstract void calcular( );

public void setDato1(int dato1){
this.dato1 = dato1;
}

public void setDato2(float dato2){
this.dato2 = dato2;
}

public void setDato3(String dato3){
this.dato3 = dato3;
}

public int getDato1( ){ return dato1; }

public float getDato2( ){ return dato2; }

public String getDato3( ){ return dato3; }

}