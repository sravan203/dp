//House.java (Product)
package com.nt.product;

public class House {
    private  Basement basement;
    private Structure  strucutre;
    private  Roof   roof;
    private  Interiror interiror;
    
	public Basement getBasement() {
		return basement;
	}
	public void setBasement(Basement basement) {
		this.basement = basement;
	}
	public Structure getStrucutre() {
		return strucutre;
	}
	public void setStrucutre(Structure strucutre) {
		this.strucutre = strucutre;
	}
	public Roof getRoof() {
		return roof;
	}
	public void setRoof(Roof roof) {
		this.roof = roof;
	}
	public Interiror getInteriror() {
		return interiror;
	}
	public void setInteriror(Interiror interiror) {
		this.interiror = interiror;
	}
	@Override
	public String toString() {
		return "House [basement=" + basement + "\n, strucutre=" + strucutre + "\n, roof=" + roof + "\n, interiror="
				+ interiror + "]";
	}
	
	
    
}
