package action.page;

public class QuerySqlInputAction {
	
	public String message = null;
	
	public String getMessage(){
		return message;
	}
	
	public String execute(){
		message = "这是我的jsp";
		return "success";
	}

}
