package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

	// public final double degismedenhesapla(double tutar) {
	// return tutar * 3;
	// }
	// bunu yazamayız çünkü base den final diye kısıtladık
}
