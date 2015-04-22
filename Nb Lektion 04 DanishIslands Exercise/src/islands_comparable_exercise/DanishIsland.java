package islands_comparable_exercise;

public class DanishIsland implements Comparable<DanishIsland>{

    private String name;
    private double circumference;
    private double area;
    private int addresses;
    private int addrPerKm2;
//penis
    public DanishIsland(String name, double circumference, double area,
            int addresses, int addrPerKm2) {
        super();
        this.name = name;
        this.circumference = circumference;
        this.area = area;
        this.addresses = addresses;
        this.addrPerKm2 = addrPerKm2;
    }

    public String getName() {
        return name;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }

    public int getAddresses() {
        return addresses;
    }

    public int getAddrPerKm2() {
        return addrPerKm2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append("\t");
        builder.append(circumference);
        builder.append("\t");
        builder.append(area);
        builder.append("\t");
        builder.append(addresses);
        builder.append("\t");
        builder.append(addrPerKm2);
        builder.append("\n");
        return builder.toString();
    }

    // Opgave 1. Implementer metoden
    @Override
    public int compareTo(DanishIsland o) {
        if(this.getName().equals(o.getName())) {
        if(this.getAddrPerKm2() > o.getAddrPerKm2()){
            return 1;
        }
        else{
            return -1;
                    }
        }
        return (this.getName().compareTo(o.getName()));
        
    }

}
