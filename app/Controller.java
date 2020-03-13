package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
import java.awt.Dimension;

/**
 * Controller
 */
public class Controller extends Thread implements ActionListener {

    private View view;
    private Timer time;
    private Heap heap;
    private Float timeSpeed;
    private double[] oldLocations;
    private boolean isAnimating = true;
    private ArrayList<theQueue> queue;
    private int globally = 0;

    public Controller() {
        this.heap = new Heap();
        //this.view = new View(heap.getArray().length, this);
        for (int i = 0; i < heap.getArray().length; i++) {
            view.getLabels()[i].setText(Integer.toString(heap.getArray()[i]));
            Dimension d = new Dimension(120, 16);
            view.getLabels()[i].setMaximumSize(d);
            view.repaint();
        }
        this.queue = new ArrayList<theQueue>();
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
                heapSort(heap.getArray(), heap.getArray().length);

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

    public void swapper(JLabel l1, JLabel l2, double[] oldLocations) {
        Rectangle label1 = l1.getBounds();
        Rectangle label2 = l2.getBounds();
        Rectangle oldLabel1 = l1.getBounds();
        Rectangle oldLabel2 = l2.getBounds();

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
        }

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
            if(globally!=queue.size()){
                theQueue q = queue.get(globally);
                swapper(view.getLabels()[q.getI()], view.getLabels()[q.getK()], q.getOldValues());
            }else{
                time.stop();
            }
    }

    public void buildMaxHeap(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            // if child is bigger than parent
            if (arr[i] > arr[(i - 1) / 2]) {
                int j = i;

                // swap child and parent until
                // parent is smaller
                while (arr[j] > arr[(j - 1) / 2]) {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }

            }
        }
    }

    public void swap(int[] a, int i, int j) {

        oldLocations = new double[] { view.getLabels()[i].getX(), view.getLabels()[i].getY(),
                view.getLabels()[j].getX(), view.getLabels()[j].getY() };
        
        queue.add(new theQueue(i, j, oldLocations));
        
        JLabel lTemp = view.getLabels()[i];
        view.getLabels()[i]=view.getLabels()[j];
        view.getLabels()[j] = lTemp;

        int temp = a[i]; 
        a[i]=a[j]; 
        a[j]=temp;
    } 

    public void heapSort(int arr[], int n) 
    { 
      buildMaxHeap(arr, n); 
    
      for (int i = n - 1; i > 0; i--) 
      { 
        // swap value of first indexed 
        // with last indexed 
        swap(arr, 0, i); 
        // maintaining heap property 
        // after each swapping 
        int j = 0, index; 
    
        do
        { 
          index = (2 * j + 1); 
    
          // if left child is smaller than 
          // right child point index variable 
          // to right child 
          if (index < (i - 1) && arr[index] < arr[index + 1]) 
            index++; 
    
          // if parent is smaller than child 
          // then swapping parent with child 
          // having higher value 
          if (index < i && arr[j] < arr[index]) 
            swap(arr, j, index);
          j = index; 
        } while (index < i); 
      } 
      for (int i = 0; i < heap.getArray().length; i++) {
          System.out.print(heap.getArray()[i] + " ");
      }
      time.start();
    } 
}
