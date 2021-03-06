//Create a Painting class that holds the painting title, artist name, and value.
//All Paintings are valued at $400 unless they are FamousPaintings.
//Include a display function that displays all fields.
//The FamousPainting subclass overrides the Painting value and sets each Painting’s value to $25,000.
//Write a main() function that declares an array of 10 Painting objects.
//Prompt the user to enter the title and artist for each of the 10 Paintings.
//Consider the Painting to be a FamousPainting if the artist is one of the following: Degas, Monet, Picasso, or Rembrandt.
//Display the 10 Paintings. Save the file as Paintings.java.

class Painting{
  protected String title;
  protected String artist;
  protected int value;

  public void setTitle(String newTitle){
    title = newTitle;
    return;
  }
  public void setArtist(String newArtist){
    artist = newArtist;
    return;
  }
  public static display(){
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Value: " + value);
  }
}
