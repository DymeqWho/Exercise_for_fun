package polymorphism.buchalkapolimorphism.movie;

public class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack Earth";
    }
}
