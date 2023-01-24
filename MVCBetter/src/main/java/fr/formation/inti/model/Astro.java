package fr.formation.inti.model;

public class Astro {
	
	private String sun;
	private String moon;
	private String rising;
	private Boolean B;
	
	
	
	public String getRising() {
		return rising;
	}

	public Boolean getB() {
		return B;
	}

	public void setB(Boolean b) {
		B = b;
	}

	public void setRising(String rising) {
		this.rising = rising;
	}

	@Override
	public String toString() {
		return "Astro [sun=" + sun + ", moon=" + moon + ", risisng=" + rising + "]";
	}
	
	public String getSun() {
		return sun;
	}
	public void setSun(String sun) {
		this.sun = sun;
	}
	public String getMoon() {
		return moon;
	}
	public void setMoon(String moon) {
		this.moon = moon;
	}

	public Boolean isB() {
		// TODO Auto-generated method stub
		return B;
	}

}
