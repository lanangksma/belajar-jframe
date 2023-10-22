import javax.swing.*; // import semua class dari package javax.swing
import java.awt.*; // import semua class dari package java.awt
import java.awt.event.ActionEvent; // import class ActionEvent dari package java.awt.event
import java.awt.event.ActionListener; // import class ActionListener dari package java.awt.event

// class HelloGridLayout yang merupakan turunan dari class JFrame
public class HelloGridLayout extends JFrame implements ActionListener{

    // deklarasi variabel buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI
    private final JButton buttonA;
    private final JButton buttonB;
    private final JButton buttonC;
    private final JButton buttonD;
    private final JButton buttonE;
    private final JButton buttonF;
    private final JButton buttonG;
    private final JButton buttonH;
    private final JButton buttonI;

    private final JButton[] buttons; // deklarasi variabel buttons yang merupakan array dari JButton
    private boolean gameOver; // deklarasi variabel gameOver yang bertipe boolean

    // constructor HelloGridLayout
    public HelloGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ketika tombol close di klik, maka program akan berhenti

        gameOver = false; // set gameOver menjadi false

        // inisialisasi variabel buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");

        // inisialisasi variabel buttons
        buttons = new JButton[9];
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        // menambahkan action listener ke buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);

        this.setLayout(new GridLayout(3, 3)); // set layout JFrame menjadi GridLayout dengan 3 baris dan 3 kolom

        // menambahkan buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI ke JFrame
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);

        this.setSize(300, 300); // set ukuran JFrame menjadi 300 x 300
    }

    // method actionPerformed yang merupakan turunan dari interface ActionListener
    public void actionPerformed(ActionEvent e) {
        // jika gameOver bernilai false
        if (!gameOver){
            JButton button =  (JButton) e.getSource();
            // jika text dari button kosong
            if (button.getText().isEmpty()){
                button.setText("O"); // set text dari button menjadi "O"
                checkWinner(); // panggil method checkWinner
                // jika gameOver bernilai false
                if (!gameOver){
                    // looping untuk mencari button yang textnya kosong
                    for (JButton jButton : buttons) {
                        // jika text dari jButton kosong
                        if (jButton.getText().isEmpty()) {
                            jButton.setText("X"); // set text dari jButton menjadi "X"
                            break; // keluar dari looping
                        }
                    }
                    checkWinner(); // panggil method checkWinner
                }
            }
        }
    }

    // method checkWinner
    public void checkWinner() {

        String winner = ""; // deklarasi variabel winner yang bertipe String
        // jika text dari buttonA tidak kosong dan text dari buttonA sama dengan text dari buttonB dan text dari buttonA sama dengan text dari buttonC
        if (!buttonA.getText().isEmpty()
        && buttonA.getText().equals(buttonB.getText())
        && buttonA.getText().equals(buttonC.getText()))
        {// maka winner diisi dengan text dari buttonA
            winner = buttonA.getText();
            // set foreground dari buttonA, buttonB, dan buttonC menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            buttonC.setForeground(Color.RED);
        }
        // jika text dari buttonD tidak kosong dan text dari buttonD sama dengan text dari buttonE dan text dari buttonD sama dengan text dari buttonF
        else if (!buttonD.getText().isEmpty()
            && buttonD.getText().equals(buttonE.getText())
            && buttonD.getText().equals(buttonF.getText()))
        {// maka winner diisi dengan text dari buttonD
            winner = buttonD.getText();
            // set foreground dari buttonD, buttonE, dan buttonF menjadi warna merah
            buttonD.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
        }
        // jika text dari buttonG tidak kosong dan text dari buttonG sama dengan text dari buttonH dan text dari buttonG sama dengan text dari buttonI
        else if(!buttonG.getText().isEmpty()
            && buttonG.getText().equals(buttonH.getText())
            && buttonG.getText().equals(buttonI.getText()))
        {// maka winner diisi dengan text dari buttonG
            winner = buttonG.getText();
            // set foreground dari buttonG, buttonH, dan buttonI menjadi warna merah
            buttonG.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika text dari buttonA tidak kosong dan text dari buttonA sama dengan text dari buttonD dan text dari buttonA sama dengan text dari buttonG
        else if(!buttonA.getText().isEmpty()
            && buttonA.getText().equals(buttonD.getText())
            && buttonA.getText().equals(buttonG.getText()))
        {// maka winner diisi dengan text dari buttonA
            winner = buttonA.getText();
            // set foreground dari buttonA, buttonD, dan buttonG menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonD.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }
        // jika text dari buttonB tidak kosong dan text dari buttonB sama dengan text dari buttonE dan text dari buttonB sama dengan text dari buttonH
        else if(!buttonB.getText().isEmpty()
            && buttonB.getText().equals(buttonE.getText())
            && buttonB.getText().equals(buttonH.getText()))
        {// maka winner diisi dengan text dari buttonB
            winner = buttonB.getText();
            // set foreground dari buttonB, buttonE, dan buttonH menjadi warna merah
            buttonB.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
        }
        // Jiika text dari buttonC tidak kosong dan text dari buttonC sama dengan text dari buttonF dan text dari buttonC sama dengan text dari buttonI
        else if(!buttonC.getText().isEmpty()
            && buttonC.getText().equals(buttonF.getText())
            && buttonC.getText().equals(buttonI.getText()))
        {// maka winner diisi dengan text dari buttonC
            winner = buttonC.getText();
            // set foreground dari buttonC, buttonF, dan buttonI menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika text dari buttonA tidak kosong dan text dari buttonA sama dengan text dari buttonE dan text dari buttonA sama dengan text dari buttonI
        else if(!buttonA.getText().isEmpty()
            && buttonA.getText().equals(buttonE.getText())
            && buttonA.getText().equals(buttonI.getText()))
        {// maka winner diisi dengan text dari buttonA
            winner = buttonA.getText();
            // set foreground dari buttonA, buttonE, dan buttonI menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika text dari buttonC tidak kosong dan text dari buttonC sama dengan text dari buttonE dan text dari buttonC sama dengan text dari buttonG
        else if(!buttonC.getText().isEmpty()
            && buttonC.getText().equals(buttonE.getText())
            && buttonC.getText().equals(buttonG.getText()))
        {// maka winner diisi dengan text dari buttonC
            winner = buttonC.getText();
            // set foreground dari buttonC, buttonE, dan buttonG menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }
        gameOver = !winner.isEmpty(); // set gameOver menjadi true jika winner tidak kosong
    }

    // method main
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() { // membuat thread untuk menjalankan program
            public void run() {  // method run
                HelloGridLayout hello = new HelloGridLayout();
                hello.setVisible(true);
            }
        });
    }
}
