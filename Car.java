public class Car{
private String make;
private String model;
private Person owner;
Car(){
make = "No make";
model= "No model";
owner= new Person();
}
Car(String make,String model, Person owner){
this.make= make;
this.model=model;
this.owner=owner;
}
Car(Car car){
this.make=car.getMake();
this.model=car.getModel();
this.owner=new Person(car.getOwner());
}
public String getMake(){
return make;}
public String getModel(){
return model;}
public Person getOwner(){
return owner;}
public void setMake(String make){
this.make=make;}
public void setModel(String model){
this.model=model;}
public void setOwner(Person owner){
this.owner=owner;}
public void display(){
System.out.println(" MAKE: " + make);
System.out.println(" MODEL: " +model);
owner.display();}



}