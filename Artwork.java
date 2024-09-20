public class Artwork{
private String title;
private int year;
private Artist artist;

Artwork(Artwork art){
this.title=art.getTitle();
this.year=art.getYear();
this.artist=artist;
}
Artwork(){
this.title= "No title";
this.year=0;
this.artist=new Artist("no name");
}
Artwork(String title, int year){
this.title=title;
this.year=year;
}
Artwork(String title, int year, Artist artist){
this.title=title;
this.year=year;
this.artist= artist;}


public void setTitle(String title){
this.title= title;}

public void setYear(int year){
this.year= year;}

public void setArtist(Artist artist){
this.artist= artist;}

public String getTitle(){
return title;}

public int getYear(){
return year;}

public Artist getArtist(){
return artist;}

public void display(){
System.out.println("TITLE :" + title);
System.out.println("YEAR :"+ year);
System.out.println("ARTIST :" + artist.getName());


}
public Artwork deepCopy(){
Artist artist= new Artist(this.artist.getName());


return new Artwork(this.title,this.year,artist);

}
public Artwork shallowCopy(){
return new Artwork(this.title,this.year, this.artist);

}
}

