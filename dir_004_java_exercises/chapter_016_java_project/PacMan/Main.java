import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame {
    public static final int SAMPLE_CANVAS_WIDTH = 420;
    public static final int SAMPLE_CANVAS_HEIGHT = 480;
    private GameCanvas gameCanvas;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

    public Main() {
        gameCanvas = new GameCanvas();
        gameCanvas.setPreferredSize(new Dimension(SAMPLE_CANVAS_WIDTH,
                SAMPLE_CANVAS_HEIGHT));
        Container containerPane = getContentPane();
        containerPane.add(gameCanvas);
        addKeyListener(gameCanvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("PacMan!");
        setVisible(true);
    }

    private class GameCanvas extends JPanel implements ActionListener, KeyListener {
        public Game game;
        private Timer timer;
        private final int DELAY = 500;

        public GameCanvas() {
            game = new Game();
            timer = new Timer(DELAY, this);
            timer.start();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            game.playRound();
            if (!game.gameActive)
                timer.stop();
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            game.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Block[][] map = game.getMap();
            int BLOCK_WIDTH = 15;

            setBackground(Color.BLACK);
            for (int i = 0; i < 32; i++)
                for (int j = 0; j < 28; j++) {
                    if (map[i][j].entity != null) {
                        if (map[i][j].entity.getClass().toString().indexOf("PacMan") >= 0) {
                            graphics.setColor(Color.YELLOW);
                            graphics.fillRect(j * BLOCK_WIDTH,
                                    i * BLOCK_WIDTH, BLOCK_WIDTH, BLOCK_WIDTH);
                        } else {
                            graphics.setColor(Color.MAGENTA);
                            graphics.fillRect(j * BLOCK_WIDTH,
                                    i * BLOCK_WIDTH, BLOCK_WIDTH, BLOCK_WIDTH);
                        }
                    } else {
                        if (map[i][j].type == BlockType.Wall) {
                            graphics.setColor(Color.WHITE);
                            graphics.fillRect(j * BLOCK_WIDTH,
                                    i * BLOCK_WIDTH, BLOCK_WIDTH, BLOCK_WIDTH);
                        } else if (map[i][j].type == BlockType.Point) {
                            graphics.setColor(Color.RED);
                            graphics.fillRect(j * BLOCK_WIDTH,
                                    i * BLOCK_WIDTH, BLOCK_WIDTH, BLOCK_WIDTH);
                        } else if (map[i][j].type == BlockType.Empty) {

                        }
                    }
                }

            if (!game.gameActive) {
                graphics.setColor(Color.RED);
                graphics.drawString("GAME OVER", 180, 200);
            }
        }
    }
}
