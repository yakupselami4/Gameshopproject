
public class CheckIfRealPerson implements PersonCheckService{
	@Override
	public boolean CheckRealPerson(final User user) {
		if(user.TCNo.length()==11) {
			return true;
			
		}else {
			return false;
			
		}
		
		
		
	}
	
	


}
