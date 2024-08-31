package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // method signature = access modifier + (static)  + return type + method name
    public static void main(String[] args) {
        System.out.println("I am learning java!");


        //variables
        int aNumber = 2;
        int anotherNumber = 40;
        int sum = aNumber + anotherNumber; // sum =42
        System.out.println(sum);

        // primitive types
        int anInteger = 30; // integers = 4 bytes
        long aBigInteger = 52533763722682386L; //long = 8 bytes
        float aSmallDecimal = 2.3f; // float = 4bytes
        double aBigDecimal = 3.14; // double precision = 8bytes
        double nStarsInTheUniverse = 1.1e21; // 1.1 *10^21
        double hydrogenRadius = 5.3e-11; //  5.3 * 10^-11
        char aCharacter = 'a';
        char aDigitCharacter = '1'; //Don't confuse '1' with 1
        boolean aTruthValue = true;

        //strings are REFERENCE
        String aString = "I love Java!";

        //expressions
        // math operations
        int multiplyInt = 2 * 3;
        int divideInt = 7/3 ; // only the quotient  is kept for int division
        int remainderInt = 7 % 3; // the remainder of the division


        //incrementing and decrementing
        aNumber++; // aNumber will become 3
        ++aNumber; // aNumber will become 4


        // preincrement and postincrement
        int someInteger = 4;
        int someInteger2 =  someInteger++; // 4, After which someInteger become 5
        int someInteger3 = ++someInteger; // someInteger becomes 5,AFTER WHICH somInteger3 becomes 5
        //same for -- (decrementing)

        // math operators on decimals
        double aDoubleSum = 2.3 + 4.5;
        double divideDouble = 7.0 / 3; // 2.33333...

        // character operations
        char aLetter = 'a';
        aLetter++; // ASCII code,aLetter will become 'b'

        // special characters
        char aQuote = '\''; // escape sequences
        char doubleQuote = '\''; // double
        char newline = '\n'; // new line
        char aTab = '\t'; // tab
        char backslash = '\\';


        // boolean operations
        boolean numberIsTooBig = aNumber > 100; // evaluate to false
        boolean isLetterMyFavourite = aLetter == 't'; //  ==  means the COMPARISION EQUALITY operator
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 0); //  && for logical AND,|| for logical OR
        boolean negate = !smallOddNumber;

        // string operations
        String concatenation = "I Love" + "Java!"; // concatenates strings =>"I Love Java!

        // instructions
        aNumber = 45; // aNumber BECOMES 45
        aNumber = aNumber + 6 ; // aNumber becomes 51
        aNumber +=6;  // equivalent
        // old variables don't update automatically
        System.out.println(sum);


        // control statements
        int age = 78;
        if(age < 30) {  // if/else statements
            System.out.println("You are just getting started!");
            System.out.println("Something else !");
        } else {
            System.out.println("Perfect time to start learning java!");
            age +=1 ;
            System.out.println("You're age has become"+ age);

        }

        // chain if-else structures
        int temperature  = 22;
        if( temperature < 20) {
            System.out.println("Quite chill outside, maybe take a jacket.");
        } else if (temperature  < 25 ) {
            System.out.println("Very pleasant outside , take a walk.");
        } else {
            System.out.println("It's getting hot ,maybe take some water.");
        }


        // while loops
        System.out.println("Watch me count to 10!");
       int counter = 1;
        /*System.out.println(counter); // 1
        counter++;
        System.out.println(counter); // 2
        counter++;
        System.out.println(counter); // 1
        counter++;
        System.out.println(counter); // 2
        counter++;
        System.out.println(counter); // 3
        counter++;
        System.out.println(counter); // 4
        counter++;
        System.out.println(counter); // 5
        counter++;
        System.out.println(counter); // 6
        counter++;
        System.out.println(counter); // 7
        counter++;
        System.out.println(counter); // 8
        counter++; */

        // OR We can do
        // while loops - test condition ,then execute

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // do-while loops  - execute, the test condition
        counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10 );

        // for loops
        for ( counter = 1; // starting instruction
              counter <= 10; // continuation condition
              counter++ // instruction to execute AFTER the contents
        ) {
            System.out.println(counter);
        }
        /*
           starting instruction ;
           as long as (continuation condition) {
                 run contents;
                 instruction to execute after the contents
           }
         */
        // reference types
        // instantiate = create an instance of a class
        Person alice = new Person("Alice",25); // alice is an INSTANCE of class Person
        Person bob = new Person("Bob",24);
        System.out.println(
               alice.username + " says to " +bob.username
                + ": happy birthday for turning " + bob.age + "!"
        );

        // Alice's birthday
        alice.celebrateBirthday();
        //Bob's birthday
        bob.celebrateBirthday();

        String alicesParty = alice.throwParty(20, "my house");
        System.out.println(alicesParty);

        // all reference types (classes) can have methods
        String aTestString = "I love Java!";
        System.out.println(aTestString.length()); // # of characters
        System.out.println(aTestString.startsWith("I love"));
        System.out.println(aTestString.substring(2,7));

        // arrays
        Person charlie = new Person("Charlie", 34);
        // a million other people
        alice.celebrateBirthday();
        bob.celebrateBirthday();
        charlie.celebrateBirthday();
        // a million other user.celebrateBirthday
        Person[] peopleCelebratingToday = new Person[3]; // allocates  space for 3 person references
        peopleCelebratingToday[0] = alice;
        peopleCelebratingToday[1] = bob;
        peopleCelebratingToday[2] = charlie;


        // repeat over an array
        int personIndex = 0;
        while (personIndex < 3) {
            Person currentPerson = peopleCelebratingToday[personIndex];
            currentPerson.celebrateBirthday();
            personIndex++;
        }

        // same thing  with a for loop
        for(personIndex = 0; personIndex < 3; personIndex++) {
            Person currentPerson = peopleCelebratingToday[personIndex];
            currentPerson.celebrateBirthday();
        }

        // foreach loop
        for(Person person : peopleCelebratingToday) {
            person.celebrateBirthday();
        }

        // static members  and methods
        boolean peopleCanFly = Person.canFly;
       // String peoplesProgrammingLanguage = Person.getFavouriteProgrammingLanguage();
       // System.out.println(peoplesProgrammingLanguage);

        // access modifiers
        //System.out.println(alice.secret);


    }
}

class Person { //  REFERENCE TYPE
    // fields = pieces of information attached to a single type
    String username;
    int age;
    static boolean canFly = false;

    // private = ACCESS MODIFIER
    //other access modifier : public,protected,(no modifier = access inside package)
    private String secret = "nobody needs to knw this";

    // CONSTRUCTOR - used to initialize fields
    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // methods = pieces of CODE attached to  a single type
    void celebrateBirthday() {
        this.age++;
        System.out.println(this.username
                + " says: It's my birthday,I just turned "
                + this.age
        );
    }

    String throwParty(int nPeople, String favouritePlace) {
        String throwAParty = this.username + " says: I'm going to throw a party at "
                + favouritePlace;
        String invitePeople = "I'm going to invite " + nPeople
                + " people!";
        // write any code you like!
        return throwAParty + " and " + invitePeople;
    /*
    returnType methodName(arguments) {
      any code

      return  a single value
      }
     */
        // static String  getFavouriteProgrammingLanguage {
        //   return "Java";
    }
}
