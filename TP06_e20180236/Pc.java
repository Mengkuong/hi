public class Pc {

	private int id;
	private String model;
	private int status;

	public Pc() {
		this(0,"",0);
	}
	
	public Pc(int _id, String _model, int _status) {
		setId(_id);
		setModel(_model);
		setStatus(_status);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
