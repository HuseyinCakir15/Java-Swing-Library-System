import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonnelScreen extends JFrame {
    private Library library;

    public PersonnelScreen(Library library) {
        setTitle("Personnel Screen");
        setSize(400, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addBook = new JButton("Add Book");
        addBook.setBounds(100, 50, 200, 50);
        add(addBook);
        addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField titleF = new JTextField();
                JTextField authorF = new JTextField();
                JTextField pageCountF = new JTextField();

                Object[] message = {
                        "Book Title:", titleF,      // DOĞRU: Yazı ayrı, kutu ayrı (virgülle ayrıldı)
                        "Author Name:", authorF,
                        "Pages:", pageCountF
                };

                int option = JOptionPane.showConfirmDialog(null, message, "Add New Book", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    String title = titleF.getText();
                    String author = authorF.getText();
                    int pageCount = Integer.parseInt(pageCountF.getText());

                    Book newBook = new Book(title, author, pageCount);
                    library.addBook(newBook);
                }

            }
        });

        JButton listBooks = new JButton("List Books");
        listBooks.setBounds(100, 151, 200, 50);
        add(listBooks);
        listBooks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.List<Book> booksList = library.listAllBooks();

                StringBuilder allBooks = new StringBuilder();
                for (Book b : booksList) {
                    allBooks.append(b.toString()).append("<-------------------------------------------------->\n");
                }

                JTextArea textArea = new JTextArea(allBooks.toString());
                textArea.setEditable(false);

                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new java.awt.Dimension(300, 350));

                JOptionPane.showMessageDialog(null, scrollPane, "All Books", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton findBook = new JButton("Find Book");
        findBook.setBounds(100, 251, 200, 50);
        add(findBook);
        findBook.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog("Please enter book title");
                if (title != null && !title.isEmpty()) {
                    Book searchBook = library.findBook(title);

                    if (searchBook != null) {
                        if (!searchBook.isBorrowed()) {
                            JOptionPane.showMessageDialog(null, "Book is founded.\nAvailable");
                        } else {
                            JOptionPane.showMessageDialog(null, "Book is founded.\nBorrowed");
                        }


                    } else {
                        JOptionPane.showMessageDialog(null, "Book was not founded!!!");
                    }
                }
            }
        });

        setVisible(true);
    }


}
