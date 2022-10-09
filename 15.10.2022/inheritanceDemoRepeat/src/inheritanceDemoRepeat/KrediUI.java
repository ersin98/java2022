package inheritanceDemoRepeat;

//UI = User interface. arka plandaki kodların arayüzde çağrılması
public class KrediUI {
//Button Textbox gibi şeylerin bağlanması burda olur
	public void krediHesapla(BaseKrediManager baseKrediManager) {
		// sadece bir opsiyon gönderirsen bir tek o çalışır
		// public void krediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		// ayrıca tüm kredileri yollayıp if else ile kullanmaya çalışmak da kötü bir
		// kodlamadı
		baseKrediManager.hesapla();
	}
}
