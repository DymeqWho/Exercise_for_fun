package polymorphism.buchalkapolimorphism.movie;

public class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape maze.";
    }
}
