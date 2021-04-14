
public class mainPhone {
	
	Smart_Phone as = new Smart_Phone();			//First Object
	as.setBrand("Asus");
	as.setModel("ROG Gaming");
	as.setColour("Red");
	as.setOperatingSystem("Android Gaming X UI");
	as.setSize(6.0);
	as.setWeight(200);
	as.setPrice(3299);
	
	System.out.println("-----Asus-----");
	System.out.println("Brand: " + as.getBrand());
	System.out.println("Model: " + as.getModel());
	System.out.println("Colour: " + as.getColour());
	System.out.println("Operating System: " + as.getOperatingSystem());
	System.out.println("Phone Screen Size: " + as.getSize() + "inch");
	System.out.println("Phone Weight: " + as.getWeight());
	System.out.println("Price(RM): " + as.getPrice());
	as.TopPhone();
	
	System.out.println();
	
	
	Smart_Phone a = new Smart_Phone();			//Second Object
	
	a.setBrand("Apple");
	a.setModel("Iphone 11");
	a.setColour("Black");
	a.setOperatingSystem("IOS 11");
	a.setSize(5.8);
	a.setWeight(194);
	a.setPrice(4999);
	
	System.out.println("-----Apple-----");
	System.out.println("Brand: " + a.getBrand());
	System.out.println("Model: " + a.getModel());
	System.out.println("Colour: " + a.getColour());
	System.out.println("Operating System: " + a.getOperatingSystem());
	System.out.println("Phone Screen Size: " + a.getSize() + "inch");
	System.out.println("Phone Weight: " + a.getWeight() + "grams");
	System.out.println("Price(RM): " + a.getPrice());
	a.TopPhone2();
	
}


}
