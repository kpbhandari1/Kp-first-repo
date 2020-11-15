package Bhandari;
//class ko name and movie ko name same cha so do not be confused.
// method called plot do different function according to their perspective movie so we override.

class Movie { // we crate a main class name Movie with one field called name.
    private String name;

    public Movie(String name) { // we create a constructor.
        this.name = name;
    }

    public String Function() {  // we crate a method called function of that particular movie do in same class.
        return "No function Do Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {  // Create class called Jaws which extend Movie main class.
    public Jaws() {         // Jaws is an movie by the way. and we create a constructor and write our
        super("Jaws");// own movie name.
    }

    @Override   // we override method for main class so we can use for our purpose name now for
    public String Function() { //second movie jaws.
        return ("A Shark eats a lots of people");
    }
}

class independenceDay extends Movie {
    public independenceDay() {
        super("Independence Day");
    }

    @Override
    public String Function() {
        return ("Aliens attempt to take over planet earth");
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String Function() {
        return ("Kids try and escape a maze");
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star  Wars");
    }

    @Override
    public String Function() {
        return ("Imperial Forces try to take over the universe");
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
//    No method override here
}


public class Polymorphism {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i+
            ":" + movie.getName() + "\n" +
                    "Function:" + movie.Function()+ "\n"); // movie.function  is getting from each class. powerful point.

        }
    }

    public static Movie randomMovie() { // we create a method called randomMovie, and why we write Movie in front
        int randomNumber = (int) (Math.random() * 5) + 1; // of randomMovie method because all movies down has a
        System.out.println("Random Number generated was: " + randomNumber);// relation with Movie class above.
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new independenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:

        }
        return null;
    }
}

