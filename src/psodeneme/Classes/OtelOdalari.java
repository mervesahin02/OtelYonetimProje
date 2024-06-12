package psodeneme.Classes;

public class OtelOdalari {
      public int kisiSyisi;
      private int oda_id;
      public String tur;
      
	public OtelOdalari() {
	}
	
	public OtelOdalari(int kisiSyisi, int oda_id, String tur) {
		this.kisiSyisi = kisiSyisi;
		this.oda_id = oda_id;
		this.tur = tur;
	}
	
	public int getOda_id() {
		return oda_id;
	}
	public void setOda_id(int oda_id) {
		this.oda_id = oda_id;
	}
}
