import java.sql.SQLException;
import java.util.List;

public interface codiDao {
	List<codiset> read() throws SQLException;
	List<codiset> read(int id) throws SQLException;
}
