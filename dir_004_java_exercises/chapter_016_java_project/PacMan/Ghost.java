import java.util.ArrayList;
import java.util.Collections;

public class Ghost extends Entity {
    public Ghost(Game map, int x, int y) {
        this.game = map;
        this.type = EntityType.Ghost;
        this.x = x;
        this.y = y;
    }

    public void play() {
        ArrayList<Pair> candidateBlocks = new ArrayList<>();
        ArrayList<Double> distanceToPacman = new ArrayList<>();

        for (int i = x - 1; i <= x + 1; i++)
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < game.sizeX
                        && j >= 0 && j < game.sizeY
                        && !(i == x && j == y)
                        && game.map[i][j].type != BlockType.Wall) {
                    candidateBlocks.add(new Pair(i, j));
                    distanceToPacman
                            .add(
                                    Double.valueOf(
                                            Math.sqrt(Math.pow(i - game.pacmanLocation.x, 2)
                                                    + Math.pow(j - game.pacmanLocation.y, 2))));
                }
            }

        int minDistIn = distanceToPacman.indexOf(Collections.min(distanceToPacman));

        if (game.map[candidateBlocks.get(minDistIn).x][candidateBlocks.get(minDistIn).y].entity != null) {
            // move only if pacman is there
            if (game.map[candidateBlocks.get(minDistIn).x][candidateBlocks
                    .get(minDistIn).y].entity.type == EntityType.PacMan) {
                // eat pacman
                game.map[candidateBlocks.get(minDistIn).x][candidateBlocks.get(minDistIn).y].entity = null;
                game.gameActive = false;
                move(candidateBlocks.get(minDistIn).x, candidateBlocks.get(minDistIn).y);
            }
        } else {
            move(candidateBlocks.get(minDistIn).x, candidateBlocks.get(minDistIn).y);
        }
    }

}
