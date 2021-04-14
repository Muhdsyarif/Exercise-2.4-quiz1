import java.util.Scanner;
public class Smart_Phone {

  Scanner s = new Scanner(System.in);

	String brand, model, colour, os;	// os = Operating System
	double size, weight, price;
	
	// Create Setter Method
	public void setBrand() {
		System.out.print("Enter Brand: ");
		this.brand = s.nextLine();
	}
	
	public void setModel() {
		System.out.print("Enter Model: ");
		this.model = s.nextLine();
	}
	
	public void setColour() {
		System.out.print("Enter Colour: ");
		this.colour = s.nextLine();
	}
	
	public void setOperatingSystem() {
		System.out.print("Operating System: ");
		this.os = s.nextLine();
	}
	
	public void setSize() {
		System.out.print("Size: ");
		this.size = s.nextDouble();
	}
	
	public void setWeight() {
		System.out.print("Weight: ");
		this.weight = s.nextDouble();
	}
	
	public void setPrice() {
		System.out.print("Price: ");
		this.price = s.nextDouble();
	}
	
	
	// Create Getter Method
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getOperatingSystem() {
		return this.os;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void TopPhone() {
		System.out.println("Enjoy your online game with this new phone!!!");
	}
	
	public void TopPhone2() {
		System.out.println("The iPhone 11 is a smartphone designed, developed, and marketed by Apple Inc");
	}
}
