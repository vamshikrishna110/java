package zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {

	public static void main(String[] args) {
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Australia/Darwin")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Cuiaba")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Canada/Yukon")));
		
		//System.out.println(ZoneId.getAvailableZoneIds());
		//America/Cuiaba, Europe/London, Canada/Yukon, Pacific/Galapagos
		

	}

}
