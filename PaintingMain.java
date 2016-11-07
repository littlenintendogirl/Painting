public static void main (String[] args) {

  Painting[] paintings = new Painting[10];
  Scanner scnr = new Scanner(System.in);

  for(int i = 0; i < paintings; ++i){
    System.out.println("Title: ");
    paintings[i].setTitle(scnr.nextLine());

    System.out.println("Artist: ");
    paintings[i].setTitle(scnr.nextLine());

    System.out.println(setValue(scnr.nextLine()));
  }
}
