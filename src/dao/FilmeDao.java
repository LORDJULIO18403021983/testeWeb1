package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Filme;

public class FilmeDao {
	private final Connection conn;

	public FilmeDao(Connection conn) {
		this.conn = conn;
	}

	// INSERIR
	public void inserir(Filme filme) throws SQLException {
		String sql = "insert into filme(nome, valor, disponivel, genero)values(?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, filme.getNome());
		pstm.setDouble(2, filme.getValor());
		pstm.setString(3, filme.getDisponivel());
		pstm.setString(4, filme.getGenero());

		pstm.execute();
	}
	
	// CONSULTAR
		public List<Filme> buscarTodosDao() throws SQLException {

			String sql = "select * from filme ";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet cursor = pstm.executeQuery();
			
			List<Filme> filmes = new ArrayList<Filme>();

			while (cursor.next()) {
				Filme filme = new Filme();
				filme.setNome(cursor.getString("nome"));
				filme.setValor(cursor.getDouble("valor"));
				//filme.setCidade(cursor.getString("cidade"));
				filmes.add(filme);
			}
			return filmes;
		}
}
