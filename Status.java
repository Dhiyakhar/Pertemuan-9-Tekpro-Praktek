public class Status {
	
//Deklarasi variabel
private int code;
private String description;

//Constructor Class Status
public Status(){
}

//Accessor dan Mutator Class Barang
public int getCode(){ 				//Getter Kode
	return code;
}

public void setCode(int code){ 		//Setter Kode
	this.code = code;
}

public String getDescription(){ 	//Getter Deskripsi Paket
	return description;
}

public void setDescription(String description){ 	//Setter Deskripsi Paket
	this.description = description;
}
}
