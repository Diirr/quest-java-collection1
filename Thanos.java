import java.util.*;

public class Thanos {

    public static void main(String[] args) {


	/*   Hero widow = new Hero("Black Widow", 34);
	   Hero captain = new Hero("Captain America", 100);
	   Hero vision = new Hero("Vision", 3);
	   Hero iron = new Hero("Iron Man", 48);
	   Hero scarlett = new Hero("Scarlett Witch", 29);
	   Hero thor = new Hero("Thor", 1500);
	   Hero hulk = new Hero("Hulk", 49);
	   Hero doctor = new Hero("Doctor Strange", 42);
	   */
	   
	    ArrayList<Hero> idols = new ArrayList<>();
	    idols.add(new Hero ("Black Widow", 34));
	    idols.add(new Hero ("Captain America", 100));
	    idols.add(new Hero ("Vision", 3));
	    idols.add(new Hero ("Iron Man", 48));
	    idols.add(new Hero ("Scarlett Witch", 29));
	    idols.add(new Hero ("Thor",1500));
	    idols.add(new Hero ("Hulk",49));
	    idols.add(new Hero ("Doctor Strange", 42));


 
	   idols.get(5).setAge(1501);

	   Collections.shuffle(idols);

	   idols.subList(idols.size()/2,idols.size()).clear();

	   for(Hero hero : idols){
	      System.out.println("Name des Helden: "+hero.getName()+". Das Alter des Helden: "+hero.getAge());
	   } 


    }
}
