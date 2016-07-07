
public class MyGeoHash {

	public static final int MAX_CHARACTER_LENGTH = 12;
	public static final int MAX_BIT_LENGTH = 64;
	public long bits = 0;
	public byte significantBits = 0;
	private static final char[] myBase32 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	
	public void withCharacterPrecision(double latitude, double longitude, int numberOfCharacters) {
		if (numberOfCharacters > MAX_CHARACTER_LENGTH) {
			throw new IllegalArgumentException("Geohash should only be " + MAX_CHARACTER_LENGTH + " characters in length");
		}
		
		boolean isEvenBit = true;
		double[] latitudeRange = { -90, 90 };
		double[] longitudeRange = { -180, 180 };
		int requiredPrecision = (numberOfCharacters * 5 <= 60) ? numberOfCharacters * 5 : 60;
		requiredPrecision = Math.min(requiredPrecision, MAX_BIT_LENGTH);

		while (significantBits < requiredPrecision) {
			if (isEvenBit) {
				//divideRangeEncode(longitude, longitudeRange);
				double middle = (longitudeRange[0] + longitudeRange[1]) / 2;
				if (longitude >= middle) {
					significantBits++;
					bits <<= 1;
					bits = bits | 0x1;
					longitudeRange[0] = middle;
				} else {
					significantBits++;
					bits <<= 1;
					longitudeRange[1] = middle;
				}
			} else {
				// divideRangeEncode(latitude, latitudeRange);
				double middle = (latitudeRange[0] + latitudeRange[1]) / 2;
				if (latitude >= middle) {
					significantBits++;
					bits <<= 1;
					bits = bits | 0x1;
					latitudeRange[0] = middle;
				} else {
					significantBits++;
					bits <<= 1;
					latitudeRange[1] = middle;
				}
			}
			isEvenBit = !isEvenBit;
		}

		bits <<= (MAX_BIT_LENGTH - requiredPrecision);
	}
	
	public String toBase32() {
		if (significantBits % 5 != 0) {
			throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
		}
		StringBuilder buf = new StringBuilder();

		long firstFiveBitsMask = 0xf800000000000000l;
		long bitsCopy = bits;
		int partialChunks = (int) Math.ceil(((double) significantBits / 5));

		for (int i = 0; i < partialChunks; i++) {
			int pointer = (int) ((bitsCopy & firstFiveBitsMask) >>> 59);
			buf.append(myBase32[pointer]);
			bitsCopy <<= 5;
		}
		return buf.toString();
	}
}
