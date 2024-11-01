package Project4;

public class ManagementCompany {
	private String name1;
    private String taxId;
    private double mangFeeProp;
    
    public static final int MAX_PROPERTY = 5;
    private static final int MGMT_WIDTH = 10;
    private static final int MGMT_DEPTH = 10;

    private Property[] properties;
    private Plot plot;
    private int numOfProps;


    public  ManagementCompany() {
        this.name1 = "";
        this.taxId = "";
        this.mangFeeProp = 0.0;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numOfProps = 0;
    }


public ManagementCompany(String namE, String taxId, int manageFeePercentage) {
        this.name1 = namE;
        this.taxId = taxId;
        this.mangFeeProp = manageFeePercentage;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numOfProps = 0;
    }

public String getName() {
    return name1;
}
public double getManageFeePercentage() {
    return mangFeeProp;
}


public Plot getPlot() {
    return plot;
}
public String getTaxId() {
    return taxId;
}

public int addProperty(Property property) {
    if (numOfProps >= MAX_PROPERTY) return -1;
    if (property == null) return -2;
    if (!plot.encompasses(property.getPlot())) return -3;
    
    for (int i = 0; i < numOfProps; i++) {
        if (properties[i] != null && properties[i].getPlot().overlaps(property.getPlot())) return -4;
    }

    properties[numOfProps] = property;
    numOfProps++;
    return numOfProps - 1;
}

public double getTotalRent() {
    double totalRent = 0;
    for (int i = 0; i < numOfProps; i++) {
        if (properties[i] != null) {
            totalRent += properties[i].getRentAmount();
        }
    }
    return totalRent;
}



public void removeLastProperty() {
    if (numOfProps > 0) {
        properties[numOfProps - 1] = null;
        numOfProps--;
    }
}

public Property getHighestRentProperty() {
    Property mostRentProp = null;
    double highestRent = 0;

    for (int i = 0; i < numOfProps; i++) {
        if (properties[i] != null && properties[i].getRentAmount() > highestRent) {
            highestRent = properties[i].getRentAmount();
            mostRentProp = properties[i];
        }
    }

    return mostRentProp;
}


public int getPropertiesCount() {
    return numOfProps;
}
public boolean isPropertiesFull() {
    return numOfProps >= MAX_PROPERTY;
}
public boolean isManagementFeeValid() {
    return mangFeeProp >= 0 && mangFeeProp <= 100;
}

@Override
public String toString() {
	
	StringBuilder sb = new StringBuilder("List for props " + name1 + ", taxID here: " + taxId + "\n");

    for (int i = 0; i < numOfProps; i++) {
        if (properties[i] != null) {
            sb.append(properties[i].toString()).append("\n");
        }
    }
    

    double totMangFee = getTotalRent() * (mangFeeProp / 100);
    sb.append("\nTot management Fee: ").append(totMangFee);
    return sb.toString();
}



}
