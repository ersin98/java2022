package overriding;//

// Biz aksini belirtmedikçe classların operasyonları  overridable dır
//miras alan sınıf değiştirebilir
public class Main {

	public static void main(String[] args) {
		// OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		// System.out.println(ogretmenKrediManager.hesapla(1000));

		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(),
				new OgrenciKrediManager() };// hepsini kullanmak zorunda değildik
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
			System.out.println(krediManager.degismedenhesapla(1000));

		}

	}

}
