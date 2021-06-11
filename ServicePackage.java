public class ServicePackage { 
	
	//Deklarasi variabel
	private String service; 
	private int value;

//Constructor Class ServicePackage
public ServicePackage(){
}

//Accessor Class ServicePackage
public int getValue(){ 		//Getter ongkir
	return value;
}

public void setValue (int value){ //Setter ongkir
	this.value = value;
}

public String getService(){ //Getter Layanan Paket
	return service;
}

public void setService(String service){ //Setter Layanan Paket
	this.service = service;
}
}
