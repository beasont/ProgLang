package ass1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

// Tristan Beason, ID 5443, Homework Verification 4

public class Demo {

	public static void main(String[] args) {
		List<Address> addresses = new ArrayList<>();
		
		addresses.add(new Address("Plano St.", "503", "Sulphur Springs", 75482));
		addresses.add(new Address("Prashka", "15", "Skopje", 1000));
		addresses.add(new Address("104 County Road", "2163", "Beckville", 75631));
		addresses.add(new Address("Random Lane", "4", "Randomtown", 19191));
		addresses.add(new Address("Franklin D. Ruzvelt", "8", "Skopje", 1000));
		        List<Address> sortedByCity = addresses.stream()
		                .sorted(Comparator.comparing(Address::getCity))
		                .collect(Collectors.toList());
		        sortedByCity.forEach(Address::printAttributes);

		        addresses.stream()
		                .min(Comparator.comparingInt(a -> Integer.parseInt(a.getStreetnumber())))
		                .ifPresent(a -> {
		                    System.out.println("Address with lowest street number:");
		                    a.printAttributes();
		                });

		        addresses.stream()
		                .max(Comparator.comparingInt(a -> Integer.parseInt(a.getStreetnumber())))
		                .ifPresent(a -> {
		                    System.out.println("Address with highest street number:");
		                    a.printAttributes();
		                });
		        boolean hasSkopje = addresses.stream()
		                .anyMatch(a -> a.getCity().equalsIgnoreCase("Skopje"));
		        System.out.println("Contains Skopje: " + hasSkopje);
		    }
		
    }

class Address {
    private String streetname;
    private String streetnumber;
    private String city;
    private int zip;

    public Address(String streetname, String streetnumber, String city, int zip) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.city = city;
        this.zip = zip;
    }

    public String getStreetname() {
        return streetname;
    }

    public String getStreetnumber() {
        return streetnumber;
    }

    public int getZip() {
        return zip;
    }

    public void printAttributes() {
        System.out.println("Street Name: " + streetname + ", Street Number: " + streetnumber + ", City: " + city + ", Zip Code: " + zip);
    }

	public String getCity() {
		return city;
	}
}

