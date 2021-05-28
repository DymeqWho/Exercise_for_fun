package polymorphism.buchalkapolimorphism.movie;

public class StarWars extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Jedi fight with Sith";
    }
}
