public class dragon02 {
    int x, y, width, height;

    public dragon02(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x >= 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    void moveRight() {
        if (x <= width - 1) {
            x++;
        } else {
            detectCollision();
        }
    }

    void moveUp() {
        if (y >= 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    void moveDown() {
        if (y <= height - 1) {
            y++;
        } else {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi Dragon : (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }
}
