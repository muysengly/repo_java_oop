import java.util.ArrayList;

public class PacMan extends Entity {
    public PacMan(Game map, int x, int y) {
        this.game = map;
        this.type = EntityType.PacMan;
        this.x = x;
        this.y = y;
    }

    public void play() {
        ArrayList<Pair> candidateBlocks = new ArrayList<>();
        for (int i = x - 1; i <= x + 1; i++)
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < game.sizeX
                        && j >= 0 && j < game.sizeY
                        && !(i == x && j == y)
                        && game.map[i][j].type != BlockType.Wall) {
                    candidateBlocks.add(new Pair(i, j));
                }
            }

        if (direction == Direction.Up
                && candidateBlocks.contains(new Pair(x - 1, y))) {
            move(x - 1, y);
        } else if (direction == Direction.Right
                && candidateBlocks.contains(new Pair(x, y + 1))) {
            move(x, y + 1);
        } else if (direction == Direction.Down
                && candidateBlocks.contains(new Pair(x + 1, y))) {
            move(x + 1, y);
        } else if (direction == Direction.Left
                && candidateBlocks.contains(new Pair(x, y - 1))) {
            move(x, y - 1);
        }
        game.pacmanLocation.x = x;
        game.pacmanLocation.y = y;
        if (game.map[x][y].type == BlockType.Point) {
            game.map[x][y].type = BlockType.Empty;
            game.pointsLeft--;
            if (game.pointsLeft == 0)
                game.gameActive = false;
        }
    }
}
