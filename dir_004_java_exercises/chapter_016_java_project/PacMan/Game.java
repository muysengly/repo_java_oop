import java.awt.event.KeyEvent;

public class Game {
    public Block map[][];
    public int sizeX = 32;
    public int sizeY = 28;
    public boolean gameActive = true;
    public Pair pacmanLocation;
    public int pointsLeft;
    public Entity[] player;

    public Game() {
        map = new Block[32][28];
        player = new Entity[4];

        pointsLeft = 0;
        for (int i = 0; i < 32; i++) {
            String line = Chart.chart[i];
            for (int j = 0; j < 28; j++) {
                map[i][j] = new Block();
                map[i][j].entity = null;

                if (line.charAt(j) == '.') {
                    map[i][j].type = BlockType.Point;
                    pointsLeft++;
                } else if (line.charAt(j) == '*')
                    map[i][j].type = BlockType.Wall;
                if (line.charAt(j) == ' ')
                    map[i][j].type = BlockType.Empty;
            }
        }

        player[0] = new PacMan(this, 23, 13);
        this.map[23][13].entity = player[0];
        this.pacmanLocation = new Pair(23, 13);

        player[1] = new Ghost(this, 5, 5);
        this.map[5][5].entity = player[1];

        player[2] = new Ghost(this, 5, 20);
        this.map[5][20].entity = player[2];

        player[3] = new Ghost(this, 8, 5);
        this.map[8][5].entity = player[3];
    }

    public void keyPressed(KeyEvent keyEvent) {
        int key = keyEvent.getKeyCode();
        System.out.println("Key pressed: " + key);

        if (key == KeyEvent.VK_UP) {
            player[0].direction = Direction.Up;
        }
        if (key == KeyEvent.VK_RIGHT) {
            player[0].direction = Direction.Right;
        }
        if (key == KeyEvent.VK_DOWN) {
            player[0].direction = Direction.Down;
        }
        if (key == KeyEvent.VK_LEFT) {
            player[0].direction = Direction.Left;
        }
    }

    public void playRound() {
        for (int i = 0; i < 4; i++)
            player[i].play();
    }

    public Block[][] getMap() {
        return map;
    }
}
