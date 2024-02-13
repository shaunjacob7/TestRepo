package expack;

import java.io.IOException;
import java.sql.SQLException;

public class TestThrows {
	public void m() throws IOException,SQLException{
		throw new IOException("device error");
	}
	public void n() throws IOException, SQLException {
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		TestThrows obj=new TestThrows();
		obj.p();
	}

}
