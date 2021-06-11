public class City {

//Deklarasi variabel
private String origin;
private String destination;

//Constructor Class City
public City(){
}

//Accessor Class City
public String getOrigin(){ 	//Getter Asal Paket
	return origin;
}

public void setOrigin(String origin){ //Setter Asal Paket
	this.origin = origin;
}

public String getDestination(){ //Getter Tujuan Paket
	return destination;
}

public void setDestination(String destination){ //Setter Tujuan Paket
	this.destination = destination;
}
}
