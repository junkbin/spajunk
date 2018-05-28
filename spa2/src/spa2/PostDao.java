package spa2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PostDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void readAllPost() {
		String sql = "SELECT * FROM POST WHERE ID=?";
		List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql,  1);
		
		System.out.println(list);
	}
	
	
	public void readAllPost1() {
		String sql = "SELECT * FROM POST";
		List<Post> list =  jdbcTemplate.query(sql,  new RowMapper<Post>() {

			@Override
			public Post mapRow(ResultSet arg0, int arg1) throws SQLException {
				
				Post post = new Post();
				post.setPost(arg0.getString("POST"));
				
				return post;
			}
			
		});
		
		System.out.println(list);
	}
	
	
}
