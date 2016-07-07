

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double lat = 40.496044, lon= -74.255735;
		
		String code2 = String.valueOf(encodeGeohash(lat, lon, 12));
		String code3 = SimpleGeohash.withCharacterPrecision(lat, lon, 12).toBase32();
		MyGeoHash mgh = new MyGeoHash();
		mgh.withCharacterPrecision(lat, lon, 12);
		String code4 = mgh.toBase32();
		
		System.out.println("The code :" + code3);
		System.out.println("The code :" + code4);
		System.out.println("The code :" + code2);
	}
	
	static long encodeGeohash(double lat, double lng, int bits) {
		  double minLat = -90,  maxLat = 90;
		  double minLng = -180, maxLng = 180;
		  long result = 0;
		  for (int i = 0; i < bits; ++i)
			if (i % 2 == 0) {                 // even bit: bisect longitude
			  double midpoint = (minLng + maxLng) / 2;
			  if (lng < midpoint) {
				result <<= 1;                 // push a zero bit
				maxLng = midpoint;            // shrink range downwards
			  } else {
				result = result << 1 | 1;     // push a one bit
				minLng = midpoint;            // shrink range upwards
			  }
			} else {                          // odd bit: bisect latitude
			  double midpoint = (minLat + maxLat) / 2;
			  if (lat < midpoint) {
				result <<= 1;                 // push a zero bit
				maxLat = midpoint;            // shrink range downwards
			  } else {
				result = result << 1 | 1;     // push a one bit
				minLat = midpoint;            // shrink range upwards
			  }
			}
		  return result;
		}

}
