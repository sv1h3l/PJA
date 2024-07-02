package cz.upol.pja.lecture01;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.awt.BasicStroke;
import java.util.List;

public class CartesianSystem extends HttpServlet {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 575;

    private static final int STEP = 50;
    private static final int START_X = 95;
    private static final int END_X = 545;
    private static final int START_Y = 535;
    private static final int END_Y = 35;

    private static List<Integer> history;
    private static boolean secretValue;

    public static Graphics2D g;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/png");

        BufferedImage bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setStroke(new BasicStroke(2));
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(1, 1, WIDTH - 2, HEIGHT - 2);

        g.setColor(Color.BLACK);
        int whiteSpaceOfY = 45;
        drawArrow(whiteSpaceOfY, HEIGHT, whiteSpaceOfY, 10);
        g.drawString("y", 15, 20);

        drawArrow(0, START_Y, WIDTH - 10, START_Y);
        g.drawString("x", WIDTH - 15, 555);

        g.drawString("0", 30, 550);

        for (int x = START_X, i = 1; x <= END_X; x += STEP, i++) {
            g.drawLine(x, 530, x, 540);
            g.drawString(Integer.toString(i), x - 5, 560);
        }

        for (int y = START_Y - 50, i = 100; y >= END_Y; y -= STEP, i += 100) {
            g.drawLine(40, y, 50, y);
            g.drawString(Integer.toString(i), 5, y + 5);
        }

        g.setPaint(Color.BLACK);

        drawTree();

        ImageIO.write(bi, "PNG", resp.getOutputStream());
    }

    public static void drawArrow(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);

        double angle = Math.atan2(y2 - y1, x2 - x1);
        int arrowLength = 10;

        g.drawLine(x2, y2, (int) (x2 - arrowLength * Math.cos(angle - Math.PI / 6)), (int) (y2 - arrowLength * Math.sin(angle - Math.PI / 6)));
        g.drawLine(x2, y2, (int) (x2 - arrowLength * Math.cos(angle + Math.PI / 6)), (int) (y2 - arrowLength * Math.sin(angle + Math.PI / 6)));
    }

    public static void drawTree() {
        g.setColor(Color.RED);

        int nth = 0;
        for (Integer integer : history) {
            if (secretValue && history.size() == nth+1) {
                g.setColor(Color.BLUE);
            }
            g.drawString("X", (nth * 50) + START_X - 3, START_Y - (integer / 2) + 4);
            g.drawString(integer.toString(), (nth * 50) + START_X - 10, START_Y - (integer / 2) - 10);
            nth++;
        }
    }

    public static void valuee(List<Integer> historyOfValues, boolean bolSecretValue) {
        history = historyOfValues;
        secretValue = bolSecretValue;
    }
}