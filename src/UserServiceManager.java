
public class UserServiceManager implements UserService{
	@Override
	public void AddUser(User user) {
		
		System.out.println("Kullan�c� sisteme kaydedildi: "+user.FirstName+" "+user.LastName);
		System.out.println("Kullan�c� ad�: "+user.Nickname);
	}
	@Override
	public void DeleteUser(User user) {
		
		System.out.println("Kullan�c� sistemden siliniyor: "+user.Nickname);
		user=null;
		System.out.println("Kullan�c� sistemden silindi.");
	}
	@Override
	public void UptadeUser(User user) {
		
		System.out.println("Kullan�c� g�ncellendi: "+user.Nickname);
	}
	@Override
	public void PrintUserProfile(User user) {
		System.out.println("Kullan�c� bilgileri: "+System.lineSeparator()
		+"Kullan�c�n�n ad�: "+user.FirstName+System.lineSeparator()+
		"Kullan�c�n�n soyad�: "+user.LastName+System.lineSeparator()+
		"Kullan�c�n�n Do�um Tarihi: "+user.DateOfBird+System.lineSeparator()+
		"Kullan�c�n�n T.C. Kimlik Numaras�: "+user.TCNo+System.lineSeparator()+
		"Kullan�c�n�n kullan�c� ad�: "+user.Nickname);
	}

}
