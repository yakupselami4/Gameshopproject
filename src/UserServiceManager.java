
public class UserServiceManager implements UserService{
	@Override
	public void AddUser(User user) {
		
		System.out.println("Kullanýcý sisteme kaydedildi: "+user.FirstName+" "+user.LastName);
		System.out.println("Kullanýcý adý: "+user.Nickname);
	}
	@Override
	public void DeleteUser(User user) {
		
		System.out.println("Kullanýcý sistemden siliniyor: "+user.Nickname);
		user=null;
		System.out.println("Kullanýcý sistemden silindi.");
	}
	@Override
	public void UptadeUser(User user) {
		
		System.out.println("Kullanýcý güncellendi: "+user.Nickname);
	}
	@Override
	public void PrintUserProfile(User user) {
		System.out.println("Kullanýcý bilgileri: "+System.lineSeparator()
		+"Kullanýcýnýn adý: "+user.FirstName+System.lineSeparator()+
		"Kullanýcýnýn soyadý: "+user.LastName+System.lineSeparator()+
		"Kullanýcýnýn Doðum Tarihi: "+user.DateOfBird+System.lineSeparator()+
		"Kullanýcýnýn T.C. Kimlik Numarasý: "+user.TCNo+System.lineSeparator()+
		"Kullanýcýnýn kullanýcý adý: "+user.Nickname);
	}

}
