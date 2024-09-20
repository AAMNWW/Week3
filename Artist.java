public class Artist{
private String name;
Artist(){
this.name="No name";
}
Artist(String name){
this.name=name;
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;}
public void display(){
System.out.println( "ARTIST NAME:" + name);
}}