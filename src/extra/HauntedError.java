package extra;

public class HauntedError {

int skeletons; 
String name; 

public HauntedError(String nam, int skeleton) { 
     name = nam; 
     skeletons = skeleton;
}
 

void doScaryStuff(int pumpkins, String scaryPhrase) { 
     System.out.println(pumpkins + " pumpkins say " + scaryPhrase);
} 

public boolean isSpooky(boolean spook) { 
     //Haunted houses are spooky! 
     return true; 
} 

void doThings(){ 
     HauntedError h = new HauntedError("SpookyZone",105); 
     h.doScaryStuff(1000000,"Boo!"); 
     h.isSpooky(true); 
} 
}