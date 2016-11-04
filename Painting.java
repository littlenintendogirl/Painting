//Create a Painting class that holds the painting title, artist name, and value.
//All Paintings are valued at $400 unless they are FamousPaintings.
//Include a display function that displays all fields.
//The FamousPainting subclass overrides the Painting value and sets each Painting’s value to $25,000.
//Write a main() function that declares an array of 10 Painting objects.
//Prompt the user to enter the title and artist for each of the 10 Paintings.
//Consider the Painting to be a FamousPainting if the artist is one of the following: Degas, Monet, Picasso, or Rembrandt.
//Display the 10 Paintings. Save the file as Paintings.java.
import java.util.ArrayList;
import java.util.Scanner;

public class Painting{
  private String title;
  private String artist;
  private int value;

  public void setTitle(String newTitle){
    title = newTitle;
    return;
  }
  public void setArtist(String newArtist){
    artist = newArtist;
    return;
  }
  public void setValue(){
    value = 400;
    return;
  }
}
@Override
public FamousPainting{
  if(artist.contain(artistList)){
    value = 25000;
    return;
}
public static void main (String[] args) {
  ArrayList<String> artistList = new ArrayList<String>();
    artistList.add(new String("Degas, Edgar"));
    artistList.add(new String("Monet, Claude"));
    artistList.add(new String("Picasso, Pablo"));
    artistList.add(new String("Rembrandt van Rijn"));
    artistList.add(new String("Leonardo da Vinci"));

  Painting[] paintings = new Painting[10];
  Scanner scnr = new Scanner(System.in);

  for(int i = 0; i < groceryItem; ++i){
    System.out.println("Title: ");
    paintings[i].setTitle(scnr.nextLine());

    System.out.println("Artist: ");
    paintings[i].setTitle(scnr.nextLine());

    System.out.println(setValue());
  }
}
