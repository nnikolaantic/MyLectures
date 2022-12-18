/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypePatternLecture;

/**
 *
 * @author anticn
 */
public class TestCloning {

    public static void main(String[] args) {
        // Handles routing makeCopy method calls to the 
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        //Clone without casting
        Animal cloneWithoutCast = new Sheep();
        cloneWithoutCast = sally.makeCopy();

        // These are exact copies of each other
        System.out.println(sally);

        System.out.println(clonedSheep);
        
        System.out.println(cloneWithoutCast);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
        
        System.out.println("CloneWwithoutCast HashCode: " + System.identityHashCode(System.identityHashCode(cloneWithoutCast)));
        
//        Ako sagledamo mozemo da uporedimo prototaype pattern sa ceovekom
//        Nad covekom je primenjen prototype pattern jer covek je objekat classe,
//        Nad kojom samo bog ima pristup i samo bog moze iz constructora da napravi coveka
//        Ali coveku/objektu je data moc da uz pomoc clone() metode/razmnozavanja
//        Napravi deep clona sebe.
    }

}
