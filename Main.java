public class Main{
public static void main(String[] args){
Artist a1= new Artist("Aamna");

Artwork art1= new Artwork("Mona Lisa", 1998, a1);
art1.deepCopy();
art1.shallowCopy();
a1.display();
	art1.display();


System.out.println("Before changing");
	Artwork shallowCopy = art1.shallowCopy();
	Artwork deepCopy = art1.deepCopy();

	art1.getArtist().setName("HAIQA");
	System.out.println("  After Changing");
	art1.display();

	System.out.println("                  Shallow Copy");
	shallowCopy.display();
	System.out.println("                  Deep Copy");
	deepCopy.display();
	}
}




