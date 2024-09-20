public class Person{
private String name;
private String email;
private Address address;
Person(){
name ="No name";
email="no email";
address= new address("No city", "No country");
}
Person(Person p){
this.name=p.getName;
this.email=p.getEmail;
this.address=new address(p.getAddress());
}
Person(String name,String email){
this.name=name;
this.email=email;}

Person(String name,String email,Address address){
this.name=name;
this.email=email;
this.address=address;

public class Main{
public static void main(String[] args){
Address a1= new Address("karachi","Pakistan");
Person p1=new Person("amna","123@yaahoo.com");
Address add5 = new Address("karachi","pakistan");
	Person p5= new Person("hammas","email",add5);
	Person p6 = new Person("Noor","email",new Address("lahore","pakistan"));	

Address add2 = add1; // Shallow copy for Address object (both references point to the same object)
Person tempPerson = p2; // Shallow copy for Person object (both references point to the same object)
ddress add2 = new Address(add1); // Deep copy for Address object
Person p7 = new Person(p6); // Deep copy for Person object, which includes a deep copy of the Address
Person p7 = new Person(p6);  // Deep copy constructor
p7.getAddress().setCity("Islamabad");  // Modify the deep copy's city

System.out.println("Original Person p6:");
p6.display();  // Will still show the original address

System.out.println("------------");

System.out.println("Deep Copy Person p7:");
p7.display();  // Will show the modified address