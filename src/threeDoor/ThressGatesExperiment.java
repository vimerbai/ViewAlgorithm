package threeDoor;

public class ThressGatesExperiment {

    private int N;

    public ThressGatesExperiment(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N must be larger than 0!");
        }

        this.N = N;
    }

    public void run(boolean changeDoor) {

        int wins = 0;
        for (int i = 0; i < N; i++) {
            if (play(changeDoor))
                wins++;
        }

        System.out.println("winning rate: " + (double)wins/N);
    }

    private boolean play(boolean changeDoor) {

        int prizeDoor = (int)(Math.random() * 3);
        int playerChoice = (int)(Math.random() * 3);

        if (playerChoice == prizeDoor) {
            return changeDoor ? false : true;
        }
        else {
            return changeDoor ? true : false;
        }
    }

    public static void main(String[] args) {

        int N = 1000000;

        ThressGatesExperiment exp = new ThressGatesExperiment(N);

        exp.run(true);
        exp.run(false);

    }
}
