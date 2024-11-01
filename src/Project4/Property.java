package Project4;

public class Property{
	  private String propertyName; 
	  private String cityName;
	  private double rentalAmount;
	  private String ownerName;
	  private Plot plot;

	public Property() {
	    this.propertyName = "";
	    this.cityName = "";
	    this.rentalAmount = 0.0;
	    this.ownerName = "";
	    this.plot = new Plot(); 
	}
	Property(String propertyName, String cityName, double rentalAmount, String ownerName) {
		   this.propertyName = propertyName;
		    this.cityName = cityName;
		    this.rentalAmount = rentalAmount;
		    this.ownerName = ownerName;
		    this.plot = new Plot();
		}
	public Property(String propertyName, String cityName, double rentalAmount, String ownerName, int x, int y, int width, int depth) {
	   this.propertyName = propertyName;
	    this.cityName = cityName;
	    this.rentalAmount = rentalAmount;
	    this.ownerName = ownerName;
	    this.plot = new Plot(x, y, width, depth);
	}

	
	public String getPropertyName() {
	  return propertyName;
	}
	public String getCityName() {
	  return cityName;
	}
	public double getRentAmount() {
	  return rentalAmount;
	}
	public String getOwner() {
	    return ownerName;
	}

	public Plot getPlot() {
	  return plot;
	}
	public void setPropertyName(String propertyName) {
	  this.propertyName = propertyName;
	}

	public void setCityName(String city) {
	  this.cityName = cityName;
	}

	public void setRentalAmount(double rentalAmount) {
	  this.rentalAmount = rentalAmount;
	}

	public void setOwner(String ownerName) {
	  this.ownerName = ownerName;
	}

	public void setPlot(Plot plot) {
	  this.plot = plot;
	}
	public String toString() {
	    return propertyName + "," + cityName + "," + ownerName + "," + rentalAmount;
	 
	}
	}
