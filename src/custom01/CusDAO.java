package custom01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CusDAO {
	CusOpen dbopen = null;
	CusClose dbclose = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sql = null;

	public CusDAO() {
		dbopen = new CusOpen();
		dbclose = new CusClose();
	}

	public int insert(CusVO cusVO) {
		int count = 0;

		try {
			con = dbopen.getConnection();
			sql = new StringBuffer();
			sql.append("insert into custom_01(p_id, p_pw, c_name, c_email, c_tel)");
			sql.append("values(?, ?, ?, ?, ?)");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, cusVO.getId());
			pstmt.setString(2, cusVO.getPassword());
			pstmt.setString(3, cusVO.getName());
			pstmt.setString(4, cusVO.getEmail());
			pstmt.setString(5, cusVO.getTel());

			count = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbclose.close(con, pstmt);
		}
		return count;
	}

	public ArrayList<CusVO> list() {
		ArrayList<CusVO> list = new ArrayList<CusVO>();

		try {
			con = dbopen.getConnection();

			sql = new StringBuffer();
			sql.append("select p_id, p_pw, c_name, c_email, c_tel from custom_01 order by p_id");
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			

			while (rs.next() == true) {
				System.out.println("kkkkkkk");
				CusVO cusvo = new CusVO();
				cusvo.setId(rs.getString("p_id"));
				cusvo.setPassword(rs.getString("p_pw"));
				cusvo.setName(rs.getString("c_name"));
				cusvo.setEmail(rs.getString("c_email"));
				cusvo.setTel(rs.getString("c_tel"));

				System.out.println(rs.getString("p_id"));
				list.add(cusvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbclose.close(con, pstmt, rs);
		}
		return list;
	}
}
