/*
Consultas: 
1-selecionar todos os autores
2-selecionar autor específico e listar os livros deste autor com título, ISBN, ordenando pelo nome e pelo sobrenome
3-selecionar título específico e listar os seus autores, ordenando pelo sobrenome e pelo nome
4-outras consultas
SELECT Titles.Title, Titles.ISBN FROM Titles INNER JOIN AuthorISBN ON Titles.ISBN = AuthorISBN.ISBN INNER JOIN Authors ON Authors.AuthorID = AuthorISBN.AuthorID WHERE Authors.LastName = 'Deitel'
Necessário estudar: 
-JComboBox
-JTable (componente GUI que pode ser vinculado ao BD para e exibir resultados), TableModel
*/
package c24.q1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BooksQueries
{
	//Connection data 
	private final String DB_URL = "jdbc:postgresql://localhost/books";
	private final String USER = "postgres";
	private final String PASSWORD = "12345678";

	//Connection and queries variables
	private Connection conn;
	private PreparedStatement selectAllAuthors;
	private PreparedStatement selectAuthor; //Select a specific author and his books
	private PreparedStatement selectBook; //Select a specific book and its authors
	private PreparedStatement selectAllBooks;
	private PreparedStatement insertAuthor;
	private PreparedStatement insertBook;
	private PreparedStatement dropAuthor;
	private PreparedStatement dropBook;

	//Construtor com instanciamento das preparedStatements
	public BooksQueries()
	{
		try
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

			selectAllAuthors = conn.prepareStatement("SELECT * FROM Authors");
			
			selectAuthor = conn.prepareStatement("SELECT Authors.AuthorID, FirstName, LastName, Title FROM Authors" + 
				"INNER JOIN AuthorISBN ON Authors.AuthorID = AuthorISBN.AuthorID" + 
				"INNER JOIN Titles ON AuthorISBN.ISBN = Titles.ISBN" +
				"WHERE lastname = ? AND firstname = ? " +
				"ORDER BY Authors.FirstName, Authors.LastName");

			selectBook = conn.prepareStatement("SELECT Title, LastName, FirstName, FROM Titles INNER JOIN AuthorISBN " +
				"ON Titles.ISBN = AuthorISBN.ISBN INNER JOIN Authors ON AuthorISBN.AuthorID = Authors.AuthorID " +
				"WHERE Title = ? ORDER BY LastName, FirstName");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}

	//Seleção de todos os autores

	//Consultas

}