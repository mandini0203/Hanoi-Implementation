public class HanoiTowerExample {

    // Recursive function to solve Tower of Hanoi puzzle
    static void solveHanoiTower(int T, char source, char target, char auxiliary) {
        if (T == 1) {
            // Base case: only one disk, move it from source to target
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        // Recursive case: move the top T-1 disks from source to auxiliary, using target as auxiliary
        solveHanoiTower(T - 1, source, auxiliary, target);

        // Move the Tth disk from source to target
        System.out.println("Move disk " + T + " from " + source + " to " + target);

        // Move the T-1 disks from auxiliary to target, using source as auxiliary
        solveHanoiTower(T - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int T = 3;  // Number of disks
        solveHanoiTower(T, 'A', 'C', 'B');  // A is the source, C is the target, B is the auxiliary
    }
}
