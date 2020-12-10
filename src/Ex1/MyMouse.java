package Ex1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse implements MouseListener{
    Window w;
    MyMouse(Window w) {
        this.w = w;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
//        w.paint(w.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}
