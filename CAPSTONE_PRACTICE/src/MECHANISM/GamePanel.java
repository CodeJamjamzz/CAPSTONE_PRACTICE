package MECHANISM;
import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel{
    final int originalTileSize = 16;    // how big is one tile originally
    final int scale = 3;

    final int oneTileSize = scale * originalTileSize;
    final int numberOfColumns = 25;
    final int numberOfRows = 20;
    final int PanelLength = oneTileSize * numberOfRows;
    final int PanelWidth = oneTileSize * numberOfColumns;

    public GamePanel(){
        this.setPreferredSize(new Dimension(PanelLength, PanelWidth));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); // responsible for no flickering during every changes of the screen
    }

//    Thread GameThread;
//
//    public void startGameThread(){
//        GameThread = new Thread();
//        GameThread.start();
//    }



}
