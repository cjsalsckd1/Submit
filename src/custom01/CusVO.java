package custom01;

public class CusVO {
	private String p_id;
	private String p_pw;
	private String c_name;
	private String c_email;
	private String c_tel;
	
	public String getId() {
		return p_id;
	}
	public void setId(String p_id) {
		this.p_id = p_id;
	}
	public String getPassword() {
		return p_pw;
	}
	public void setPassword(String p_pw) {
		this.p_pw = p_pw;
	}
	public String getName() {
		return c_name;
	}
	public void setName(String c_name) {
		this.c_name = c_name;
	}
	public String getEmail() {
		return c_email;
	}
	public void setEmail(String c_email) {
		this.c_email = c_email;
	}
	public String getTel() {
		return c_tel;
	}
	public void setTel(String c_tel) {
		this.c_tel = c_tel;
	}
}