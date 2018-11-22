public class Cube {

    Size [] sizes;

    public Cube() {
        sizes = new Size[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = new Size(i+1);
        }
    }

    void showCube(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(
                            sizes[i].part[j][k] + " "
                    );
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    void move(int granNum, int way){

    }

}
