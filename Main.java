//Library bawaan JAVA
import java.io.FileReader;
import java.io.FileNotFoundException; 
import java.lang.reflect.Type;
import java.util.List; 

import com.google.gson.Gson;				//Menggunakan library gson
import com.google.gson.reflect.TypeToken;

public class Main {
public static void main(String args[]) throws FileNotFoundException{
	
	int i = 0;
	int j = 0;
	
Gson gson = new Gson();
Type listType = new TypeToken<List<Barang>>(){}.getType();

//Mengambil file json yang akan diubah ke objek JAVA
List<Barang> listBarang = gson.fromJson(new FileReader("C:\\Users"+"\\ASUS PRO\\Downloads\\tekpro_PR_ke-9\\barang.json "), listType); 

System.out.println("Product | Price | Quantity | Weight | Origin | Destination | Service | Value | Total ");

for(Barang barang : listBarang ){ 
	j = i+1;
System.out.println(barang.getProductName()+" | "+barang.getPriceItem()+" | "+barang.getQuantity()+" | "+barang.getWeight()+" | "+barang.city.getOrigin()+" | "+barang.city.getDestination()+" | "+barang.servicePackage.getService()+" | "+barang.servicePackage.getValue()+" | "+barang.getTotal());
i++;
}
}
}

 
