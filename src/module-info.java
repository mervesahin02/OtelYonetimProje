module psodeneme {
	requires java.desktop;
	requires junit;
	requires java.sql;
	requires org.junit.jupiter.api;

	// Test paketini açarak JUnit'in erişmesini sağlıyoruz
	opens com.example.NesneProje.NesneProje to junit;
	
}