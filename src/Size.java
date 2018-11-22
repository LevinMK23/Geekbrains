public class Size {

    int color;
    int [][] part;

    public Size(int color) {
        this.color = color;
        part = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                part[i][j] = color;
            }
        }
    }
}
