public class Puppy{
    int puppyAge;
    public Puppy(String name){
        System.out.println("Name of the dog: " + name);
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Age of dog: " + puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        /* Create object */
        Puppy myPuppy = new Puppy("tommy");
        /* Set age */
        myPuppy.setAge(2);
        /* Get age */
        myPuppy.getAge();
        System.out.println("Value of puppyAge: " + myPuppy.puppyAge);
    }
}
