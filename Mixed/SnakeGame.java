import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JFrame implements ActionListener, KeyListener {
    private int[] snakeX = new int[750];
    private int[] snakeY = new int[750];
    private int snakeLength = 3; 
    private String direction = "RIGHT";
    private boolean gameOver = false;

    private Timer timer;
    private int delay = 100;

    private int foodX, foodY;
    private Random random = new Random();

    private int score = 0;

    public SnakeGame() {
        this.setTitle("Snake Game");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);

        initializeGame();

        timer = new Timer(delay, this);
        timer.start();
    }

    public void initializeGame() {
        snakeX[0] = 100;
        snakeY[0] = 100;

        generateFood();
    }

    public void generateFood() {
        foodX = random.nextInt(79) * 10;
        foodY = random.nextInt(59) * 10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (!gameOver) {
            // Draw the board
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 800, 600);

            // Draw the snake
            for (int i = 0; i < snakeLength; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(snakeX[i], snakeY[i], 10, 10);
            }

            // Draw the food
            g.setColor(Color.RED);
            g.fillOval(foodX, foodY, 10, 10);

            // Draw the score
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Score: " + score, 10, 30);
        } else {
            // Game Over Screen
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("GAME OVER", 250, 300);

            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Score: " + score, 350, 350);
            g.drawString("Press R to Restart", 320, 400);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            checkCollision();
            repaint();
        }
    }

    public void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }

        switch (direction) {
            case "UP":
                snakeY[0] -= 10;
                break;
            case "DOWN":
                snakeY[0] += 10;
                break;
            case "LEFT":
                snakeX[0] -= 10;
                break;
            case "RIGHT":
                snakeX[0] += 10;
                break;
        }

        // Check if the snake eats the food
        if (snakeX[0] == foodX && snakeY[0] == foodY) {
            snakeLength++;
            score += 10;
            generateFood();
        }
    }

    public void checkCollision() {
        // Check if the snake hits the wall
        if (snakeX[0] < 0 || snakeX[0] >= 800 || snakeY[0] < 0 || snakeY[0] >= 600) {
            gameOver = true;
        }

        // Check if the snake hits itself
        for (int i = 1; i < snakeLength; i++) {
            if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                gameOver = true;
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP && !direction.equals("DOWN")) {
            direction = "UP";
        } else if (keyCode == KeyEvent.VK_DOWN && !direction.equals("UP")) {
            direction = "DOWN";
        } else if (keyCode == KeyEvent.VK_LEFT && !direction.equals("RIGHT")) {
            direction = "LEFT";
        } else if (keyCode == KeyEvent.VK_RIGHT && !direction.equals("LEFT")) {
            direction = "RIGHT";
        } else if (keyCode == KeyEvent.VK_R && gameOver) {
            // Restart the game
            gameOver = false;
            snakeLength = 3;
            score = 0;
            direction = "RIGHT";
            initializeGame();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }
}
