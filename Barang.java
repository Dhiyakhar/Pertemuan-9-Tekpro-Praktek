public class Barang {

//Deklarasi variabel
private int weight; 
private int quantity; 
private int priceItem; 
String productName; 
int total;

Status status;					//Objek status dari Class Status
ServicePackage servicePackage; 	//Objek servicePackage dari Class ServicePackage
City city;						//Objek city dari Class City

//Constructor Class Barang
public Barang(){					
}

//Accessor dan Mutator Class Barang
public ServicePackage getServicePackage(){ //Getter servicePackage
	return servicePackage;
}

public Status getStatus(){ 				//Getter Status Paket
	return status;
}
public void setStatus(Status status){	//Setter Status Paket
	this.status = status;
}

public City getCity(){ 					//Getter Kota Tujuan dan Asal
	return city;
}

public void setCity(City city){ 		//Setter Kota Tujuan dan Asal
	this.city = city;
}

public int getWeight(){ 				//Getter berat barang
	return weight;
}

public void setWeight(int weight){ 		//Setter berat barang
	this.weight = weight;
}

public int getQuantity(){ 				//Getter banyak barang
	return quantity;
}

public void setQuantity(int quantity){ 	//Setter banyak barang
	this.quantity = quantity;
}

public int getPriceItem(){ 				//Getter harga barang
	return priceItem;
}

public void setPriceItem (int priceItem){ //Setter harga barang
	this.priceItem = priceItem;
}

public String getProductName(){ 		//Getter nama produk
	return productName;
}

public void setTotal(int total){ 		//Setter Total Biaya
	this.total = total;
}

public int getTotal(){					//Mutattor yang menghasilkan Total biaya
	return (priceItem*quantity + servicePackage.getValue());
	}
}
