public class Address{
private String city;
private String country;
Address(){
city="No city";
country="No country";
}

Address(Address a){
this.city=a.getCity();
this.country=a.getCountry();}

Address(String city, String country){
this.city=city;
this.country=country;
}

public String getCity(){
return city;}
public String getCountry(){
return country;}
public void setCity(String city){
this.city=city;
this.country=country;
}

}