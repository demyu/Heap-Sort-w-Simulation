import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
import java.awt.Dimension;

/**
 * Controller
 */
public class Controller implements ActionListener {

    private View view;
    private Timer time;
    private Heap heap;
    private Float timeSpeed;
    private double[] oldLocations;
    private ArrayList<theQueue> queue;
    private int globally = 0, globally_1 = -1;
    private ArrayList<String> theText;

    public Controller() {
        this.heap = new Heap();
        this.view = new View(heap.getArray().length, this);
        for (int i = 0; i < heap.getArray().length; i++) {
            view.getLabels()[i].setText(Integer.toString(heap.getArray()[i]));
            Dimension d = new Dimension(120, 16);
            view.getLabels()[i].setMaximumSize(d);
            view.getLabels()[i].setName(Integer.toString(i));
            view.repaint();
        }
        this.queue = new ArrayList<theQueue>();
        this.theText = new ArrayList<String>();
        theText.add(Arrays.toString(heap.getArray()));
        setHistory(0);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton source = (JButton) ae.getSource();
        if (source.getText().equals("Randomize")) {
            view.getButtons()[0].setEnabled(true);
            this.heap = new Heap();
            view.initialize(heap.getArray().length);
            for (int i = 0; i < heap.getArray().length; i++) {
                view.getLabels()[i].setText(Integer.toString(heap.getArray()[i]));
                Dimension d = new Dimension(120, 16);
                view.getLabels()[i].setMaximumSize(d);
                view.repaint();
            }
        } else if (source.getText().equals("Start")) {
            try {
                // TODO add the sorting here
                timeSpeed = Float.parseFloat(view.getJRadioButton());
                time = new Timer((int) (timeSpeed * 10), new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        timerListener(e);
                    }
                });
                heapSort(heap.getArray());
                // Todo

                view.getButtons()[1].setText("Stop");
                view.getButtons()[0].setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Set Speed First", "Error", JOptionPane.ERROR_MESSAGE);
            }
            // Todo
        } else if (source.getText().equals("Stop")) {
            // Todo
            time.stop();
            view.getButtons()[0].setEnabled(true);
            view.getButtons()[1].setText("Start");
            view.getButtons()[1].setEnabled(false);
        }
    }

    public void swapper(JLabel l1, JLabel l2, double[] oldLocations, int i1, int i2) {
        Rectangle label1 = l1.getBounds();
        Rectangle label2 = l2.getBounds();

        double x1 = label1.getX();
        double oldX1 = oldLocations[0];
        double y1 = label1.getY();
        double oldY1 = oldLocations[1];
        double x2 = label2.getX();
        double oldX2 = oldLocations[2];
        double y2 = label2.getY();
        double oldY2 = oldLocations[3];
        int speed = 1;
        // Todo
        if (0 == (oldX1 - x2) && 0 == (oldY1 - y2) && 0 == (x1 - oldX2) && 0 == (y1 - oldY2)) {
            globally += 1;
            innerSwap(i1, i2);
        }
        l1.setText(l1.getText());
        l2.setText(l2.getText());
                        if (0 < (oldX1 - x2)) {
                            x2 += speed;
                            label2.setBounds((int) x2, (int) label2.getY(), (int) label2.getWidth(), (int) label2.getHeight());
                            l2.setBounds(label2);
                            view.repaint();
                        }
                        if (0 > (oldX1 - x2)) {
                            x2 -= speed;
                            label2.setBounds((int) x2, (int) label2.getY(), (int) label2.getWidth(), (int) label2.getHeight());
                            l2.setBounds(label2);
                            view.repaint();
                        }
                        if (0 < (oldY1 - y2)) {
                            y2 += speed;
                            label2.setBounds((int) label2.getX(), (int) y2, (int) label2.getWidth(), (int) label2.getHeight());
                            l2.setBounds(label2);
                            view.repaint();
                        }
                        if (0 > (oldY1 - y2)) {
                            y2 -= speed;
                            label2.setBounds((int) label2.getX(), (int) y2, (int) label2.getWidth(), (int) label2.getHeight());
                            l2.setBounds(label2);
                            view.repaint();
                        }

        if (0 < (x1 - oldX2)) {
            x1 -= speed;
            label1.setBounds((int) x1, (int) label1.getY(), (int) label1.getWidth(), (int) label1.getHeight());
            l1.setBounds(label1);
            view.repaint();
        }
        if (0 > (x1 - oldX2)) {
            x1 += speed;
            label1.setBounds((int) x1, (int) label1.getY(), (int) label1.getWidth(), (int) label1.getHeight());
            l1.setBounds(label1);
            view.repaint();
        }
        if (0 < (y1 - oldY2)) {
            y1 -= speed;
            label1.setBounds((int) label1.getX(), (int) y1, (int) label1.getWidth(), (int) label1.getHeight());
            l1.setBounds(label1);
            view.repaint();
        }
        if (0 > (y1 - oldY2)) {
            y1 += speed;
            label1.setBounds((int) label1.getX(), (int) y1, (int) label1.getWidth(), (int) label1.getHeight());
            l1.setBounds(label1);
            view.repaint();
        }

    }

    public void timerListener(ActionEvent e) {
            if(globally!=queue.size() ){
                setHistory(globally);
                theQueue q = queue.get(globally);
                swapper(view.getLabels()[q.getI()], view.getLabels()[q.getK()], q.getOldValues(), q.getI(), q.getK());
                
            }else{
                time.stop();
            }
    }

    public int[] heapSort(int[] array) {
        // Creating heap
        int middle = array.length / 2 - 1;
        for (int i = middle; i >= 0; i--) {
         int leftChild = array[i * 2 + 1];
         // If there is not right child it will be equal to left child
         int rightChildren = array[i * 2 + (i * 2 + 2 < array.length ? 2 : 1)];
         // "Sift" current element if it is less than one of its children
         if (array[i] < Math.max(leftChild, rightChildren)) {
          array = sift(i, array, array.length);
         }
        }
        // Sorting array
        // Right bound of unsorted part of array
        int rightBound = array.length;
        while (rightBound > 0) {
         // Changing positions of the first and the last elements
         array = swap(0, rightBound - 1, array);
         theText.add("Swapping First And Last Elements");
         rightBound--;
         // Sifting new first element considering decremented right bound
         array = sift(0, array, rightBound);
        }
        time.start();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < queue.size(); i++) {
            queue.get(i).toStr();
        }
        return array;
       }
      
    public int[] sift(int index, int[] array, int rightBound) {
        // Iterate while element has at least one child
        while (index * 2 + 1 < rightBound) {
         int leftChild = array[index * 2 + 1];
         int rightChild = array[index * 2 + (index * 2 + 2 < rightBound ? 2 : 1)];
         // If left child is bigger than left and current element we need to
         // swap current with left child and go to the next iteration
         if (leftChild >= rightChild && leftChild > array[index]) {
          theText.add("Swap " + array[index * 2 + 1] + " >= " + array[index]);
          array = swap(index, index * 2 + 1, array);
          
          index = index * 2 + 1;
          continue;
         }
         // If right child is greater than current - swap and go to the next
         if (rightChild > array[index]) {
          theText.add("Swap " + array[index * 2 + 2] + " > " + array[index]);
          array = swap(index, index * 2 + 2, array);
          index = index * 2 + 2;
          continue;
         }
         // Since we got here, current element is bigger than it children, so we
         // don't need to iterate more
         break;
        }
        return array;
       }
      
   // Change positions of two elements with indicies i1 and i2 in array

    public int[] swap(int i1, int i2, int[] array) {

        oldLocations = new double[] { view.getLabels()[i1].getX(), view.getLabels()[i1].getY(),view.getLabels()[i2].getX(), view.getLabels()[i2].getY()};
        queue.add(new theQueue(i1, i2, oldLocations));
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        return array;
    } 

    public void innerSwap(int i1,int i2){
        JLabel[] k = new JLabel[view.getLabels().length];
        for (int i = 0; i < k.length; i++) {
            k[i] = view.getLabels()[i];
        }

        System.out.print(k[i1].getText());
        JLabel lTemp = k[i1];
        k[i1]=k[i2];
        System.out.print(k[i1].getText());
        k[i2]=lTemp;
        view.setLabels(k);

        System.out.println(" ");
        view.repaint();
    }

    public void setHistory(int i){
        String temp= "";
        for (int j = 0; j < i+1; j++) {
            temp += theText.get(j) + "\n";
        }
        view.setPane(temp);
    }

}

