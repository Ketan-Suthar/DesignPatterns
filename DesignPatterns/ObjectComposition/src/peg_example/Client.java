package peg_example;

public class Client
{
    public static void main(String[] args)
    {
        // Round fits round, no surprise.
        var hole = new RoundHole(5);
        var rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        var smallSqPeg = new SquarePeg(2);
        var largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        var smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        var largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
