import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuestScreen  extends JFrame {

    private Library library;

GuestScreen(Library library){

    setTitle("Guest Screen");
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,600);

    JButton listBooks = new JButton("List Books");
    listBooks.setBounds(100, 151, 200, 50);
    add(listBooks);
    listBooks.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            java.util.List<Book> booksList = library.listAllBooks();

            StringBuilder allBooks = new StringBuilder();
            for(Book b : booksList){
                allBooks.append(b.toString()).append("<-------------------------------------------------->\n");
            }

            JTextArea textArea = new JTextArea(allBooks.toString());
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(300,350));

            JOptionPane.showMessageDialog(null,scrollPane,"All Books", JOptionPane.INFORMATION_MESSAGE);
        }
    });

    JButton borrowButton = new JButton("Borrow Book");
    borrowButton.setBounds(100,251,200,50);
    add(borrowButton);
    borrowButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });


 setVisible(true);
}

}
