package p11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class property {

	public static String nA1 = "A1";
	public static String nA2 = "A2";
	public static String nA3 = "A3";
	public static String nA4 = "A4";
	public static String nA5 = "A5";
	public static String nA6 = "A6";
	public static String nA7 = "A7";
	public static String nA8 = "A8";
	public static String nA9 = "A9";
	public static String nA10 = "A10";
	public static String nA11 = "A11";
	public static String nA12 = "A12";
	public static String nA13 = "A13";
	public static String nA14 = "A14";
	public static String nA15 = "A15";
	public static String nA16 = "A16";
	public static String nA17 = "A17";
	public static String nA18 = "A18";

	public static String nB1 = "B1";
	public static String nB2 = "B2";
	public static String nB3 = "B3";
	public static String nB4 = "B4";
	public static String nB5 = "B5";
	public static String nB6 = "B6";
	public static String nB7 = "B7";
	public static String nB8 = "B8";
	public static String nB9 = "B9";
	public static String nB10 = "B10";
	public static String nB11 = "B11";
	public static String nB12 = "B12";
	public static String nB13 = "B13";
	public static String nB14 = "B14";
	public static String nB15 = "B15";
	public static String nB16 = "B16";
	public static String nB17 = "B17";
	public static String nB18 = "B18";

	public static String nC1 = "C1";
	public static String nC2 = "C2";
	public static String nC3 = "C3";
	public static String nC4 = "C4";
	public static String nC5 = "C5";
	public static String nC6 = "C6";
	public static String nC7 = "C7";
	public static String nC8 = "C8";
	public static String nC9 = "C9";
	public static String nC10 = "C10";
	public static String nC11 = "C11";
	public static String nC12 = "C12";
	public static String nC13 = "C13";
	public static String nC14 = "C14";
	public static String nC15 = "C15";
	public static String nC16 = "C16";
	public static String nC17 = "C17";
	public static String nC18 = "C18";

	public static String nD1 = "D1";
	public static String nD2 = "D2";
	public static String nD3 = "D3";
	public static String nD4 = "D4";
	public static String nD5 = "D5";
	public static String nD6 = "D6";
	public static String nD7 = "D7";
	public static String nD8 = "D8";
	public static String nD9 = "D9";
	public static String nD10 = "D10";
	public static String nD11 = "D11";
	public static String nD12 = "D12";
	public static String nD13 = "D13";
	public static String nD14 = "D14";
	public static String nD15 = "D15";
	public static String nD16 = "D16";
	public static String nD17 = "D17";
	public static String nD18 = "D18";

	public static String A1 = "+";
	public static String A2 = "+";
	public static String A3 = "+";
	public static String A4 = "+";
	public static String A5 = "+";
	public static String A6 = "+";
	public static String A7 = "+";
	public static String A8 = "+";
	public static String A9 = "+";
	public static String A10 = "+";
	public static String A11 = "+";
	public static String A12 = "+";
	public static String A13 = "+";
	public static String A14 = "+";
	public static String A15 = "+";
	public static String A16 = "+";
	public static String A17 = "+";
	public static String A18 = "+";

	public static String[] A = { A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18 };
	public static int aL = A.length;
	public static int randA = (int) (Math.random() * aL);
	public static String aPhrase = A[randA];

	public static String B1 = "+";
	public static String B2 = "+";
	public static String B3 = "+";
	public static String B4 = "+";
	public static String B5 = "+";
	public static String B6 = "+";
	public static String B7 = "+";
	public static String B8 = "+";
	public static String B9 = "+";
	public static String B10 = "+";
	public static String B11 = "+";
	public static String B12 = "+";
	public static String B13 = "+";
	public static String B14 = "+";
	public static String B15 = "+";
	public static String B16 = "+";
	public static String B17 = "+";
	public static String B18 = "+";

	public static String[] B = { B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18 };
	public static int bL = B.length;
	public static int randB = (int) (Math.random() * bL);
	public static String bPhrase = B[randB];

	public static String C1 = "+";
	public static String C2 = "+";
	public static String C3 = "+";
	public static String C4 = "+";
	public static String C5 = "+";
	public static String C6 = "+";
	public static String C7 = "+";
	public static String C8 = "+";
	public static String C9 = "+";
	public static String C10 = "+";
	public static String C11 = "+";
	public static String C12 = "+";
	public static String C13 = "+";
	public static String C14 = "+";
	public static String C15 = "+";
	public static String C16 = "+";
	public static String C17 = "+";
	public static String C18 = "+";

	public static String[] C = { C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18 };
	public static int cL = C.length;
	public static int randC = (int) (Math.random() * cL);
	public static String cPhrase = C[randC];

	public static String D1 = "+";
	public static String D2 = "+";
	public static String D3 = "+";
	public static String D4 = "+";
	public static String D5 = "+";
	public static String D6 = "+";
	public static String D7 = "+";
	public static String D8 = "+";
	public static String D9 = "+";
	public static String D10 = "+";
	public static String D11 = "+";
	public static String D12 = "+";
	public static String D13 = "+";
	public static String D14 = "+";
	public static String D15 = "+";
	public static String D16 = "+";
	public static String D17 = "+";
	public static String D18 = "+";

	public static String[] D = { D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13, D14, D15, D16, D17, D18 };
	public static int dL = D.length;
	public static int randD = (int) (Math.random() * dL);
	public static String dPhrase = D[randD];

	public static boolean isOwnedA1 = false;
	public static boolean isOwnedA2 = false;
	public static boolean isOwnedA3 = false;
	public static boolean isOwnedA4 = false;
	public static boolean isOwnedA5 = false;
	public static boolean isOwnedA6 = false;
	public static boolean isOwnedA7 = false;
	public static boolean isOwnedA8 = false;
	public static boolean isOwnedA9 = false;
	public static boolean isOwnedA10 = false;
	public static boolean isOwnedA11 = false;
	public static boolean isOwnedA12 = false;
	public static boolean isOwnedA13 = false;
	public static boolean isOwnedA14 = false;
	public static boolean isOwnedA15 = false;
	public static boolean isOwnedA16 = false;
	public static boolean isOwnedA17 = false;
	public static boolean isOwnedA18 = false;

	public static boolean isOwnedB1 = false;
	public static boolean isOwnedB2 = false;
	public static boolean isOwnedB3 = false;
	public static boolean isOwnedB4 = false;
	public static boolean isOwnedB5 = false;
	public static boolean isOwnedB6 = false;
	public static boolean isOwnedB7 = false;
	public static boolean isOwnedB8 = false;
	public static boolean isOwnedB9 = false;
	public static boolean isOwnedB10 = false;
	public static boolean isOwnedB11 = false;
	public static boolean isOwnedB12 = false;
	public static boolean isOwnedB13 = false;
	public static boolean isOwnedB14 = false;
	public static boolean isOwnedB15 = false;
	public static boolean isOwnedB16 = false;
	public static boolean isOwnedB17 = false;
	public static boolean isOwnedB18 = false;

	public static boolean isOwnedC1 = false;
	public static boolean isOwnedC2 = false;
	public static boolean isOwnedC3 = false;
	public static boolean isOwnedC4 = false;
	public static boolean isOwnedC5 = false;
	public static boolean isOwnedC6 = false;
	public static boolean isOwnedC7 = false;
	public static boolean isOwnedC8 = false;
	public static boolean isOwnedC9 = false;
	public static boolean isOwnedC10 = false;
	public static boolean isOwnedC11 = false;
	public static boolean isOwnedC12 = false;
	public static boolean isOwnedC13 = false;
	public static boolean isOwnedC14 = false;
	public static boolean isOwnedC15 = false;
	public static boolean isOwnedC16 = false;
	public static boolean isOwnedC17 = false;
	public static boolean isOwnedC18 = false;

	public static boolean isOwnedD1 = false;
	public static boolean isOwnedD2 = false;
	public static boolean isOwnedD3 = false;
	public static boolean isOwnedD4 = false;
	public static boolean isOwnedD5 = false;
	public static boolean isOwnedD6 = false;
	public static boolean isOwnedD7 = false;
	public static boolean isOwnedD8 = false;
	public static boolean isOwnedD9 = false;
	public static boolean isOwnedD10 = false;
	public static boolean isOwnedD11 = false;
	public static boolean isOwnedD12 = false;
	public static boolean isOwnedD13 = false;
	public static boolean isOwnedD14 = false;
	public static boolean isOwnedD15 = false;
	public static boolean isOwnedD16 = false;
	public static boolean isOwnedD17 = false;
	public static boolean isOwnedD18 = false;

	public static boolean isHouseA1 = false;
	public static boolean isHouseA2 = false;
	public static boolean isHouseA3 = false;
	public static boolean isHouseA4 = false;
	public static boolean isHouseA5 = false;
	public static boolean isHouseA6 = false;
	public static boolean isHouseA7 = false;
	public static boolean isHouseA8 = false;
	public static boolean isHouseA9 = false;
	public static boolean isHouseA10 = false;
	public static boolean isHouseA11 = false;
	public static boolean isHouseA12 = false;
	public static boolean isHouseA13 = false;
	public static boolean isHouseA14 = false;
	public static boolean isHouseA15 = false;
	public static boolean isHouseA16 = false;
	public static boolean isHouseA17 = false;
	public static boolean isHouseA18 = false;

	public static boolean isHouseB1 = false;
	public static boolean isHouseB2 = false;
	public static boolean isHouseB3 = false;
	public static boolean isHouseB4 = false;
	public static boolean isHouseB5 = false;
	public static boolean isHouseB6 = false;
	public static boolean isHouseB7 = false;
	public static boolean isHouseB8 = false;
	public static boolean isHouseB9 = false;
	public static boolean isHouseB10 = false;
	public static boolean isHouseB11 = false;
	public static boolean isHouseB12 = false;
	public static boolean isHouseB13 = false;
	public static boolean isHouseB14 = false;
	public static boolean isHouseB15 = false;
	public static boolean isHouseB16 = false;
	public static boolean isHouseB17 = false;
	public static boolean isHouseB18 = false;

	public static boolean isHouseC1 = false;
	public static boolean isHouseC2 = false;
	public static boolean isHouseC3 = false;
	public static boolean isHouseC4 = false;
	public static boolean isHouseC5 = false;
	public static boolean isHouseC6 = false;
	public static boolean isHouseC7 = false;
	public static boolean isHouseC8 = false;
	public static boolean isHouseC9 = false;
	public static boolean isHouseC10 = false;
	public static boolean isHouseC11 = false;
	public static boolean isHouseC12 = false;
	public static boolean isHouseC13 = false;
	public static boolean isHouseC14 = false;
	public static boolean isHouseC15 = false;
	public static boolean isHouseC16 = false;
	public static boolean isHouseC17 = false;
	public static boolean isHouseC18 = false;

	public static boolean isHouseD1 = false;
	public static boolean isHouseD2 = false;
	public static boolean isHouseD3 = false;
	public static boolean isHouseD4 = false;
	public static boolean isHouseD5 = false;
	public static boolean isHouseD6 = false;
	public static boolean isHouseD7 = false;
	public static boolean isHouseD8 = false;
	public static boolean isHouseD9 = false;
	public static boolean isHouseD10 = false;
	public static boolean isHouseD11 = false;
	public static boolean isHouseD12 = false;
	public static boolean isHouseD13 = false;
	public static boolean isHouseD14 = false;
	public static boolean isHouseD15 = false;
	public static boolean isHouseD16 = false;
	public static boolean isHouseD17 = false;
	public static boolean isHouseD18 = false;

	public static boolean isMarketA1 = false;
	public static boolean isMarketA2 = false;
	public static boolean isMarketA3 = false;
	public static boolean isMarketA4 = false;
	public static boolean isMarketA5 = false;
	public static boolean isMarketA6 = false;
	public static boolean isMarketA7 = false;
	public static boolean isMarketA8 = false;
	public static boolean isMarketA9 = false;
	public static boolean isMarketA10 = false;
	public static boolean isMarketA11 = false;
	public static boolean isMarketA12 = false;
	public static boolean isMarketA13 = false;
	public static boolean isMarketA14 = false;
	public static boolean isMarketA15 = false;
	public static boolean isMarketA16 = false;
	public static boolean isMarketA17 = false;
	public static boolean isMarketA18 = false;

	public static boolean isMarketB1 = false;
	public static boolean isMarketB2 = false;
	public static boolean isMarketB3 = false;
	public static boolean isMarketB4 = false;
	public static boolean isMarketB5 = false;
	public static boolean isMarketB6 = false;
	public static boolean isMarketB7 = false;
	public static boolean isMarketB8 = false;
	public static boolean isMarketB9 = false;
	public static boolean isMarketB10 = false;
	public static boolean isMarketB11 = false;
	public static boolean isMarketB12 = false;
	public static boolean isMarketB13 = false;
	public static boolean isMarketB14 = false;
	public static boolean isMarketB15 = false;
	public static boolean isMarketB16 = false;
	public static boolean isMarketB17 = false;
	public static boolean isMarketB18 = false;

	public static boolean isMarketC1 = false;
	public static boolean isMarketC2 = false;
	public static boolean isMarketC3 = false;
	public static boolean isMarketC4 = false;
	public static boolean isMarketC5 = false;
	public static boolean isMarketC6 = false;
	public static boolean isMarketC7 = false;
	public static boolean isMarketC8 = false;
	public static boolean isMarketC9 = false;
	public static boolean isMarketC10 = false;
	public static boolean isMarketC11 = false;
	public static boolean isMarketC12 = false;
	public static boolean isMarketC13 = false;
	public static boolean isMarketC14 = false;
	public static boolean isMarketC15 = false;
	public static boolean isMarketC16 = false;
	public static boolean isMarketC17 = false;
	public static boolean isMarketC18 = false;

	public static boolean isMarketD1 = false;
	public static boolean isMarketD2 = false;
	public static boolean isMarketD3 = false;
	public static boolean isMarketD4 = false;
	public static boolean isMarketD5 = false;
	public static boolean isMarketD6 = false;
	public static boolean isMarketD7 = false;
	public static boolean isMarketD8 = false;
	public static boolean isMarketD9 = false;
	public static boolean isMarketD10 = false;
	public static boolean isMarketD11 = false;
	public static boolean isMarketD12 = false;
	public static boolean isMarketD13 = false;
	public static boolean isMarketD14 = false;
	public static boolean isMarketD15 = false;
	public static boolean isMarketD16 = false;
	public static boolean isMarketD17 = false;
	public static boolean isMarketD18 = false;

	public static boolean isSaloonA1 = false;
	public static boolean isSaloonA2 = false;
	public static boolean isSaloonA3 = false;
	public static boolean isSaloonA4 = false;
	public static boolean isSaloonA5 = false;
	public static boolean isSaloonA6 = false;
	public static boolean isSaloonA7 = false;
	public static boolean isSaloonA8 = false;
	public static boolean isSaloonA9 = false;
	public static boolean isSaloonA10 = false;
	public static boolean isSaloonA11 = false;
	public static boolean isSaloonA12 = false;
	public static boolean isSaloonA13 = false;
	public static boolean isSaloonA14 = false;
	public static boolean isSaloonA15 = false;
	public static boolean isSaloonA16 = false;
	public static boolean isSaloonA17 = false;
	public static boolean isSaloonA18 = false;

	public static boolean isSaloonB1 = false;
	public static boolean isSaloonB2 = false;
	public static boolean isSaloonB3 = false;
	public static boolean isSaloonB4 = false;
	public static boolean isSaloonB5 = false;
	public static boolean isSaloonB6 = false;
	public static boolean isSaloonB7 = false;
	public static boolean isSaloonB8 = false;
	public static boolean isSaloonB9 = false;
	public static boolean isSaloonB10 = false;
	public static boolean isSaloonB11 = false;
	public static boolean isSaloonB12 = false;
	public static boolean isSaloonB13 = false;
	public static boolean isSaloonB14 = false;
	public static boolean isSaloonB15 = false;
	public static boolean isSaloonB16 = false;
	public static boolean isSaloonB17 = false;
	public static boolean isSaloonB18 = false;

	public static boolean isSaloonC1 = false;
	public static boolean isSaloonC2 = false;
	public static boolean isSaloonC3 = false;
	public static boolean isSaloonC4 = false;
	public static boolean isSaloonC5 = false;
	public static boolean isSaloonC6 = false;
	public static boolean isSaloonC7 = false;
	public static boolean isSaloonC8 = false;
	public static boolean isSaloonC9 = false;
	public static boolean isSaloonC10 = false;
	public static boolean isSaloonC11 = false;
	public static boolean isSaloonC12 = false;
	public static boolean isSaloonC13 = false;
	public static boolean isSaloonC14 = false;
	public static boolean isSaloonC15 = false;
	public static boolean isSaloonC16 = false;
	public static boolean isSaloonC17 = false;
	public static boolean isSaloonC18 = false;

	public static boolean isSaloonD1 = false;
	public static boolean isSaloonD2 = false;
	public static boolean isSaloonD3 = false;
	public static boolean isSaloonD4 = false;
	public static boolean isSaloonD5 = false;
	public static boolean isSaloonD6 = false;
	public static boolean isSaloonD7 = false;
	public static boolean isSaloonD8 = false;
	public static boolean isSaloonD9 = false;
	public static boolean isSaloonD10 = false;
	public static boolean isSaloonD11 = false;
	public static boolean isSaloonD12 = false;
	public static boolean isSaloonD13 = false;
	public static boolean isSaloonD14 = false;
	public static boolean isSaloonD15 = false;
	public static boolean isSaloonD16 = false;
	public static boolean isSaloonD17 = false;
	public static boolean isSaloonD18 = false;

	public static boolean isOilA1 = false;
	public static boolean isOilA2 = false;
	public static boolean isOilA3 = false;
	public static boolean isOilA4 = false;
	public static boolean isOilA5 = false;
	public static boolean isOilA6 = false;
	public static boolean isOilA7 = false;
	public static boolean isOilA8 = false;
	public static boolean isOilA9 = false;
	public static boolean isOilA10 = false;
	public static boolean isOilA11 = false;
	public static boolean isOilA12 = false;
	public static boolean isOilA13 = false;
	public static boolean isOilA14 = false;
	public static boolean isOilA15 = false;
	public static boolean isOilA16 = false;
	public static boolean isOilA17 = false;
	public static boolean isOilA18 = false;

	public static boolean isOilB1 = false;
	public static boolean isOilB2 = false;
	public static boolean isOilB3 = false;
	public static boolean isOilB4 = false;
	public static boolean isOilB5 = false;
	public static boolean isOilB6 = false;
	public static boolean isOilB7 = false;
	public static boolean isOilB8 = false;
	public static boolean isOilB9 = false;
	public static boolean isOilB10 = false;
	public static boolean isOilB11 = false;
	public static boolean isOilB12 = false;
	public static boolean isOilB13 = false;
	public static boolean isOilB14 = false;
	public static boolean isOilB15 = false;
	public static boolean isOilB16 = false;
	public static boolean isOilB17 = false;
	public static boolean isOilB18 = false;

	public static boolean isOilC1 = false;
	public static boolean isOilC2 = false;
	public static boolean isOilC3 = false;
	public static boolean isOilC4 = false;
	public static boolean isOilC5 = false;
	public static boolean isOilC6 = false;
	public static boolean isOilC7 = false;
	public static boolean isOilC8 = false;
	public static boolean isOilC9 = false;
	public static boolean isOilC10 = false;
	public static boolean isOilC11 = false;
	public static boolean isOilC12 = false;
	public static boolean isOilC13 = false;
	public static boolean isOilC14 = false;
	public static boolean isOilC15 = false;
	public static boolean isOilC16 = false;
	public static boolean isOilC17 = false;
	public static boolean isOilC18 = false;

	public static boolean isOilD1 = false;
	public static boolean isOilD2 = false;
	public static boolean isOilD3 = false;
	public static boolean isOilD4 = false;
	public static boolean isOilD5 = false;
	public static boolean isOilD6 = false;
	public static boolean isOilD7 = false;
	public static boolean isOilD8 = false;
	public static boolean isOilD9 = false;
	public static boolean isOilD10 = false;
	public static boolean isOilD11 = false;
	public static boolean isOilD12 = false;
	public static boolean isOilD13 = false;
	public static boolean isOilD14 = false;
	public static boolean isOilD15 = false;
	public static boolean isOilD16 = false;
	public static boolean isOilD17 = false;
	public static boolean isOilD18 = false;

	public static boolean isGoldA1 = false;
	public static boolean isGoldA2 = false;
	public static boolean isGoldA3 = false;
	public static boolean isGoldA4 = false;
	public static boolean isGoldA5 = false;
	public static boolean isGoldA6 = false;
	public static boolean isGoldA7 = false;
	public static boolean isGoldA8 = false;
	public static boolean isGoldA9 = false;
	public static boolean isGoldA10 = false;
	public static boolean isGoldA11 = false;
	public static boolean isGoldA12 = false;
	public static boolean isGoldA13 = false;
	public static boolean isGoldA14 = false;
	public static boolean isGoldA15 = false;
	public static boolean isGoldA16 = false;
	public static boolean isGoldA17 = false;
	public static boolean isGoldA18 = false;

	public static boolean isGoldB1 = false;
	public static boolean isGoldB2 = false;
	public static boolean isGoldB3 = false;
	public static boolean isGoldB4 = false;
	public static boolean isGoldB5 = false;
	public static boolean isGoldB6 = false;
	public static boolean isGoldB7 = false;
	public static boolean isGoldB8 = false;
	public static boolean isGoldB9 = false;
	public static boolean isGoldB10 = false;
	public static boolean isGoldB11 = false;
	public static boolean isGoldB12 = false;
	public static boolean isGoldB13 = false;
	public static boolean isGoldB14 = false;
	public static boolean isGoldB15 = false;
	public static boolean isGoldB16 = false;
	public static boolean isGoldB17 = false;
	public static boolean isGoldB18 = false;

	public static boolean isGoldC1 = false;
	public static boolean isGoldC2 = false;
	public static boolean isGoldC3 = false;
	public static boolean isGoldC4 = false;
	public static boolean isGoldC5 = false;
	public static boolean isGoldC6 = false;
	public static boolean isGoldC7 = false;
	public static boolean isGoldC8 = false;
	public static boolean isGoldC9 = false;
	public static boolean isGoldC10 = false;
	public static boolean isGoldC11 = false;
	public static boolean isGoldC12 = false;
	public static boolean isGoldC13 = false;
	public static boolean isGoldC14 = false;
	public static boolean isGoldC15 = false;
	public static boolean isGoldC16 = false;
	public static boolean isGoldC17 = false;
	public static boolean isGoldC18 = false;

	public static boolean isGoldD1 = false;
	public static boolean isGoldD2 = false;
	public static boolean isGoldD3 = false;
	public static boolean isGoldD4 = false;
	public static boolean isGoldD5 = false;
	public static boolean isGoldD6 = false;
	public static boolean isGoldD7 = false;
	public static boolean isGoldD8 = false;
	public static boolean isGoldD9 = false;
	public static boolean isGoldD10 = false;
	public static boolean isGoldD11 = false;
	public static boolean isGoldD12 = false;
	public static boolean isGoldD13 = false;
	public static boolean isGoldD14 = false;
	public static boolean isGoldD15 = false;
	public static boolean isGoldD16 = false;
	public static boolean isGoldD17 = false;
	public static boolean isGoldD18 = false;

	public static boolean isGExtractorA1 = false;
	public static boolean isGExtractorA2 = false;
	public static boolean isGExtractorA3 = false;
	public static boolean isGExtractorA4 = false;
	public static boolean isGExtractorA5 = false;
	public static boolean isGExtractorA6 = false;
	public static boolean isGExtractorA7 = false;
	public static boolean isGExtractorA8 = false;
	public static boolean isGExtractorA9 = false;
	public static boolean isGExtractorA10 = false;
	public static boolean isGExtractorA11 = false;
	public static boolean isGExtractorA12 = false;
	public static boolean isGExtractorA13 = false;
	public static boolean isGExtractorA14 = false;
	public static boolean isGExtractorA15 = false;
	public static boolean isGExtractorA16 = false;
	public static boolean isGExtractorA17 = false;
	public static boolean isGExtractorA18 = false;

	public static boolean isGExtractorB1 = false;
	public static boolean isGExtractorB2 = false;
	public static boolean isGExtractorB3 = false;
	public static boolean isGExtractorB4 = false;
	public static boolean isGExtractorB5 = false;
	public static boolean isGExtractorB6 = false;
	public static boolean isGExtractorB7 = false;
	public static boolean isGExtractorB8 = false;
	public static boolean isGExtractorB9 = false;
	public static boolean isGExtractorB10 = false;
	public static boolean isGExtractorB11 = false;
	public static boolean isGExtractorB12 = false;
	public static boolean isGExtractorB13 = false;
	public static boolean isGExtractorB14 = false;
	public static boolean isGExtractorB15 = false;
	public static boolean isGExtractorB16 = false;
	public static boolean isGExtractorB17 = false;
	public static boolean isGExtractorB18 = false;

	public static boolean isGExtractorC1 = false;
	public static boolean isGExtractorC2 = false;
	public static boolean isGExtractorC3 = false;
	public static boolean isGExtractorC4 = false;
	public static boolean isGExtractorC5 = false;
	public static boolean isGExtractorC6 = false;
	public static boolean isGExtractorC7 = false;
	public static boolean isGExtractorC8 = false;
	public static boolean isGExtractorC9 = false;
	public static boolean isGExtractorC10 = false;
	public static boolean isGExtractorC11 = false;
	public static boolean isGExtractorC12 = false;
	public static boolean isGExtractorC13 = false;
	public static boolean isGExtractorC14 = false;
	public static boolean isGExtractorC15 = false;
	public static boolean isGExtractorC16 = false;
	public static boolean isGExtractorC17 = false;
	public static boolean isGExtractorC18 = false;

	public static boolean isGExtractorD1 = false;
	public static boolean isGExtractorD2 = false;
	public static boolean isGExtractorD3 = false;
	public static boolean isGExtractorD4 = false;
	public static boolean isGExtractorD5 = false;
	public static boolean isGExtractorD6 = false;
	public static boolean isGExtractorD7 = false;
	public static boolean isGExtractorD8 = false;
	public static boolean isGExtractorD9 = false;
	public static boolean isGExtractorD10 = false;
	public static boolean isGExtractorD11 = false;
	public static boolean isGExtractorD12 = false;
	public static boolean isGExtractorD13 = false;
	public static boolean isGExtractorD14 = false;
	public static boolean isGExtractorD15 = false;
	public static boolean isGExtractorD16 = false;
	public static boolean isGExtractorD17 = false;
	public static boolean isGExtractorD18 = false;

	public static boolean isOExtractorA1 = false;
	public static boolean isOExtractorA2 = false;
	public static boolean isOExtractorA3 = false;
	public static boolean isOExtractorA4 = false;
	public static boolean isOExtractorA5 = false;
	public static boolean isOExtractorA6 = false;
	public static boolean isOExtractorA7 = false;
	public static boolean isOExtractorA8 = false;
	public static boolean isOExtractorA9 = false;
	public static boolean isOExtractorA10 = false;
	public static boolean isOExtractorA11 = false;
	public static boolean isOExtractorA12 = false;
	public static boolean isOExtractorA13 = false;
	public static boolean isOExtractorA14 = false;
	public static boolean isOExtractorA15 = false;
	public static boolean isOExtractorA16 = false;
	public static boolean isOExtractorA17 = false;
	public static boolean isOExtractorA18 = false;

	public static boolean isOExtractorB1 = false;
	public static boolean isOExtractorB2 = false;
	public static boolean isOExtractorB3 = false;
	public static boolean isOExtractorB4 = false;
	public static boolean isOExtractorB5 = false;
	public static boolean isOExtractorB6 = false;
	public static boolean isOExtractorB7 = false;
	public static boolean isOExtractorB8 = false;
	public static boolean isOExtractorB9 = false;
	public static boolean isOExtractorB10 = false;
	public static boolean isOExtractorB11 = false;
	public static boolean isOExtractorB12 = false;
	public static boolean isOExtractorB13 = false;
	public static boolean isOExtractorB14 = false;
	public static boolean isOExtractorB15 = false;
	public static boolean isOExtractorB16 = false;
	public static boolean isOExtractorB17 = false;
	public static boolean isOExtractorB18 = false;

	public static boolean isOExtractorC1 = false;
	public static boolean isOExtractorC2 = false;
	public static boolean isOExtractorC3 = false;
	public static boolean isOExtractorC4 = false;
	public static boolean isOExtractorC5 = false;
	public static boolean isOExtractorC6 = false;
	public static boolean isOExtractorC7 = false;
	public static boolean isOExtractorC8 = false;
	public static boolean isOExtractorC9 = false;
	public static boolean isOExtractorC10 = false;
	public static boolean isOExtractorC11 = false;
	public static boolean isOExtractorC12 = false;
	public static boolean isOExtractorC13 = false;
	public static boolean isOExtractorC14 = false;
	public static boolean isOExtractorC15 = false;
	public static boolean isOExtractorC16 = false;
	public static boolean isOExtractorC17 = false;
	public static boolean isOExtractorC18 = false;

	public static boolean isOExtractorD1 = false;
	public static boolean isOExtractorD2 = false;
	public static boolean isOExtractorD3 = false;
	public static boolean isOExtractorD4 = false;
	public static boolean isOExtractorD5 = false;
	public static boolean isOExtractorD6 = false;
	public static boolean isOExtractorD7 = false;
	public static boolean isOExtractorD8 = false;
	public static boolean isOExtractorD9 = false;
	public static boolean isOExtractorD10 = false;
	public static boolean isOExtractorD11 = false;
	public static boolean isOExtractorD12 = false;
	public static boolean isOExtractorD13 = false;
	public static boolean isOExtractorD14 = false;
	public static boolean isOExtractorD15 = false;
	public static boolean isOExtractorD16 = false;
	public static boolean isOExtractorD17 = false;
	public static boolean isOExtractorD18 = false;

	public static int houseCount = 1;
	public static int saloonCount = 0;
	public static int marketCount = 0;
	public static int goldECount = 0;
	public static int oilECount = 0;
	public static int landCount = 1;
	public static int reapCount = 0;
	public static int money = 1504;
	public static int houseCost = 1000;
	public static int saloonCost = 1000;
	public static int marketCost = 1000;
	public static int extractorCost = 1000;
	public static int landCost = ((landCount * 2) * (landCount * 2)) + 500;
	public static int random;
	public static int reapReward;

	public static String reap = "reap";
	public static String buy = "buy";
	public static String sell = "sell";
	public static String stats = "stats";
	public static String build = "build";
	public static String house = "house";
	public static String saloon = "saloon";
	public static String market = "market";
	public static String oilE = "oil extractor";
	public static String goldE = "gold extractor";

	public static void main(String[] args) {
		System.out.println("Welcome to the wild west property game!");
		System.out.println();
		sleep1s();
		System.out.println("Your goal is to make the most money owning land and reaping profit.");
		System.out.println();
		sleep1s();
		sleep1s();
		System.out.println("Playing this game is simple: buy, build, and profit!");
		System.out.println();
		sleep1s();
		sleep1s();
		System.out.println("This is what the board and key look like:");
		System.out.println();
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println("--01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18-");
		System.out.print("A " + A1);
		System.out.print(" ");
		System.out.print(" " + A2);
		System.out.print(" ");
		System.out.print(" " + A3);
		System.out.print(" ");
		System.out.print(" " + A4);
		System.out.print(" ");
		System.out.print(" " + A5);
		System.out.print(" ");
		System.out.print(" " + A6);
		System.out.print(" ");
		System.out.print(" " + A7);
		System.out.print(" ");
		System.out.print(" " + A8);
		System.out.print(" ");
		System.out.print(" " + A9);
		System.out.print(" ");
		System.out.print(" " + A10);
		System.out.print(" ");
		System.out.print(" " + A11);
		System.out.print(" ");
		System.out.print(" " + A12);
		System.out.print(" ");
		System.out.print(" " + A13);
		System.out.print(" ");
		System.out.print(" " + A14);
		System.out.print(" ");
		System.out.print(" " + A15);
		System.out.print(" ");
		System.out.print(" " + A16);
		System.out.print(" ");
		System.out.print(" " + A17);
		System.out.print(" ");
		System.out.println(" " + A18 + " |");
		System.out.print("B " + B1);
		System.out.print(" ");
		System.out.print(" " + B2);
		System.out.print(" ");
		System.out.print(" " + B3);
		System.out.print(" ");
		System.out.print(" " + B4);
		System.out.print(" ");
		System.out.print(" " + B5);
		System.out.print(" ");
		System.out.print(" " + B6);
		System.out.print(" ");
		System.out.print(" " + B7);
		System.out.print(" ");
		System.out.print(" " + B8);
		System.out.print(" ");
		System.out.print(" " + B9);
		System.out.print(" ");
		System.out.print(" " + B10);
		System.out.print(" ");
		System.out.print(" " + B11);
		System.out.print(" ");
		System.out.print(" " + B12);
		System.out.print(" ");
		System.out.print(" " + B13);
		System.out.print(" ");
		System.out.print(" " + B14);
		System.out.print(" ");
		System.out.print(" " + B15);
		System.out.print(" ");
		System.out.print(" " + B16);
		System.out.print(" ");
		System.out.print(" " + B17);
		System.out.print(" ");
		System.out.println(" " + B18 + " |");
		System.out.print("C " + C1);
		System.out.print(" ");
		System.out.print(" " + C2);
		System.out.print(" ");
		System.out.print(" " + C3);
		System.out.print(" ");
		System.out.print(" " + C4);
		System.out.print(" ");
		System.out.print(" " + C5);
		System.out.print(" ");
		System.out.print(" " + C6);
		System.out.print(" ");
		System.out.print(" " + C7);
		System.out.print(" ");
		System.out.print(" " + C8);
		System.out.print(" ");
		System.out.print(" " + C9);
		System.out.print(" ");
		System.out.print(" " + C10);
		System.out.print(" ");
		System.out.print(" " + C11);
		System.out.print(" ");
		System.out.print(" " + C12);
		System.out.print(" ");
		System.out.print(" " + C13);
		System.out.print(" ");
		System.out.print(" " + C14);
		System.out.print(" ");
		System.out.print(" " + C15);
		System.out.print(" ");
		System.out.print(" " + C16);
		System.out.print(" ");
		System.out.print(" " + C17);
		System.out.print(" ");
		System.out.println(" " + C18 + " |");
		System.out.print("D " + D1);
		System.out.print(" ");
		System.out.print(" " + D2);
		System.out.print(" ");
		System.out.print(" " + D3);
		System.out.print(" ");
		System.out.print(" " + D4);
		System.out.print(" ");
		System.out.print(" " + D5);
		System.out.print(" ");
		System.out.print(" " + D6);
		System.out.print(" ");
		System.out.print(" " + D7);
		System.out.print(" ");
		System.out.print(" " + D8);
		System.out.print(" ");
		System.out.print(" " + D9);
		System.out.print(" ");
		System.out.print(" " + D10);
		System.out.print(" ");
		System.out.print(" " + D11);
		System.out.print(" ");
		System.out.print(" " + D12);
		System.out.print(" ");
		System.out.print(" " + D13);
		System.out.print(" ");
		System.out.print(" " + D14);
		System.out.print(" ");
		System.out.print(" " + D15);
		System.out.print(" ");
		System.out.print(" " + D16);
		System.out.print(" ");
		System.out.print(" " + D17);
		System.out.print(" ");
		System.out.println(" " + D18 + " |");
		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("Key:");
		System.out.print("------------------");
		System.out.println();
		System.out.println("'+' = Lands you do not own.");
		System.out.println("'!' = Lands you own.");
		System.out.println("'@' = Lands with oil deposits you do not own.");
		System.out.println("'&' = Lands with oil extractors you own.");
		System.out.println("'G' = Lands with gold deposits you do not own.");
		System.out.println("'$' = Lands with gold extractors you own.");
		System.out.println("'^' = Lands with houses you own.");
		System.out.println("'#' = Lands with markets you own.");
		System.out.println("'*' = Lands with saloons you own.");
		System.out.print("------------------");
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		System.out.println();
		System.out.println();
		System.out.println("To start your financial quest you must know these commands:");
		System.out.println();
		sleep1s();
		sleep1s();
		System.out.println(
				"- 'buy' will allow you to purchase unowned land perpendicular to owned land. The more land you have, the more costly land is.");
		System.out.println(
				"- 'build' will allow you to build houses, saloons, markets, oil extractors, and gold extractors on owned land of your choice.");
		System.out.println(
				"- 'stats' will show you all the information you will ever need. If you need some statistics this is the place to go.");
		System.out.println(
				"- 'reap' will pass time for you to reap profit off of your built buildings. Your goal is to own all the land in the least amount of 'reap's.");
		System.out.println();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		System.out.println("The costs and reap rewards of buildings are shown here: ");
		System.out.println();
		System.out.println("Cost of house: $1000");
		System.out.println("Reap reward of house: $100");
		System.out.println("Cost of saloon: $2500");
		System.out.println("Reap reward of saloon: $500");
		System.out.println("Cost of market: $5000");
		System.out.println("Reap reward of market: $1000");
		System.out.println("Cost of oil extractor: $25000");
		System.out.println("Reap reward of oil extractor: $5000");
		System.out.println("Cost of gold extractor: $50000");
		System.out.println("Reap reward of gold extractor: $10000");
		System.out.println();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		sleep1s();
		System.out.println("You are starting off with a house tile and enough money for a new house tile. Good Luck!");
		System.out.println();

		random = ThreadLocalRandom.current().nextInt(1, 4 + 1);

		if (random == 1) {
			boardRandomizer();
			bR();
		}
		if (random == 2) {
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
		}
		if (random == 3) {
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
		}
		if (random == 4) {
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
			boardRandomizer();
			bR();
		}
		boardRand();
		printBoard();
	}

	public static void printBoard() {
		System.out.println();
		System.out.println("--01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18-");
		System.out.print("A " + A1);
		System.out.print(" ");
		System.out.print(" " + A2);
		System.out.print(" ");
		System.out.print(" " + A3);
		System.out.print(" ");
		System.out.print(" " + A4);
		System.out.print(" ");
		System.out.print(" " + A5);
		System.out.print(" ");
		System.out.print(" " + A6);
		System.out.print(" ");
		System.out.print(" " + A7);
		System.out.print(" ");
		System.out.print(" " + A8);
		System.out.print(" ");
		System.out.print(" " + A9);
		System.out.print(" ");
		System.out.print(" " + A10);
		System.out.print(" ");
		System.out.print(" " + A11);
		System.out.print(" ");
		System.out.print(" " + A12);
		System.out.print(" ");
		System.out.print(" " + A13);
		System.out.print(" ");
		System.out.print(" " + A14);
		System.out.print(" ");
		System.out.print(" " + A15);
		System.out.print(" ");
		System.out.print(" " + A16);
		System.out.print(" ");
		System.out.print(" " + A17);
		System.out.print(" ");
		System.out.println(" " + A18 + " |");
		System.out.print("B " + B1);
		System.out.print(" ");
		System.out.print(" " + B2);
		System.out.print(" ");
		System.out.print(" " + B3);
		System.out.print(" ");
		System.out.print(" " + B4);
		System.out.print(" ");
		System.out.print(" " + B5);
		System.out.print(" ");
		System.out.print(" " + B6);
		System.out.print(" ");
		System.out.print(" " + B7);
		System.out.print(" ");
		System.out.print(" " + B8);
		System.out.print(" ");
		System.out.print(" " + B9);
		System.out.print(" ");
		System.out.print(" " + B10);
		System.out.print(" ");
		System.out.print(" " + B11);
		System.out.print(" ");
		System.out.print(" " + B12);
		System.out.print(" ");
		System.out.print(" " + B13);
		System.out.print(" ");
		System.out.print(" " + B14);
		System.out.print(" ");
		System.out.print(" " + B15);
		System.out.print(" ");
		System.out.print(" " + B16);
		System.out.print(" ");
		System.out.print(" " + B17);
		System.out.print(" ");
		System.out.println(" " + B18 + " |");
		System.out.print("C " + C1);
		System.out.print(" ");
		System.out.print(" " + C2);
		System.out.print(" ");
		System.out.print(" " + C3);
		System.out.print(" ");
		System.out.print(" " + C4);
		System.out.print(" ");
		System.out.print(" " + C5);
		System.out.print(" ");
		System.out.print(" " + C6);
		System.out.print(" ");
		System.out.print(" " + C7);
		System.out.print(" ");
		System.out.print(" " + C8);
		System.out.print(" ");
		System.out.print(" " + C9);
		System.out.print(" ");
		System.out.print(" " + C10);
		System.out.print(" ");
		System.out.print(" " + C11);
		System.out.print(" ");
		System.out.print(" " + C12);
		System.out.print(" ");
		System.out.print(" " + C13);
		System.out.print(" ");
		System.out.print(" " + C14);
		System.out.print(" ");
		System.out.print(" " + C15);
		System.out.print(" ");
		System.out.print(" " + C16);
		System.out.print(" ");
		System.out.print(" " + C17);
		System.out.print(" ");
		System.out.println(" " + C18 + " |");
		System.out.print("D " + D1);
		System.out.print(" ");
		System.out.print(" " + D2);
		System.out.print(" ");
		System.out.print(" " + D3);
		System.out.print(" ");
		System.out.print(" " + D4);
		System.out.print(" ");
		System.out.print(" " + D5);
		System.out.print(" ");
		System.out.print(" " + D6);
		System.out.print(" ");
		System.out.print(" " + D7);
		System.out.print(" ");
		System.out.print(" " + D8);
		System.out.print(" ");
		System.out.print(" " + D9);
		System.out.print(" ");
		System.out.print(" " + D10);
		System.out.print(" ");
		System.out.print(" " + D11);
		System.out.print(" ");
		System.out.print(" " + D12);
		System.out.print(" ");
		System.out.print(" " + D13);
		System.out.print(" ");
		System.out.print(" " + D14);
		System.out.print(" ");
		System.out.print(" " + D15);
		System.out.print(" ");
		System.out.print(" " + D16);
		System.out.print(" ");
		System.out.print(" " + D17);
		System.out.print(" ");
		System.out.println(" " + D18 + " |");
		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("Key:");
		System.out.print("------------------------------------------------");
		System.out.println();
		System.out.println("'+' = Lands you do not own.");
		System.out.println("'!' = Lands you own that may be deposits.");
		System.out.println("'@' = Lands with oil deposits you do not own.");
		System.out.println("'&' = Lands with oil extractors you own.");
		System.out.println("'G' = Lands with gold deposits you do not own.");
		System.out.println("'$' = Lands with gold extractors you own.");
		System.out.println("'^' = Lands with houses you own.");
		System.out.println("'#' = Lands with markets you own.");
		System.out.println("'*' = Lands with saloons you own.");
		System.out.print("------------------------------------------------");
		System.out.println();
		cmdPrompt();
	}

	public static void boardRandomizer() {
		random = ThreadLocalRandom.current().nextInt(1, 72 + 1);

		if (random == 1) {
			setValueA1("@");
			isOilA1 = true;
		}
		if (random == 2) {
			setValueA2("@");
			isOilA2 = true;
		}
		if (random == 3) {
			setValueA3("@");
			isOilA3 = true;
		}
		if (random == 4) {
			setValueA4("@");
			isOilA4 = true;
		}
		if (random == 5) {
			setValueA5("@");
			isOilA5 = true;
		}
		if (random == 6) {
			setValueA6("@");
			isOilA6 = true;
		}
		if (random == 7) {
			setValueA7("@");
			isOilA7 = true;
		}
		if (random == 8) {
			setValueA8("@");
			isOilA8 = true;
		}
		if (random == 9) {
			setValueA9("@");
			isOilA9 = true;
		}
		if (random == 10) {
			setValueA10("@");
			isOilA10 = true;
		}
		if (random == 11) {
			setValueA11("@");
			isOilA11 = true;
		}
		if (random == 12) {
			setValueA12("@");
			isOilA12 = true;
		}
		if (random == 13) {
			setValueA13("@");
			isOilA13 = true;
		}
		if (random == 14) {
			setValueA14("@");
			isOilA14 = true;
		}
		if (random == 15) {
			setValueA15("@");
			isOilA15 = true;
		}
		if (random == 16) {
			setValueA16("@");
			isOilA16 = true;
		}
		if (random == 17) {
			setValueA17("@");
			isOilA17 = true;
		}
		if (random == 18) {
			setValueA18("@");
			isOilA18 = true;
		}
		if (random == 19) {
			setValueB1("@");
			isOilB1 = true;
		}
		if (random == 20) {
			setValueB2("@");
			isOilB2 = true;
		}
		if (random == 21) {
			setValueB3("@");
			isOilB3 = true;
		}
		if (random == 22) {
			setValueB4("@");
			isOilA1 = true;
		}
		if (random == 23) {
			setValueB5("@");
			isOilB5 = true;
		}
		if (random == 24) {
			setValueB6("@");
			isOilB6 = true;
		}
		if (random == 25) {
			setValueB7("@");
			isOilB7 = true;
		}
		if (random == 26) {
			setValueB8("@");
			isOilB8 = true;
		}
		if (random == 27) {
			setValueB9("@");
			isOilB9 = true;
		}
		if (random == 28) {
			setValueB10("@");
			isOilB10 = true;
		}
		if (random == 29) {
			setValueB11("@");
			isOilB11 = true;
		}
		if (random == 30) {
			setValueB12("@");
			isOilB12 = true;
		}
		if (random == 31) {
			setValueB13("@");
			isOilB13 = true;
		}
		if (random == 32) {
			setValueB14("@");
			isOilB14 = true;
		}
		if (random == 33) {
			setValueB15("@");
			isOilB15 = true;
		}
		if (random == 34) {
			setValueB16("@");
			isOilB16 = true;
		}
		if (random == 35) {
			setValueB17("@");
			isOilB17 = true;
		}
		if (random == 36) {
			setValueB18("@");
			isOilB18 = true;
		}
		if (random == 37) {
			setValueC1("@");
			isOilC1 = true;
		}
		if (random == 38) {
			setValueC2("@");
			isOilC2 = true;
		}
		if (random == 39) {
			setValueC3("@");
			isOilC3 = true;
		}
		if (random == 40) {
			setValueC4("@");
			isOilC4 = true;
		}
		if (random == 41) {
			setValueC5("@");
			isOilC5 = true;
		}
		if (random == 42) {
			setValueC6("@");
			isOilC6 = true;
		}
		if (random == 43) {
			setValueC7("@");
			isOilC7 = true;
		}
		if (random == 44) {
			setValueC8("@");
			isOilC8 = true;
		}
		if (random == 45) {
			setValueC9("@");
			isOilC9 = true;
		}
		if (random == 46) {
			setValueC10("@");
			isOilC10 = true;
		}
		if (random == 47) {
			setValueC11("@");
			isOilC11 = true;
		}
		if (random == 48) {
			setValueC12("@");
			isOilC12 = true;
		}
		if (random == 49) {
			setValueC13("@");
			isOilC13 = true;
		}
		if (random == 50) {
			setValueC14("@");
			isOilC14 = true;
		}
		if (random == 51) {
			setValueC15("@");
			isOilC15 = true;
		}
		if (random == 52) {
			setValueC16("@");
			isOilC16 = true;
		}
		if (random == 53) {
			setValueC17("@");
			isOilC1 = true;
		}
		if (random == 54) {
			setValueC18("@");
			isOilC18 = true;
		}
		if (random == 55) {
			setValueD1("@");
			isOilD1 = true;
		}
		if (random == 56) {
			setValueD2("@");
			isOilD2 = true;
		}
		if (random == 57) {
			setValueD3("@");
			isOilD3 = true;
		}
		if (random == 58) {
			setValueD4("@");
			isOilD4 = true;
		}
		if (random == 59) {
			setValueD5("@");
			isOilD5 = true;
		}
		if (random == 60) {
			setValueD6("@");
			isOilD6 = true;
		}
		if (random == 61) {
			setValueD7("@");
			isOilD7 = true;
		}
		if (random == 62) {
			setValueD8("@");
			isOilD8 = true;
		}
		if (random == 63) {
			setValueD9("@");
			isOilD9 = true;
		}
		if (random == 64) {
			setValueD10("@");
			isOilD10 = true;
		}
		if (random == 65) {
			setValueD11("@");
			isOilD11 = true;
		}
		if (random == 66) {
			setValueD12("@");
			isOilD12 = true;
		}
		if (random == 67) {
			setValueD13("@");
			isOilD13 = true;
		}
		if (random == 68) {
			setValueD14("@");
			isOilD14 = true;
		}
		if (random == 69) {
			setValueD15("@");
			isOilD15 = true;
		}
		if (random == 70) {
			setValueD16("@");
			isOilD16 = true;
		}
		if (random == 71) {
			setValueD17("@");
			isOilD17 = true;
		}
		if (random == 72) {
			setValueD18("@");
			isOilD18 = true;
		}
	}

	public static void boardRand() {
		random = ThreadLocalRandom.current().nextInt(1, 72 + 1);

		if (random == 1) {
			setValueA1("^");
			isOwnedA1 = true;
		}
		if (random == 2) {
			setValueA2("^");
			isOwnedA2 = true;
		}
		if (random == 3) {
			setValueA3("^");
			isOwnedA3 = true;
		}
		if (random == 4) {
			setValueA4("^");
			isOwnedA4 = true;
		}
		if (random == 5) {
			setValueA5("^");
			isOwnedA5 = true;
		}
		if (random == 6) {
			setValueA6("^");
			isOwnedA6 = true;
		}
		if (random == 7) {
			setValueA7("^");
			isOwnedA7 = true;
		}
		if (random == 8) {
			setValueA8("^");
			isOwnedA8 = true;
		}
		if (random == 9) {
			setValueA9("^");
			isOwnedA9 = true;
		}
		if (random == 10) {
			setValueA10("^");
			isOwnedA10 = true;
		}
		if (random == 11) {
			setValueA11("^");
			isOwnedA11 = true;
		}
		if (random == 12) {
			setValueA12("^");
			isOwnedA12 = true;
		}
		if (random == 13) {
			setValueA13("^");
			isOwnedA13 = true;
		}
		if (random == 14) {
			setValueA14("^");
			isOwnedA14 = true;
		}
		if (random == 15) {
			setValueA15("^");
			isOwnedA15 = true;
		}
		if (random == 16) {
			setValueA16("^");
			isOwnedA16 = true;
		}
		if (random == 17) {
			setValueA17("^");
			isOwnedA17 = true;
		}
		if (random == 18) {
			setValueA18("^");
			isOwnedA18 = true;
		}
		if (random == 19) {
			setValueB1("^");
			isOwnedB1 = true;
		}
		if (random == 20) {
			setValueB2("^");
			isOwnedB2 = true;
		}
		if (random == 21) {
			setValueB3("^");
			isOwnedB3 = true;
		}
		if (random == 22) {
			setValueB4("^");
			isOwnedB4 = true;
		}
		if (random == 23) {
			setValueB5("^");
			isOwnedB5 = true;
		}
		if (random == 24) {
			setValueB6("^");
			isOwnedB6 = true;
		}
		if (random == 25) {
			setValueB7("^");
			isOwnedB7 = true;
		}
		if (random == 26) {
			setValueB8("^");
			isOwnedB8 = true;
		}
		if (random == 27) {
			setValueB9("^");
			isOwnedB9 = true;
		}
		if (random == 28) {
			setValueB10("^");
			isOwnedB10 = true;
		}
		if (random == 29) {
			setValueB11("^");
			isOwnedB11 = true;
		}
		if (random == 30) {
			setValueB12("^");
			isOwnedB12 = true;
		}
		if (random == 31) {
			setValueB13("^");
			isOwnedB13 = true;
		}
		if (random == 32) {
			setValueB14("^");
			isOwnedB14 = true;
		}
		if (random == 33) {
			setValueB15("^");
			isOwnedB15 = true;
		}
		if (random == 34) {
			setValueB16("^");
			isOwnedB16 = true;
		}
		if (random == 35) {
			setValueB17("^");
			isOwnedB17 = true;
		}
		if (random == 36) {
			setValueB18("^");
			isOwnedB18 = true;
		}
		if (random == 37) {
			setValueC1("^");
			isOwnedC1 = true;
		}
		if (random == 38) {
			setValueC2("^");
			isOwnedC2 = true;
		}
		if (random == 39) {
			setValueC3("^");
			isOwnedC3 = true;
		}
		if (random == 40) {
			setValueC4("^");
			isOwnedC4 = true;
		}
		if (random == 41) {
			setValueC5("^");
			isOwnedC5 = true;
		}
		if (random == 42) {
			setValueC6("^");
			isOwnedC6 = true;
		}
		if (random == 43) {
			setValueC7("^");
			isOwnedC7 = true;
		}
		if (random == 44) {
			setValueC8("^");
			isOwnedC8 = true;
		}
		if (random == 45) {
			setValueC9("^");
			isOwnedC9 = true;
		}
		if (random == 46) {
			setValueC10("^");
			isOwnedC10 = true;
		}
		if (random == 47) {
			setValueC11("^");
			isOwnedC11 = true;
		}
		if (random == 48) {
			setValueC12("^");
			isOwnedC12 = true;
		}
		if (random == 49) {
			setValueC13("^");
			isOwnedC13 = true;
		}
		if (random == 50) {
			setValueC14("^");
			isOwnedC14 = true;
		}
		if (random == 51) {
			setValueC15("^");
			isOwnedC15 = true;
		}
		if (random == 52) {
			setValueC16("^");
			isOwnedC16 = true;
		}
		if (random == 53) {
			setValueC17("^");
			isOwnedC17 = true;
		}
		if (random == 54) {
			setValueC18("^");
			isOwnedC18 = true;
		}
		if (random == 55) {
			setValueD1("^");
			isOwnedD1 = true;
		}
		if (random == 56) {
			setValueD2("^");
			isOwnedD2 = true;
		}
		if (random == 57) {
			setValueD3("^");
			isOwnedD3 = true;
		}
		if (random == 58) {
			setValueD4("^");
			isOwnedD4 = true;
		}
		if (random == 59) {
			setValueD5("^");
			isOwnedD5 = true;
		}
		if (random == 60) {
			setValueD6("^");
			isOwnedD6 = true;
		}
		if (random == 61) {
			setValueD7("^");
			isOwnedD7 = true;
		}
		if (random == 62) {
			setValueD8("^");
			isOwnedD8 = true;
		}
		if (random == 63) {
			setValueD9("^");
			isOwnedD9 = true;
		}
		if (random == 64) {
			setValueD10("^");
			isOwnedD10 = true;
		}
		if (random == 65) {
			setValueD11("^");
			isOwnedD11 = true;
		}
		if (random == 66) {
			setValueD12("^");
			isOwnedD12 = true;
		}
		if (random == 67) {
			setValueD13("^");
			isOwnedD13 = true;
		}
		if (random == 68) {
			setValueD14("^");
			isOwnedD14 = true;
		}
		if (random == 69) {
			setValueD15("^");
			isOwnedD15 = true;
		}
		if (random == 70) {
			setValueD16("^");
			isOwnedD16 = true;
		}
		if (random == 71) {
			setValueD17("^");
			isOwnedD17 = true;
		}
		if (random == 72) {
			setValueD18("^");
			isOwnedD18 = true;
		}
	}

	public static void bR() {
		random = ThreadLocalRandom.current().nextInt(1, 72 + 1);

		if (random == 1) {
			setValueA1("G");
			isGoldA1 = true;
		}
		if (random == 2) {
			setValueA2("G");
			isGoldA2 = true;
		}
		if (random == 3) {
			setValueA3("G");
			isGoldA3 = true;
		}
		if (random == 4) {
			setValueA4("G");
			isGoldA4 = true;
		}
		if (random == 5) {
			setValueA5("G");
			isGoldA5 = true;
		}
		if (random == 6) {
			setValueA6("G");
			isGoldA6 = true;
		}
		if (random == 7) {
			setValueA7("G");
			isGoldA7 = true;
		}
		if (random == 8) {
			setValueA8("G");
			isGoldA8 = true;
		}
		if (random == 9) {
			setValueA9("G");
			isGoldA9 = true;
		}
		if (random == 10) {
			setValueA10("G");
			isGoldA10 = true;
		}
		if (random == 11) {
			setValueA11("G");
			isGoldA11 = true;
		}
		if (random == 12) {
			setValueA12("G");
			isGoldA12 = true;
		}
		if (random == 13) {
			setValueA13("G");
			isGoldA13 = true;
		}
		if (random == 14) {
			setValueA14("G");
			isGoldA14 = true;
		}
		if (random == 15) {
			setValueA15("G");
			isGoldA15 = true;
		}
		if (random == 16) {
			setValueA16("G");
			isGoldA16 = true;
		}
		if (random == 17) {
			setValueA17("G");
			isGoldA17 = true;
		}
		if (random == 18) {
			setValueA18("G");
			isGoldA18 = true;
		}
		if (random == 19) {
			setValueB1("G");
			isGoldB1 = true;
		}
		if (random == 20) {
			setValueB2("G");
			isGoldB2 = true;
		}
		if (random == 21) {
			setValueB3("G");
			isGoldB3 = true;
		}
		if (random == 22) {
			setValueB4("G");
			isGoldA1 = true;
		}
		if (random == 23) {
			setValueB5("G");
			isGoldB5 = true;
		}
		if (random == 24) {
			setValueB6("G");
			isGoldB6 = true;
		}
		if (random == 25) {
			setValueB7("G");
			isGoldB7 = true;
		}
		if (random == 26) {
			setValueB8("G");
			isGoldB8 = true;
		}
		if (random == 27) {
			setValueB9("G");
			isGoldB9 = true;
		}
		if (random == 28) {
			setValueB10("G");
			isGoldB10 = true;
		}
		if (random == 29) {
			setValueB11("G");
			isGoldB11 = true;
		}
		if (random == 30) {
			setValueB12("G");
			isGoldB12 = true;
		}
		if (random == 31) {
			setValueB13("G");
			isGoldB13 = true;
		}
		if (random == 32) {
			setValueB14("G");
			isGoldB14 = true;
		}
		if (random == 33) {
			setValueB15("G");
			isGoldB15 = true;
		}
		if (random == 34) {
			setValueB16("G");
			isGoldB16 = true;
		}
		if (random == 35) {
			setValueB17("G");
			isGoldB17 = true;
		}
		if (random == 36) {
			setValueB18("G");
			isGoldB18 = true;
		}
		if (random == 37) {
			setValueC1("G");
			isGoldC1 = true;
		}
		if (random == 38) {
			setValueC2("G");
			isGoldC2 = true;
		}
		if (random == 39) {
			setValueC3("G");
			isGoldC3 = true;
		}
		if (random == 40) {
			setValueC4("G");
			isGoldC4 = true;
		}
		if (random == 41) {
			setValueC5("G");
			isGoldC5 = true;
		}
		if (random == 42) {
			setValueC6("G");
			isGoldC6 = true;
		}
		if (random == 43) {
			setValueC7("G");
			isGoldC7 = true;
		}
		if (random == 44) {
			setValueC8("G");
			isGoldC8 = true;
		}
		if (random == 45) {
			setValueC9("G");
			isGoldC9 = true;
		}
		if (random == 46) {
			setValueC10("G");
			isGoldC10 = true;
		}
		if (random == 47) {
			setValueC11("G");
			isGoldC11 = true;
		}
		if (random == 48) {
			setValueC12("G");
			isGoldC12 = true;
		}
		if (random == 49) {
			setValueC13("G");
			isGoldC13 = true;
		}
		if (random == 50) {
			setValueC14("G");
			isGoldC14 = true;
		}
		if (random == 51) {
			setValueC15("G");
			isGoldC15 = true;
		}
		if (random == 52) {
			setValueC16("G");
			isGoldC16 = true;
		}
		if (random == 53) {
			setValueC17("G");
			isGoldC17 = true;
		}
		if (random == 54) {
			setValueC18("G");
			isGoldC18 = true;
		}
		if (random == 55) {
			setValueD1("G");
			isGoldD1 = true;
		}
		if (random == 56) {
			setValueD2("G");
			isGoldD2 = true;
		}
		if (random == 57) {
			setValueD3("G");
			isGoldD3 = true;
		}
		if (random == 58) {
			setValueD4("G");
			isGoldD4 = true;
		}
		if (random == 59) {
			setValueD5("G");
			isGoldD5 = true;
		}
		if (random == 60) {
			setValueD6("G");
			isGoldD6 = true;
		}
		if (random == 61) {
			setValueD7("G");
			isGoldD7 = true;
		}
		if (random == 62) {
			setValueD8("G");
			isGoldD8 = true;
		}
		if (random == 63) {
			setValueD9("G");
			isGoldD9 = true;
		}
		if (random == 64) {
			setValueD10("G");
			isGoldD10 = true;
		}
		if (random == 65) {
			setValueD11("G");
			isGoldD11 = true;
		}
		if (random == 66) {
			setValueD12("G");
			isGoldD12 = true;
		}
		if (random == 67) {
			setValueD13("G");
			isGoldD13 = true;
		}
		if (random == 68) {
			setValueD14("G");
			isGoldD14 = true;
		}
		if (random == 69) {
			setValueD15("G");
			isGoldD15 = true;
		}
		if (random == 70) {
			setValueD16("G");
			isGoldD16 = true;
		}
		if (random == 71) {
			setValueD17("G");
			isGoldD17 = true;
		}
		if (random == 72) {
			setValueD18("G");
			isGoldD18 = true;
		}
	}

	public static void sleep1s() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println();
			System.out.println("Error in time.");
		}
	}

	public static void buy() {
		System.out.println();
		System.out.println("What plot would you like to buy? (Enter in this format: 'A16' or 'C4').");
		Scanner buyen = new Scanner(System.in);
		String buying = buyen.nextLine();

		if (buying.equals(nA1)) {
			if (isOwnedA2 == true || isOwnedB1 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A1 for " + landCost + " dollars!");
					setLandCount();
					landCost = ((landCount * 2) * (landCount * 2)) + 500;
					setOwnValueA1();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA2)) {
			if (isOwnedA1 == true || isOwnedB2 == true || isOwnedA3 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A2 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA2();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA3)) {
			if (isOwnedA2 == true || isOwnedB3 == true || isOwnedA4 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A3 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA3();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA4)) {
			if (isOwnedA3 == true || isOwnedB4 == true || isOwnedA5 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A4 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA4();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA5)) {
			if (isOwnedA4 == true || isOwnedB5 == true || isOwnedA6 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A5 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA5();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA6)) {
			if (isOwnedA5 == true || isOwnedB6 == true || isOwnedA7 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A6 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA6();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA7)) {
			if (isOwnedA6 == true || isOwnedB7 == true || isOwnedA8 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A7 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA7();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA8)) {
			if (isOwnedA7 == true || isOwnedB8 == true || isOwnedA9 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A8 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA8();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA9)) {
			if (isOwnedA8 == true || isOwnedB9 == true || isOwnedA10 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A9 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA9();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA10)) {
			if (isOwnedA9 == true || isOwnedB10 == true || isOwnedA11 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A10 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA10();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA11)) {
			if (isOwnedA10 == true || isOwnedB11 == true || isOwnedA12 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A11 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA11();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA12)) {
			if (isOwnedA11 == true || isOwnedB12 == true || isOwnedA13 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A12 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA12();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA13)) {
			if (isOwnedA12 == true || isOwnedB13 == true || isOwnedA14 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A13 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA13();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA14)) {
			if (isOwnedA13 == true || isOwnedB14 == true || isOwnedA15 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A14 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA14();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA15)) {
			if (isOwnedA14 == true || isOwnedB15 == true || isOwnedA16 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A15 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA15();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA16)) {
			if (isOwnedA15 == true || isOwnedB16 == true || isOwnedA17 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A16 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA16();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA17)) {
			if (isOwnedA16 == true || isOwnedB17 == true || isOwnedA18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A17 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA17();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nA18)) {
			if (isOwnedA17 == true || isOwnedB18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought A18 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueA18();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB1)) {
			if (isOwnedB2 == true || isOwnedA1 == true || isOwnedC1 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B1 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB1();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB2)) {
			if (isOwnedB1 == true || isOwnedA2 == true || isOwnedB3 == true || isOwnedC2 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B2 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB2();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB3)) {
			if (isOwnedB2 == true || isOwnedB4 == true || isOwnedA3 == true || isOwnedC3 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B3 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB3();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB4)) {
			if (isOwnedB3 == true || isOwnedB5 == true || isOwnedA4 == true || isOwnedC4 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B4 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB4();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB5)) {
			if (isOwnedB4 == true || isOwnedB6 == true || isOwnedA5 == true || isOwnedC5 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B5 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB5();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB6)) {
			if (isOwnedB5 == true || isOwnedB7 == true || isOwnedA6 == true || isOwnedC6 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B6 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB6();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB7)) {
			if (isOwnedB6 == true || isOwnedB8 == true || isOwnedA7 == true || isOwnedC7 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B7 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB7();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB8)) {
			if (isOwnedB7 == true || isOwnedB9 == true || isOwnedA8 == true || isOwnedC8 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B8 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB8();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB9)) {
			if (isOwnedA9 == true || isOwnedB8 == true || isOwnedC9 == true || isOwnedB10 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B9 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB9();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB10)) {
			if (isOwnedA10 == true || isOwnedB9 == true || isOwnedC10 == true || isOwnedB11 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B10 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB10();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB11)) {
			if (isOwnedA11 == true || isOwnedB10 == true || isOwnedC11 == true || isOwnedB12 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B11 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB11();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB12)) {
			if (isOwnedA12 == true || isOwnedB11 == true || isOwnedC12 == true || isOwnedB13 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B12 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB12();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB13)) {
			if (isOwnedA13 == true || isOwnedB12 == true || isOwnedC13 == true || isOwnedB14 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B13 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB13();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB14)) {
			if (isOwnedB13 == true || isOwnedB15 == true || isOwnedA14 == true || isOwnedC14 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B14 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB14();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB15)) {
			if (isOwnedA15 == true || isOwnedB14 == true || isOwnedC15 == true || isOwnedB16 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B15 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB15();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB16)) {
			if (isOwnedB15 == true || isOwnedB17 == true || isOwnedC16 == true || isOwnedA16 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B16 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB16();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB17)) {
			if (isOwnedA17 == true || isOwnedB16 == true || isOwnedC17 == true || isOwnedB18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B17 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB17();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nB18)) {
			if (isOwnedA18 == true || isOwnedB17 == true || isOwnedC18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought B18 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueB18();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC1)) {
			if (isOwnedC2 == true || isOwnedB1 == true || isOwnedD1 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C1 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC1();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC2)) {
			if (isOwnedC1 == true || isOwnedB2 == true || isOwnedC3 == true || isOwnedD2 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C2 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC2();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC3)) {
			if (isOwnedC2 == true || isOwnedC4 == true || isOwnedB3 == true || isOwnedD3 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C3 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC3();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC4)) {
			if (isOwnedC3 == true || isOwnedC5 == true || isOwnedB4 == true || isOwnedD4 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C4 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC4();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC5)) {
			if (isOwnedC4 == true || isOwnedC6 == true || isOwnedB5 == true || isOwnedD5 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C5 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC5();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC6)) {
			if (isOwnedC5 == true || isOwnedC7 == true || isOwnedB6 == true || isOwnedD6 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C6 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC6();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC7)) {
			if (isOwnedC6 == true || isOwnedC8 == true || isOwnedB7 == true || isOwnedD7 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C7 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC7();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC8)) {
			if (isOwnedC7 == true || isOwnedC9 == true || isOwnedB8 == true || isOwnedD8 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C8 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC8();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC9)) {
			if (isOwnedB9 == true || isOwnedC8 == true || isOwnedD9 == true || isOwnedC10 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You Bought C9 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC9();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC10)) {
			if (isOwnedB10 == true || isOwnedC9 == true || isOwnedD10 == true || isOwnedC11 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C10 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC10();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC11)) {
			if (isOwnedB11 == true || isOwnedC10 == true || isOwnedD11 == true || isOwnedC12 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C11 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC11();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC12)) {
			if (isOwnedB12 == true || isOwnedC11 == true || isOwnedD12 == true || isOwnedC12 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C12 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC12();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC13)) {
			if (isOwnedB13 == true || isOwnedC12 == true || isOwnedD13 == true || isOwnedC14 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C13 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC13();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC14)) {
			if (isOwnedB14 == true || isOwnedC13 == true || isOwnedD14 == true || isOwnedC15 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C14 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC14();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC15)) {
			if (isOwnedB15 == true || isOwnedC14 == true || isOwnedD15 == true || isOwnedC16 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C15 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC15();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC16)) {
			if (isOwnedB16 == true || isOwnedC15 == true || isOwnedD16 == true || isOwnedC17 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C16 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC16();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC17)) {
			if (isOwnedB17 == true || isOwnedC16 == true || isOwnedD17 == true || isOwnedC18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C17 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC17();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nC18)) {
			if (isOwnedB18 == true || isOwnedC17 == true || isOwnedD18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought C18 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueC18();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD1)) {
			if (isOwnedD2 == true || isOwnedC1 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D1 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD1();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD2)) {
			if (isOwnedD1 == true || isOwnedC2 == true || isOwnedD3 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D2 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD2();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD3)) {
			if (isOwnedD2 == true || isOwnedB3 == true || isOwnedD4 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D3 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD3();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD4)) {
			if (isOwnedD3 == true || isOwnedB4 == true || isOwnedD5 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D4 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD4();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD5)) {
			if (isOwnedD4 == true || isOwnedC5 == true || isOwnedD6 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D5 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD5();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD6)) {
			if (isOwnedD5 == true || isOwnedC6 == true || isOwnedD7 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D6 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD6();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD7)) {
			if (isOwnedD6 == true || isOwnedC7 == true || isOwnedD8 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D7 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD7();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD8)) {
			if (isOwnedD7 == true || isOwnedC8 == true || isOwnedD9 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D8 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD8();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD9)) {
			if (isOwnedD8 == true || isOwnedC9 == true || isOwnedD10 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D9 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD9();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cDnnot buy D plot of land Dt this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD10)) {
			if (isOwnedD9 == true || isOwnedC10 == true || isOwnedD11 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D10 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD10();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD11)) {
			if (isOwnedD10 == true || isOwnedC11 == true || isOwnedD12 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D11 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD11();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD12)) {
			if (isOwnedD11 == true || isOwnedC12 == true || isOwnedD13 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D12 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD12();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD13)) {
			if (isOwnedD12 == true || isOwnedC13 == true || isOwnedD14 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D13 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD13();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD14)) {
			if (isOwnedD13 == true || isOwnedC14 == true || isOwnedD15 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D14 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD14();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD15)) {
			if (isOwnedD14 == true || isOwnedC15 == true || isOwnedD16 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D15 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD15();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD16)) {
			if (isOwnedD15 == true || isOwnedC16 == true || isOwnedD17 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D16 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD16();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD17)) {
			if (isOwnedD16 == true || isOwnedC17 == true || isOwnedD18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D17 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD17();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		}
		if (buying.equals(nD18)) {
			if (isOwnedD17 == true || isOwnedC18 == true) {
				if (money > landCost) {
					setMoney(landCost);
					System.out.println();
					System.out.println("You bought D18 for " + landCost + " dollars!");
					setLandCount();
					setOwnValueD18();
					printBoard();
				} else {
					System.out.println();
					System.out.println("You cannot buy a plot of land at this time.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("That plot is not perpendicular to a plot you own.");
				printBoard();
			}
		} 
		if (landCount == 72) {
			System.out.println();
			System.out.println("Congratulations! You finished the game in " + reapCount + " reaps!");
			System.exit(0);
		} else {
			buy();
		}
	}

	public static void build() {
		System.out.println();
		System.out.println("What plot would you like to build on? (Enter in this format: 'A3' or 'C14').");
		System.out.println();
		Scanner builden = new Scanner(System.in);
		String building = builden.nextLine();

		if (building.equals(nA1)) {
			if (isOwnedA1 == true) {
				if (isHouseA1 == false && isMarketA1 == false && isSaloonA1 == false && isGExtractorA1 == false
						&& isOExtractorA1 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A1 = new Scanner(System.in);
					String A1ing = A1.nextLine();

					if (A1ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA1("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A1ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA1("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A1ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA1("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A1ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA1 == true) {
								setMoney(25000);
								setValueA1("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A1ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA1 == true) {
								setMoney(50000);
								setValueA1("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA2)) {
			if (isOwnedA2 == true) {
				if (isHouseA2 == false && isMarketA2 == false && isSaloonA2 == false && isGExtractorA2 == false
						&& isOExtractorA2 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A2 = new Scanner(System.in);
					String A2ing = A2.nextLine();

					if (A2ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA2("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A2ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA2("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A2ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA2("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A2ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA2 == true) {
								setMoney(25000);
								setValueA2("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A2ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA2 == true) {
								setMoney(50000);
								setValueA2("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA3)) {
			if (isOwnedA3 == true) {
				if (isHouseA3 == false && isMarketA3 == false && isSaloonA3 == false && isGExtractorA3 == false
						&& isOExtractorA3 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A3 = new Scanner(System.in);
					String A3ing = A3.nextLine();

					if (A3ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA3("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A3ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA3("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A3ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA3("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A3ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA3 == true) {
								setMoney(25000);
								setValueA3("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A3ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA3 == true) {
								setMoney(50000);
								setValueA3("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA4)) {
			if (isOwnedA4 == true) {
				if (isHouseA4 == false && isMarketA4 == false && isSaloonA4 == false && isGExtractorA4 == false
						&& isOExtractorA4 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A4 = new Scanner(System.in);
					String A4ing = A4.nextLine();

					if (A4ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA4("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A4ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA4("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A4ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA4("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A4ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA4 == true) {
								setMoney(25000);
								setValueA4("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A4ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA4 == true) {
								setMoney(50000);
								setValueA4("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA5)) {
			if (isOwnedA5 == true) {
				if (isHouseA5 == false && isMarketA5 == false && isSaloonA5 == false && isGExtractorA5 == false
						&& isOExtractorA5 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A5 = new Scanner(System.in);
					String A5ing = A5.nextLine();

					if (A5ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA5("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A5ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA5("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A5ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA5("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A5ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA5 == true) {
								setMoney(25000);
								setValueA5("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A5ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA5 == true) {
								setMoney(50000);
								setValueA5("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA6)) {
			if (isOwnedA6 == true) {
				if (isHouseA6 == false && isMarketA6 == false && isSaloonA6 == false && isGExtractorA6 == false
						&& isOExtractorA6 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A6 = new Scanner(System.in);
					String A6ing = A6.nextLine();

					if (A6ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA6("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A6ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA6("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A6ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA6("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A6ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA6 == true) {
								setMoney(25000);
								setValueA6("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A6ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA6 == true) {
								setMoney(50000);
								setValueA6("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA7)) {
			if (isOwnedA7 == true) {
				if (isHouseA7 == false && isMarketA7 == false && isSaloonA7 == false && isGExtractorA7 == false
						&& isOExtractorA7 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A7 = new Scanner(System.in);
					String A7ing = A7.nextLine();

					if (A7ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA7("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A7ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA7("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A7ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA7("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A7ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA7 == true) {
								setMoney(25000);
								setValueA7("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A7ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA7 == true) {
								setMoney(50000);
								setValueA7("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA8)) {
			if (isOwnedA8 == true) {
				if (isHouseA8 == false && isMarketA8 == false && isSaloonA8 == false && isGExtractorA8 == false
						&& isOExtractorA8 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A8 = new Scanner(System.in);
					String A8ing = A8.nextLine();

					if (A8ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA8("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A8ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA8("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A8ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA8("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A8ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA8 == true) {
								setMoney(25000);
								setValueA8("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A8ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA8 == true) {
								setMoney(50000);
								setValueA8("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA9)) {
			if (isOwnedA9 == true) {
				if (isHouseA9 == false && isMarketA9 == false && isSaloonA9 == false && isGExtractorA9 == false
						&& isOExtractorA9 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A9 = new Scanner(System.in);
					String A9ing = A9.nextLine();

					if (A9ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA9("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A9ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA9("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A9ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA9("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A9ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA9 == true) {
								setMoney(25000);
								setValueA9("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A9ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA9 == true) {
								setMoney(50000);
								setValueA9("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA10)) {
			if (isOwnedA10 == true) {
				if (isHouseA10 == false && isMarketA10 == false && isSaloonA10 == false && isGExtractorA10 == false
						&& isOExtractorA10 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A10 = new Scanner(System.in);
					String A10ing = A10.nextLine();

					if (A10ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA10("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A10ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA10("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A10ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA10("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A10ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA10 == true) {
								setMoney(25000);
								setValueA10("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A10ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA10 == true) {
								setMoney(50000);
								setValueA10("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA11)) {
			if (isOwnedA11 == true) {
				if (isHouseA11 == false && isMarketA11 == false && isSaloonA11 == false && isGExtractorA11 == false
						&& isOExtractorA11 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A11 = new Scanner(System.in);
					String A11ing = A11.nextLine();

					if (A11ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA11("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A11ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA11("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A11ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA11("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A11ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA11 == true) {
								setMoney(25000);
								setValueA11("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A11ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA11 == true) {
								setMoney(50000);
								setValueA11("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA12)) {
			if (isOwnedA12 == true) {
				if (isHouseA12 == false && isMarketA12 == false && isSaloonA12 == false && isGExtractorA12 == false
						&& isOExtractorA12 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A12 = new Scanner(System.in);
					String A12ing = A12.nextLine();

					if (A12ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA12("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A12ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA12("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A12ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA12("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A12ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA12 == true) {
								setMoney(25000);
								setValueA12("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A12ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA12 == true) {
								setMoney(50000);
								setValueA12("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA13)) {
			if (isOwnedA13 == true) {
				if (isHouseA13 == false && isMarketA13 == false && isSaloonA13 == false && isGExtractorA13 == false
						&& isOExtractorA13 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A13 = new Scanner(System.in);
					String A13ing = A13.nextLine();

					if (A13ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA13("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A13ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA13("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A13ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA13("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A13ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA13 == true) {
								setMoney(25000);
								setValueA13("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A13ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA13 == true) {
								setMoney(50000);
								setValueA13("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA14)) {
			if (isOwnedA14 == true) {
				if (isHouseA14 == false && isMarketA14 == false && isSaloonA14 == false && isGExtractorA14 == false
						&& isOExtractorA14 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A14 = new Scanner(System.in);
					String A14ing = A14.nextLine();

					if (A14ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA14("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A14ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA14("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A14ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA14("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A14ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA14 == true) {
								setMoney(25000);
								setValueA14("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A14ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA14 == true) {
								setMoney(50000);
								setValueA14("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA15)) {
			if (isOwnedA15 == true) {
				if (isHouseA15 == false && isMarketA15 == false && isSaloonA15 == false && isGExtractorA15 == false
						&& isOExtractorA15 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A15 = new Scanner(System.in);
					String A15ing = A15.nextLine();

					if (A15ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA15("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A15ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA15("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A15ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA15("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A15ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA15 == true) {
								setMoney(25000);
								setValueA15("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A15ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA15 == true) {
								setMoney(50000);
								setValueA15("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA16)) {
			if (isOwnedA16 == true) {
				if (isHouseA16 == false && isMarketA16 == false && isSaloonA16 == false && isGExtractorA16 == false
						&& isOExtractorA16 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A16 = new Scanner(System.in);
					String A16ing = A16.nextLine();

					if (A16ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA16("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A16ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA16("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A16ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA16("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A16ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA16 == true) {
								setMoney(25000);
								setValueA16("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A16ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA16 == true) {
								setMoney(50000);
								setValueA16("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA17)) {
			if (isOwnedA17 == true) {
				if (isHouseA17 == false && isMarketA17 == false && isSaloonA17 == false && isGExtractorA17 == false
						&& isOExtractorA17 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A17 = new Scanner(System.in);
					String A17ing = A17.nextLine();

					if (A17ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA17("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A17ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA17("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A17ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA17("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A17ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA17 == true) {
								setMoney(25000);
								setValueA17("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A17ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA17 == true) {
								setMoney(50000);
								setValueA17("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nA18)) {
			if (isOwnedA18 == true) {
				if (isHouseA18 == false && isMarketA18 == false && isSaloonA18 == false && isGExtractorA18 == false
						&& isOExtractorA18 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner A18 = new Scanner(System.in);
					String A18ing = A18.nextLine();

					if (A18ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueA18("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (A18ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueA18("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (A18ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueA18("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (A18ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilA18 == true) {
								setMoney(25000);
								setValueA18("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (A18ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldA18 == true) {
								setMoney(50000);
								setValueA18("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB1)) {
			if (isOwnedB1 == true) {
				if (isHouseB1 == false && isMarketB1 == false && isSaloonB1 == false && isGExtractorB1 == false
						&& isOExtractorB1 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B1 = new Scanner(System.in);
					String B1ing = B1.nextLine();

					if (B1ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB1("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B1ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB1("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B1ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB1("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B1ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB1 == true) {
								setMoney(25000);
								setValueB1("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B1ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB1 == true) {
								setMoney(50000);
								setValueB1("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB2)) {
			if (isOwnedB2 == true) {
				if (isHouseB2 == false && isMarketB2 == false && isSaloonB2 == false && isGExtractorB2 == false
						&& isOExtractorB2 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B2 = new Scanner(System.in);
					String B2ing = B2.nextLine();

					if (B2ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB2("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B2ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB2("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B2ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB2("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B2ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB2 == true) {
								setMoney(25000);
								setValueB2("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B2ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB2 == true) {
								setMoney(50000);
								setValueB2("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB3)) {
			if (isOwnedB3 == true) {
				if (isHouseB3 == false && isMarketB3 == false && isSaloonB3 == false && isGExtractorB3 == false
						&& isOExtractorB3 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B3 = new Scanner(System.in);
					String B3ing = B3.nextLine();

					if (B3ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB3("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B3ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB3("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B3ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB3("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B3ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB3 == true) {
								setMoney(25000);
								setValueB3("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B3ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB3 == true) {
								setMoney(50000);
								setValueB3("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB4)) {
			if (isOwnedB4 == true) {
				if (isHouseB4 == false && isMarketB4 == false && isSaloonB4 == false && isGExtractorB4 == false
						&& isOExtractorB4 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B4 = new Scanner(System.in);
					String B4ing = B4.nextLine();

					if (B4ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB4("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B4ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB4("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B4ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB4("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B4ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB4 == true) {
								setMoney(25000);
								setValueB4("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B4ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB4 == true) {
								setMoney(50000);
								setValueB4("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB5)) {
			if (isOwnedB5 == true) {
				if (isHouseB5 == false && isMarketB5 == false && isSaloonB5 == false && isGExtractorB5 == false
						&& isOExtractorB5 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B5 = new Scanner(System.in);
					String B5ing = B5.nextLine();

					if (B5ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB5("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B5ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB5("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B5ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB5("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B5ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB5 == true) {
								setMoney(25000);
								setValueB5("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B5ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB5 == true) {
								setMoney(50000);
								setValueB5("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB6)) {
			if (isOwnedB6 == true) {
				if (isHouseB6 == false && isMarketB6 == false && isSaloonB6 == false && isGExtractorB6 == false
						&& isOExtractorB6 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B6 = new Scanner(System.in);
					String B6ing = B6.nextLine();

					if (B6ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB6("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B6ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB6("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B6ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB6("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B6ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB6 == true) {
								setMoney(25000);
								setValueB6("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B6ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB6 == true) {
								setMoney(50000);
								setValueB6("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB7)) {
			if (isOwnedB7 == true) {
				if (isHouseB7 == false && isMarketB7 == false && isSaloonB7 == false && isGExtractorB7 == false
						&& isOExtractorB7 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B7 = new Scanner(System.in);
					String B7ing = B7.nextLine();

					if (B7ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB7("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B7ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB7("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B7ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB7("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B7ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB7 == true) {
								setMoney(25000);
								setValueB7("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B7ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB7 == true) {
								setMoney(50000);
								setValueB7("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB8)) {
			if (isOwnedB8 == true) {
				if (isHouseB8 == false && isMarketB8 == false && isSaloonB8 == false && isGExtractorB8 == false
						&& isOExtractorB8 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B8 = new Scanner(System.in);
					String B8ing = B8.nextLine();

					if (B8ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB8("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B8ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB8("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B8ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB8("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B8ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB8 == true) {
								setMoney(25000);
								setValueB8("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B8ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB8 == true) {
								setMoney(50000);
								setValueB8("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB9)) {
			if (isOwnedB9 == true) {
				if (isHouseB9 == false && isMarketB9 == false && isSaloonB9 == false && isGExtractorB9 == false
						&& isOExtractorB9 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B9 = new Scanner(System.in);
					String B9ing = B9.nextLine();

					if (B9ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB9("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B9ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB9("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B9ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB9("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B9ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB9 == true) {
								setMoney(25000);
								setValueB9("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B9ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB9 == true) {
								setMoney(50000);
								setValueB9("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB10)) {
			if (isOwnedB10 == true) {
				if (isHouseB10 == false && isMarketB10 == false && isSaloonB10 == false && isGExtractorB10 == false
						&& isOExtractorB10 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B10 = new Scanner(System.in);
					String B10ing = B10.nextLine();

					if (B10ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB10("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B10ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB10("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B10ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB10("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B10ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB10 == true) {
								setMoney(25000);
								setValueB10("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B10ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB10 == true) {
								setMoney(50000);
								setValueB10("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB11)) {
			if (isOwnedB11 == true) {
				if (isHouseB11 == false && isMarketB11 == false && isSaloonB11 == false && isGExtractorB11 == false
						&& isOExtractorB11 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B11 = new Scanner(System.in);
					String B11ing = B11.nextLine();

					if (B11ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB11("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B11ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB11("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B11ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB11("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B11ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB11 == true) {
								setMoney(25000);
								setValueB11("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B11ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB11 == true) {
								setMoney(50000);
								setValueB11("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB12)) {
			if (isOwnedB12 == true) {
				if (isHouseB12 == false && isMarketB12 == false && isSaloonB12 == false && isGExtractorB12 == false
						&& isOExtractorB12 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B12 = new Scanner(System.in);
					String B12ing = B12.nextLine();

					if (B12ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB12("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B12ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB12("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B12ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB12("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B12ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB12 == true) {
								setMoney(25000);
								setValueB12("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B12ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB12 == true) {
								setMoney(50000);
								setValueB12("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB13)) {
			if (isOwnedB13 == true) {
				if (isHouseB13 == false && isMarketB13 == false && isSaloonB13 == false && isGExtractorB13 == false
						&& isOExtractorB13 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B13 = new Scanner(System.in);
					String B13ing = B13.nextLine();

					if (B13ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB13("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B13ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB13("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B13ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB13("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B13ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB13 == true) {
								setMoney(25000);
								setValueB13("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B13ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB13 == true) {
								setMoney(50000);
								setValueB13("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB14)) {
			if (isOwnedB14 == true) {
				if (isHouseB14 == false && isMarketB14 == false && isSaloonB14 == false && isGExtractorB14 == false
						&& isOExtractorB14 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B14 = new Scanner(System.in);
					String B14ing = B14.nextLine();

					if (B14ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB14("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B14ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB14("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B14ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB14("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B14ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB14 == true) {
								setMoney(25000);
								setValueB14("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B14ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB14 == true) {
								setMoney(50000);
								setValueB14("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB15)) {
			if (isOwnedB15 == true) {
				if (isHouseB15 == false && isMarketB15 == false && isSaloonB15 == false && isGExtractorB15 == false
						&& isOExtractorB15 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B15 = new Scanner(System.in);
					String B15ing = B15.nextLine();

					if (B15ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB15("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B15ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB15("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B15ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB15("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B15ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB15 == true) {
								setMoney(25000);
								setValueB15("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B15ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB15 == true) {
								setMoney(50000);
								setValueB15("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB16)) {
			if (isOwnedB16 == true) {
				if (isHouseB16 == false && isMarketB16 == false && isSaloonB16 == false && isGExtractorB16 == false
						&& isOExtractorB16 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B16 = new Scanner(System.in);
					String B16ing = B16.nextLine();

					if (B16ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB16("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B16ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB16("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B16ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB16("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B16ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB16 == true) {
								setMoney(25000);
								setValueB16("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B16ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB16 == true) {
								setMoney(50000);
								setValueB16("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB17)) {
			if (isOwnedB17 == true) {
				if (isHouseB17 == false && isMarketB17 == false && isSaloonB17 == false && isGExtractorB17 == false
						&& isOExtractorB17 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B17 = new Scanner(System.in);
					String B17ing = B17.nextLine();

					if (B17ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB17("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B17ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB17("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B17ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB17("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B17ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB17 == true) {
								setMoney(25000);
								setValueB17("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B17ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB17 == true) {
								setMoney(50000);
								setValueB17("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nB18)) {
			if (isOwnedB18 == true) {
				if (isHouseB18 == false && isMarketB18 == false && isSaloonB18 == false && isGExtractorB18 == false
						&& isOExtractorB18 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner B18 = new Scanner(System.in);
					String B18ing = B18.nextLine();

					if (B18ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueB18("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (B18ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueB18("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (B18ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueB18("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (B18ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilB18 == true) {
								setMoney(25000);
								setValueB18("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (B18ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldB18 == true) {
								setMoney(50000);
								setValueB18("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC1)) {
			if (isOwnedC1 == true) {
				if (isHouseC1 == false && isMarketC1 == false && isSaloonC1 == false && isGExtractorC1 == false
						&& isOExtractorC1 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C1 = new Scanner(System.in);
					String C1ing = C1.nextLine();

					if (C1ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC1("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C1ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC1("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C1ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC1("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C1ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC1 == true) {
								setMoney(25000);
								setValueC1("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C1ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC1 == true) {
								setMoney(50000);
								setValueC1("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC2)) {
			if (isOwnedC2 == true) {
				if (isHouseC2 == false && isMarketC2 == false && isSaloonC2 == false && isGExtractorC2 == false
						&& isOExtractorC2 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C2 = new Scanner(System.in);
					String C2ing = C2.nextLine();

					if (C2ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC2("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C2ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC2("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C2ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC2("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C2ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC2 == true) {
								setMoney(25000);
								setValueC2("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C2ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC2 == true) {
								setMoney(50000);
								setValueC2("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC3)) {
			if (isOwnedC3 == true) {
				if (isHouseC3 == false && isMarketC3 == false && isSaloonC3 == false && isGExtractorC3 == false
						&& isOExtractorC3 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C3 = new Scanner(System.in);
					String C3ing = C3.nextLine();

					if (C3ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC3("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C3ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC3("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C3ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC3("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C3ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC3 == true) {
								setMoney(25000);
								setValueC3("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C3ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC3 == true) {
								setMoney(50000);
								setValueC3("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC4)) {
			if (isOwnedC4 == true) {
				if (isHouseC4 == false && isMarketC4 == false && isSaloonC4 == false && isGExtractorC4 == false
						&& isOExtractorC4 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C4 = new Scanner(System.in);
					String C4ing = C4.nextLine();

					if (C4ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC4("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C4ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC4("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C4ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC4("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C4ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC4 == true) {
								setMoney(25000);
								setValueC4("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C4ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC4 == true) {
								setMoney(50000);
								setValueC4("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC5)) {
			if (isOwnedC5 == true) {
				if (isHouseC5 == false && isMarketC5 == false && isSaloonC5 == false && isGExtractorC5 == false
						&& isOExtractorC5 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C5 = new Scanner(System.in);
					String C5ing = C5.nextLine();

					if (C5ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC5("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C5ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC5("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C5ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC5("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C5ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC5 == true) {
								setMoney(25000);
								setValueC5("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C5ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC5 == true) {
								setMoney(50000);
								setValueC5("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC6)) {
			if (isOwnedC6 == true) {
				if (isHouseC6 == false && isMarketC6 == false && isSaloonC6 == false && isGExtractorC6 == false
						&& isOExtractorC6 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C6 = new Scanner(System.in);
					String C6ing = C6.nextLine();

					if (C6ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC6("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C6ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC6("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C6ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC6("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C6ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC6 == true) {
								setMoney(25000);
								setValueC6("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C6ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC6 == true) {
								setMoney(50000);
								setValueC6("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC7)) {
			if (isOwnedC7 == true) {
				if (isHouseC7 == false && isMarketC7 == false && isSaloonC7 == false && isGExtractorC7 == false
						&& isOExtractorC7 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C7 = new Scanner(System.in);
					String C7ing = C7.nextLine();

					if (C7ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC7("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C7ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC7("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C7ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC7("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C7ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC7 == true) {
								setMoney(25000);
								setValueC7("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C7ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC7 == true) {
								setMoney(50000);
								setValueC7("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC8)) {
			if (isOwnedC8 == true) {
				if (isHouseC8 == false && isMarketC8 == false && isSaloonC8 == false && isGExtractorC8 == false
						&& isOExtractorC8 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C8 = new Scanner(System.in);
					String C8ing = C8.nextLine();

					if (C8ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC8("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C8ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC8("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C8ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC8("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C8ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC8 == true) {
								setMoney(25000);
								setValueC8("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C8ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC8 == true) {
								setMoney(50000);
								setValueC8("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC9)) {
			if (isOwnedC9 == true) {
				if (isHouseC9 == false && isMarketC9 == false && isSaloonC9 == false && isGExtractorC9 == false
						&& isOExtractorC9 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C9 = new Scanner(System.in);
					String C9ing = C9.nextLine();

					if (C9ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC9("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C9ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC9("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C9ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC9("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C9ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC9 == true) {
								setMoney(25000);
								setValueC9("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C9ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC9 == true) {
								setMoney(50000);
								setValueC9("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC10)) {
			if (isOwnedC10 == true) {
				if (isHouseC10 == false && isMarketC10 == false && isSaloonC10 == false && isGExtractorC10 == false
						&& isOExtractorC10 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C10 = new Scanner(System.in);
					String C10ing = C10.nextLine();

					if (C10ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC10("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C10ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC10("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C10ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC10("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C10ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC10 == true) {
								setMoney(25000);
								setValueC10("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C10ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC10 == true) {
								setMoney(50000);
								setValueC10("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC11)) {
			if (isOwnedC11 == true) {
				if (isHouseC11 == false && isMarketC11 == false && isSaloonC11 == false && isGExtractorC11 == false
						&& isOExtractorC11 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C11 = new Scanner(System.in);
					String C11ing = C11.nextLine();

					if (C11ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC11("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C11ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC11("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C11ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC11("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C11ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC11 == true) {
								setMoney(25000);
								setValueC11("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C11ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC11 == true) {
								setMoney(50000);
								setValueC11("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC12)) {
			if (isOwnedC12 == true) {
				if (isHouseC12 == false && isMarketC12 == false && isSaloonC12 == false && isGExtractorC12 == false
						&& isOExtractorC12 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C12 = new Scanner(System.in);
					String C12ing = C12.nextLine();

					if (C12ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC12("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C12ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC12("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C12ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC12("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C12ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC12 == true) {
								setMoney(25000);
								setValueC12("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C12ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC12 == true) {
								setMoney(50000);
								setValueC12("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC13)) {
			if (isOwnedC13 == true) {
				if (isHouseC13 == false && isMarketC13 == false && isSaloonC13 == false && isGExtractorC13 == false
						&& isOExtractorC13 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C13 = new Scanner(System.in);
					String C13ing = C13.nextLine();

					if (C13ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC13("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C13ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC13("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C13ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC13("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C13ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC13 == true) {
								setMoney(25000);
								setValueC13("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C13ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC13 == true) {
								setMoney(50000);
								setValueC13("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC14)) {
			if (isOwnedC14 == true) {
				if (isHouseC14 == false && isMarketC14 == false && isSaloonC14 == false && isGExtractorC14 == false
						&& isOExtractorC14 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C14 = new Scanner(System.in);
					String C14ing = C14.nextLine();

					if (C14ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC14("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C14ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC14("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C14ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC14("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C14ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC14 == true) {
								setMoney(25000);
								setValueC14("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C14ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC14 == true) {
								setMoney(50000);
								setValueC14("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC15)) {
			if (isOwnedC15 == true) {
				if (isHouseC15 == false && isMarketC15 == false && isSaloonC15 == false && isGExtractorC15 == false
						&& isOExtractorC15 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C15 = new Scanner(System.in);
					String C15ing = C15.nextLine();

					if (C15ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC15("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C15ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC15("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C15ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC15("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C15ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC15 == true) {
								setMoney(25000);
								setValueC15("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C15ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC15 == true) {
								setMoney(50000);
								setValueC15("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC16)) {
			if (isOwnedC16 == true) {
				if (isHouseC16 == false && isMarketC16 == false && isSaloonC16 == false && isGExtractorC16 == false
						&& isOExtractorC16 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C16 = new Scanner(System.in);
					String C16ing = C16.nextLine();

					if (C16ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC16("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C16ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC16("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C16ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC16("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C16ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC16 == true) {
								setMoney(25000);
								setValueC16("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C16ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC16 == true) {
								setMoney(50000);
								setValueC16("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC17)) {
			if (isOwnedC17 == true) {
				if (isHouseC17 == false && isMarketC17 == false && isSaloonC17 == false && isGExtractorC17 == false
						&& isOExtractorC17 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner C17 = new Scanner(System.in);
					String C17ing = C17.nextLine();

					if (C17ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC17("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (C17ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC17("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C17ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC17("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (C17ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC17 == true) {
								setMoney(25000);
								setValueC17("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C17ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC17 == true) {
								setMoney(50000);
								setValueC17("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nC18)) {
			if (isOwnedC18 == true) {
				if (isHouseC18 == false && isMarketC18 == false && isSaloonC18 == false && isGExtractorC18 == false
						&& isOExtractorC18 == false) {
					System.out.println();
					System.out.println(
							"What would you like to Build on this plot? To Build extractors you must type '(resource) extractor'.");
					Scanner C18 = new Scanner(System.in);
					String C18ing = C18.nextLine();

					if (C18ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueC18("^");
							houseCount++;
							System.out.println("The house is Built!");
							printBoard();
						}
					}
					if (C18ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueC18("*");
							saloonCount++;
							System.out.println("The saloon is Built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot Cuild the saloon for lack of funds.");
							printBoard();
						}
					}
					if (C18ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueC18("#");
							marketCount++;
							System.out.println("The market is Cuilt!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot Cuild the market for lack of funds.");
							printBoard();
						}
					}
					if (C18ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilC18 == true) {
								setMoney(25000);
								setValueC18("&");
								oilECount++;
								System.out.println("The oil extractor is Cuilt!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot Cuild the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (C18ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldC18 == true) {
								setMoney(50000);
								setValueC18("$");
								goldECount++;
								System.out.println("The gold extractor is Cuilt!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot Cuild the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already Cuilt there, however, you can sell the Cuilding.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD1)) {
			if (isOwnedD1 == true) {
				if (isHouseD1 == false && isMarketD1 == false && isSaloonD1 == false && isGExtractorD1 == false
						&& isOExtractorD1 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D1 = new Scanner(System.in);
					String D1ing = D1.nextLine();

					if (D1ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD1("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D1ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD1("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D1ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD1("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D1ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD1 == true) {
								setMoney(25000);
								setValueD1("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D1ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD1 == true) {
								setMoney(50000);
								setValueD1("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD2)) {
			if (isOwnedD2 == true) {
				if (isHouseD2 == false && isMarketD2 == false && isSaloonD2 == false && isGExtractorD2 == false
						&& isOExtractorD2 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D2 = new Scanner(System.in);
					String D2ing = D2.nextLine();

					if (D2ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD2("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D2ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD2("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D2ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD2("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D2ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD2 == true) {
								setMoney(25000);
								setValueD2("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D2ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD2 == true) {
								setMoney(50000);
								setValueD2("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD3)) {
			if (isOwnedD3 == true) {
				if (isHouseD3 == false && isMarketD3 == false && isSaloonD3 == false && isGExtractorD3 == false
						&& isOExtractorD3 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D3 = new Scanner(System.in);
					String D3ing = D3.nextLine();

					if (D3ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD3("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D3ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD3("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D3ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD3("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D3ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD3 == true) {
								setMoney(25000);
								setValueD3("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D3ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD3 == true) {
								setMoney(50000);
								setValueD3("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD4)) {
			if (isOwnedD4 == true) {
				if (isHouseD4 == false && isMarketD4 == false && isSaloonD4 == false && isGExtractorD4 == false
						&& isOExtractorD4 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D4 = new Scanner(System.in);
					String D4ing = D4.nextLine();

					if (D4ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD4("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D4ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD4("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D4ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD4("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D4ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD4 == true) {
								setMoney(25000);
								setValueD4("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D4ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD4 == true) {
								setMoney(50000);
								setValueD4("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD5)) {
			if (isOwnedD5 == true) {
				if (isHouseD5 == false && isMarketD5 == false && isSaloonD5 == false && isGExtractorD5 == false
						&& isOExtractorD5 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D5 = new Scanner(System.in);
					String D5ing = D5.nextLine();

					if (D5ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD5("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D5ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD5("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D5ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD5("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D5ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD5 == true) {
								setMoney(25000);
								setValueD5("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D5ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD5 == true) {
								setMoney(50000);
								setValueD5("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD6)) {
			if (isOwnedD6 == true) {
				if (isHouseD6 == false && isMarketD6 == false && isSaloonD6 == false && isGExtractorD6 == false
						&& isOExtractorD6 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D6 = new Scanner(System.in);
					String D6ing = D6.nextLine();

					if (D6ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD6("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D6ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD6("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D6ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD6("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D6ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD6 == true) {
								setMoney(25000);
								setValueD6("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D6ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD6 == true) {
								setMoney(50000);
								setValueD6("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD7)) {
			if (isOwnedD7 == true) {
				if (isHouseD7 == false && isMarketD7 == false && isSaloonD7 == false && isGExtractorD7 == false
						&& isOExtractorD7 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D7 = new Scanner(System.in);
					String D7ing = D7.nextLine();

					if (D7ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD7("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D7ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD7("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D7ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD7("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D7ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD7 == true) {
								setMoney(25000);
								setValueD7("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D7ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD7 == true) {
								setMoney(50000);
								setValueD7("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD8)) {
			if (isOwnedD8 == true) {
				if (isHouseD8 == false && isMarketD8 == false && isSaloonD8 == false && isGExtractorD8 == false
						&& isOExtractorD8 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D8 = new Scanner(System.in);
					String D8ing = D8.nextLine();

					if (D8ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD8("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D8ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD8("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D8ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD8("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D8ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD8 == true) {
								setMoney(25000);
								setValueD8("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D8ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD8 == true) {
								setMoney(50000);
								setValueD8("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD9)) {
			if (isOwnedD9 == true) {
				if (isHouseD9 == false && isMarketD9 == false && isSaloonD9 == false && isGExtractorD9 == false
						&& isOExtractorD9 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D9 = new Scanner(System.in);
					String D9ing = D9.nextLine();

					if (D9ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD9("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D9ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD9("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D9ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD9("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D9ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD9 == true) {
								setMoney(25000);
								setValueD9("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D9ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD9 == true) {
								setMoney(50000);
								setValueD9("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD10)) {
			if (isOwnedD10 == true) {
				if (isHouseD10 == false && isMarketD10 == false && isSaloonD10 == false && isGExtractorD10 == false
						&& isOExtractorD10 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D10 = new Scanner(System.in);
					String D10ing = D10.nextLine();

					if (D10ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD10("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D10ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD10("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D10ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD10("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D10ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD10 == true) {
								setMoney(25000);
								setValueD10("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D10ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD10 == true) {
								setMoney(50000);
								setValueD10("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD11)) {
			if (isOwnedD11 == true) {
				if (isHouseD11 == false && isMarketD11 == false && isSaloonD11 == false && isGExtractorD11 == false
						&& isOExtractorD11 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D11 = new Scanner(System.in);
					String D11ing = D11.nextLine();

					if (D11ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD11("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D11ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD11("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D11ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD11("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D11ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD11 == true) {
								setMoney(25000);
								setValueD11("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D11ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD11 == true) {
								setMoney(50000);
								setValueD11("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD12)) {
			if (isOwnedD12 == true) {
				if (isHouseD12 == false && isMarketD12 == false && isSaloonD12 == false && isGExtractorD12 == false
						&& isOExtractorD12 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D12 = new Scanner(System.in);
					String D12ing = D12.nextLine();

					if (D12ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD12("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D12ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD12("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D12ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD12("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D12ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD12 == true) {
								setMoney(25000);
								setValueD12("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D12ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD12 == true) {
								setMoney(50000);
								setValueD12("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD13)) {
			if (isOwnedD13 == true) {
				if (isHouseD13 == false && isMarketD13 == false && isSaloonD13 == false && isGExtractorD13 == false
						&& isOExtractorD13 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D13 = new Scanner(System.in);
					String D13ing = D13.nextLine();

					if (D13ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD13("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D13ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD13("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D13ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD13("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D13ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD13 == true) {
								setMoney(25000);
								setValueD13("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D13ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD13 == true) {
								setMoney(50000);
								setValueD13("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD14)) {
			if (isOwnedD14 == true) {
				if (isHouseD14 == false && isMarketD14 == false && isSaloonD14 == false && isGExtractorD14 == false
						&& isOExtractorD14 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D14 = new Scanner(System.in);
					String D14ing = D14.nextLine();

					if (D14ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD14("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D14ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD14("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D14ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD14("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D14ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD14 == true) {
								setMoney(25000);
								setValueD14("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D14ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD14 == true) {
								setMoney(50000);
								setValueD14("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD15)) {
			if (isOwnedD15 == true) {
				if (isHouseD15 == false && isMarketD15 == false && isSaloonD15 == false && isGExtractorD15 == false
						&& isOExtractorD15 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D15 = new Scanner(System.in);
					String D15ing = D15.nextLine();

					if (D15ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD15("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D15ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD15("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D15ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD15("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D15ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD15 == true) {
								setMoney(25000);
								setValueD15("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D15ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD15 == true) {
								setMoney(50000);
								setValueD15("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD16)) {
			if (isOwnedD16 == true) {
				if (isHouseD16 == false && isMarketD16 == false && isSaloonD16 == false && isGExtractorD16 == false
						&& isOExtractorD16 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D16 = new Scanner(System.in);
					String D16ing = D16.nextLine();

					if (D16ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD16("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D16ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD16("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D16ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD16("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D16ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD16 == true) {
								setMoney(25000);
								setValueD16("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D16ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD16 == true) {
								setMoney(50000);
								setValueD16("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD17)) {
			if (isOwnedD17 == true) {
				if (isHouseD17 == false && isMarketD17 == false && isSaloonD17 == false && isGExtractorD17 == false
						&& isOExtractorD17 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D17 = new Scanner(System.in);
					String D17ing = D17.nextLine();

					if (D17ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD17("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D17ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD17("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D17ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD17("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D17ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD17 == true) {
								setMoney(25000);
								setValueD17("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D17ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD17 == true) {
								setMoney(50000);
								setValueD17("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to Duy that plot of land first.");
				printBoard();
			}
		}
		if (building.equals(nD18)) {
			if (isOwnedD18 == true) {
				if (isHouseD18 == false && isMarketD18 == false && isSaloonD18 == false && isGExtractorD18 == false
						&& isOExtractorD18 == false) {
					System.out.println();
					System.out.println(
							"What would you like to build on this plot? To build extractors you must type '(resource) extractor'.");
					Scanner D18 = new Scanner(System.in);
					String D18ing = D18.nextLine();

					if (D18ing.equals(house)) {
						if (money >= 1000) {
							setMoney(1000);
							setValueD18("^");
							houseCount++;
							System.out.println("The house is built!");
							printBoard();
						}
					}
					if (D18ing.equals(saloon)) {
						if (money >= 2500) {
							setMoney(2500);
							setValueD18("*");
							saloonCount++;
							System.out.println("The saloon is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the saloon for lack of funds.");
							printBoard();
						}
					}
					if (D18ing.equals(market)) {
						if (money >= 5000) {
							setMoney(5000);
							setValueD18("#");
							marketCount++;
							System.out.println("The market is built!");
							printBoard();
						} else {
							System.out.println();
							System.out.println("You cannot build the market for lack of funds.");
							printBoard();
						}
					}
					if (D18ing.equals(oilE)) {
						if (money >= 25000) {
							if (isOilD18 == true) {
								setMoney(25000);
								setValueD18("&");
								oilECount++;
								System.out.println("The oil extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place an oil extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the oil extractor for lack of funds.");
							printBoard();
						}
					}
					if (D18ing.equals(goldE)) {
						if (money >= 50000) {
							if (isGoldD18 == true) {
								setMoney(50000);
								setValueD18("$");
								goldECount++;
								System.out.println("The gold extractor is built!");
								printBoard();
							} else {
								System.out.println();
								System.out.println("You cannot place a gold extractor here.");
								printBoard();
							}
						} else {
							System.out.println();
							System.out.println("You cannot build the gold extractor for lack of funds.");
							printBoard();
						}
					}
				} else {
					System.out.println();
					System.out.println("Something is already built there.");
					printBoard();
				}
			} else {
				System.out.println();
				System.out.println("You need to buy that plot of land first.");
				printBoard();
			}
		} else {
			build();
		}
	}


	public static void stats() {
		System.out.println();
		System.out.println("Cash: " + money);
		System.out.println("Owned lands: " + landCount);
		System.out.println("Unowned lands: " + (72-landCount));
		System.out.println("Current reap reward: " + reapReward);
		System.out.println("Reap count: "+ reapCount);
		System.out.println("House count: "+ houseCount);
		System.out.println("Saloon count: "+ saloonCount);
		System.out.println("Market count: "+ marketCount);
		System.out.println("Oil extractor count: "+ oilECount);
		System.out.println("Gold extractor count: "+ goldECount);
		System.out.println("Current land price: " + landCost);
		System.out.println("Cost of house: $1000");
		System.out.println("Reap reward of house: $100");
		System.out.println("Cost of saloon: $2500");
		System.out.println("Reap reward of saloon: $500");
		System.out.println("Cost of market: $5000");
		System.out.println("Reap reward of market: $1000");
		System.out.println("Cost of oil extractor: $25000");
		System.out.println("Reap reward of oil extractor: $5000");
		System.out.println("Cost of gold extractor: $50000");
		System.out.println("Reap reward of gold extractor: $10000");
		cmdPrompt();
	}

	public static void reap() {
		reapCount++;
		reapReward = ((100 * houseCount) + (500 * saloonCount) + (1000 * marketCount) + (5000 * oilECount) + (10000 * goldECount));
		money = money + reapReward;
		System.out.println();
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.print(".");
		sleep1s();
		System.out.println();
		System.out.println();
		System.out.println("Your cash count is " + money + " and your reap count is " + reapCount + "!");
		printBoard();
	}

	
	public static void cmdPrompt() {
		System.out.println();
		System.out.println("Please enter a command.");
		Scanner command = new Scanner(System.in);
		String cmd = command.nextLine();

		if (cmd.equals(buy)) {
			if (money < 500) {
				System.out.println();
				System.out.println("You cannot buy anything at this time.");
				printBoard();
			} else {
				buy();
			}
		}
		if (cmd.equals(build)) {
			if (money < 1000) {
				System.out.println();
				System.out.println("You cannot build anything at this time.");
				printBoard();
			} else {
				build();
			}
		}
		if (cmd.equals(stats)) {
			stats();
		}
		if (cmd.equals(reap)) {
			reap();
		} else {
			cmdPrompt();
		}
		command.close();
	}

	
	public static void setLandCount() {
		landCount++;
		landCost = ((landCount * 2) * (landCount * 2)) + 500;
	}

	public static void setMoney(int c) {
		money = money - c;
	}

	public static void setValueA1(String s) {
		if (A1 != "@" && A1 != "G") {
			A1 = s;
		}
	}

	public static void setValueA2(String s) {
		if (A2 != "@" && A2 != "G") {
			A2 = s;
		}
	}

	public static void setValueA3(String s) {
		if (A3 != "@" && A3 != "G") {
			A3 = s;
		}
	}

	public static void setValueA4(String s) {
		if (A4 != "@" && A4 != "G") {
			A4 = s;
		}
	}

	public static void setValueA5(String s) {
		if (A5 != "@" && A5 != "G") {
			A5 = s;
		}
	}

	public static void setValueA6(String s) {
		if (A6 != "@" && A6 != "G") {
			A6 = s;
		}
	}

	public static void setValueA7(String s) {
		if (A7 != "@" && A7 != "G") {
			A7 = s;
		}
	}

	public static void setValueA8(String s) {
		if (A8 != "@" && A8 != "G") {
			A8 = s;
		}
	}

	public static void setValueA9(String s) {
		if (A9 != "@" && A9 != "G") {
			A9 = s;
		}
	}

	public static void setValueA10(String s) {
		if (A10 != "@" && A10 != "G") {
			A10 = s;
		}
	}

	public static void setValueA11(String s) {
		if (A11 != "@" && A11 != "G") {
			A11 = s;
		}
	}

	public static void setValueA12(String s) {
		if (A12 != "@" && A12 != "G") {
			A12 = s;
		}
	}

	public static void setValueA13(String s) {
		if (A13 != "@" && A13 != "G") {
			A13 = s;
		}
	}

	public static void setValueA14(String s) {
		if (A14 != "@" && A14 != "G") {
			A14 = s;
		}
	}

	public static void setValueA15(String s) {
		if (A15 != "@" && A15 != "G") {
			A15 = s;
		}
	}

	public static void setValueA16(String s) {
		if (A16 != "@" && A16 != "G") {
			A16 = s;
		}
	}

	public static void setValueA17(String s) {
		if (A17 != "@" && A17 != "G") {
			A17 = s;
		}
	}

	public static void setValueA18(String s) {
		if (A18 != "@" && A18 != "G") {
			A18 = s;
		}
	}

	public static void setValueB1(String s) {
		if (B1 != "@" && B1 != "G") {
			B1 = s;
		}
	}

	public static void setValueB2(String s) {
		if (B2 != "@" && B2 != "G") {
			B2 = s;
		}
	}

	public static void setValueB3(String s) {
		if (B3 != "@" && B3 != "G") {
			B3 = s;
		}
	}

	public static void setValueB4(String s) {
		if (B4 != "@" && B4 != "G") {
			B4 = s;
		}
	}

	public static void setValueB5(String s) {
		if (B5 != "@" && B5 != "G") {
			B5 = s;
		}
	}

	public static void setValueB6(String s) {
		if (B6 != "@" && B6 != "G") {
			B6 = s;
		}
	}

	public static void setValueB7(String s) {
		if (B7 != "@" && B7 != "G") {
			B7 = s;
		}
	}

	public static void setValueB8(String s) {
		if (B8 != "@" && B8 != "G") {
			B8 = s;
		}
	}

	public static void setValueB9(String s) {
		if (B9 != "@" && B9 != "G") {
			B9 = s;
		}
	}

	public static void setValueB10(String s) {
		if (B10 != "@" && B10 != "G") {
			B10 = s;
		}
	}

	public static void setValueB11(String s) {
		if (B11 != "@" && B11 != "G") {
			B11 = s;
		}
	}

	public static void setValueB12(String s) {
		if (B12 != "@" && B12 != "G") {
			B12 = s;
		}
	}

	public static void setValueB13(String s) {
		if (B13 != "@" && B13 != "G") {
			B13 = s;
		}
	}

	public static void setValueB14(String s) {
		if (B14 != "@" && B14 != "G") {
			B14 = s;
		}
	}

	public static void setValueB15(String s) {
		if (B15 != "@" && B15 != "G") {
			B15 = s;
		}
	}

	public static void setValueB16(String s) {
		if (B16 != "@" && B16 != "G") {
			B16 = s;
		}
	}

	public static void setValueB17(String s) {
		if (B17 != "@" && B17 != "G") {
			B17 = s;
		}
	}

	public static void setValueB18(String s) {
		if (B18 != "@" && B18 != "G") {
			B18 = s;
		}
	}

	public static void setValueC1(String s) {
		if (C1 != "@" && C1 != "G") {
			C1 = s;
		}
	}

	public static void setValueC2(String s) {
		if (C2 != "@" && C2 != "G") {
			C2 = s;
		}
	}

	public static void setValueC3(String s) {
		if (C3 != "@" && C3 != "G") {
			C3 = s;
		}
	}

	public static void setValueC4(String s) {
		if (C4 != "@" && C4 != "G") {
			C4 = s;
		}
	}

	public static void setValueC5(String s) {
		if (C5 != "@" && C5 != "G") {
			C5 = s;
		}
	}

	public static void setValueC6(String s) {
		if (C6 != "@" && C6 != "G") {
			C6 = s;
		}
	}

	public static void setValueC7(String s) {
		if (C7 != "@" && C7 != "G") {
			C7 = s;
		}
	}

	public static void setValueC8(String s) {
		if (C8 != "@" && C8 != "G") {
			C8 = s;
		}
	}

	public static void setValueC9(String s) {
		if (C9 != "@" && C9 != "G") {
			C9 = s;
		}
	}

	public static void setValueC10(String s) {
		if (C10 != "@" && C10 != "G") {
			C10 = s;
		}
	}

	public static void setValueC11(String s) {
		if (C11 != "@" && C11 != "G") {
			C11 = s;
		}
	}

	public static void setValueC12(String s) {
		if (C12 != "@" && C12 != "G") {
			C12 = s;
		}
	}

	public static void setValueC13(String s) {
		if (C13 != "@" && C13 != "G") {
			C13 = s;
		}
	}

	public static void setValueC14(String s) {
		if (C14 != "@" && C14 != "G") {
			C14 = s;
		}
	}

	public static void setValueC15(String s) {
		if (C15 != "@" && C15 != "G") {
			C15 = s;
		}
	}

	public static void setValueC16(String s) {
		if (C16 != "@" && C16 != "G") {
			C16 = s;
		}
	}

	public static void setValueC17(String s) {
		if (C17 != "@" && C17 != "G") {
			C17 = s;
		}
	}

	public static void setValueC18(String s) {
		if (C18 != "@" && C18 != "G") {
			C18 = s;
		}
	}
	
	public static void setValueD1(String s) {
		if (D1 != "@" && D1 != "G") {
			D1 = s;
		}
	}

	public static void setValueD2(String s) {
		if (D2 != "@" && D2 != "G") {
			D2 = s;
		}
	}

	public static void setValueD3(String s) {
		if (D3 != "@" && D3 != "G") {
			D3 = s;
		}
	}

	public static void setValueD4(String s) {
		if (D4 != "@" && D4 != "G") {
			D4 = s;
		}
	}

	public static void setValueD5(String s) {
		if (D5 != "@" && D5 != "G") {
			D5 = s;
		}
	}

	public static void setValueD6(String s) {
		if (D6 != "@" && D6 != "G") {
			D6 = s;
		}
	}

	public static void setValueD7(String s) {
		if (D7 != "@" && D7 != "G") {
			D7 = s;
		}
	}

	public static void setValueD8(String s) {
		if (D8 != "@" && D8 != "G") {
			D8 = s;
		}
	}

	public static void setValueD9(String s) {
		if (D9 != "@" && D9 != "G") {
			D9 = s;
		}
	}

	public static void setValueD10(String s) {
		if (D10 != "@" && D10 != "G") {
			D10 = s;
		}
	}

	public static void setValueD11(String s) {
		if (D11 != "@" && D11 != "G") {
			D11 = s;
		}
	}

	public static void setValueD12(String s) {
		if (D12 != "@" && D12 != "G") {
			D12 = s;
		}
	}

	public static void setValueD13(String s) {
		if (D13 != "@" && D13 != "G") {
			D13 = s;
		}
	}

	public static void setValueD14(String s) {
		if (D14 != "@" && D14 != "G") {
			D14 = s;
		}
	}

	public static void setValueD15(String s) {
		if (D15 != "@" && D15 != "G") {
			D15 = s;
		}
	}

	public static void setValueD16(String s) {
		if (D16 != "@" && D16 != "G") {
			D16 = s;
		}
	}

	public static void setValueD17(String s) {
		if (D17 != "@" && D17 != "G") {
			D17 = s;
		}
	}

	public static void setValueD18(String s) {
		if (D18 != "@" && D18 != "G") {
			D18 = s;
		}
	}
	
	public static void setOwnValueA1() {
		isOwnedA1 = true;
		A1 = "!";
	}

	public static void setOwnValueA2() {
		isOwnedA2 = true;
		A2 = "!";
	}

	public static void setOwnValueA3() {
		isOwnedA3 = true;
		A3 = "!";
	}

	public static void setOwnValueA4() {
		isOwnedA4 = true;
		A4 = "!";
	}

	public static void setOwnValueA5() {
		isOwnedA5 = true;
		A5 = "!";
	}

	public static void setOwnValueA6() {
		isOwnedA6 = true;
		A6 = "!";
	}

	public static void setOwnValueA7() {
		isOwnedA7 = true;
		A7 = "!";
	}

	public static void setOwnValueA8() {
		isOwnedA8 = true;
		A8 = "!";
	}

	public static void setOwnValueA9() {
		isOwnedA9 = true;
		A9 = "!";
	}

	public static void setOwnValueA10() {
		isOwnedA10 = true;
		A10 = "!";
	}

	public static void setOwnValueA11() {
		isOwnedA11 = true;
		A11 = "!";
	}

	public static void setOwnValueA12() {
		isOwnedA12 = true;
		A12 = "!";
	}

	public static void setOwnValueA13() {
		isOwnedA13 = true;
		A13 = "!";
	}

	public static void setOwnValueA14() {
		isOwnedA14 = true;
		A14 = "!";
	}

	public static void setOwnValueA15() {
		isOwnedA15 = true;
		A15 = "!";
	}

	public static void setOwnValueA16() {
		isOwnedA16 = true;
		A16 = "!";
	}

	public static void setOwnValueA17() {
		isOwnedA17 = true;
		A17 = "!";
	}

	public static void setOwnValueA18() {
		isOwnedA18 = true;
		A18 = "!";
	}

	public static void setOwnValueB1() {
		isOwnedB1 = true;
		B1 = "!";
	}

	public static void setOwnValueB2() {
		isOwnedB2 = true;
		B2 = "!";
	}

	public static void setOwnValueB3() {
		isOwnedB3 = true;
		B3 = "!";
	}

	public static void setOwnValueB4() {
		isOwnedB4 = true;
		B4 = "!";
	}

	public static void setOwnValueB5() {
		isOwnedB5 = true;
		B5 = "!";
	}

	public static void setOwnValueB6() {
		isOwnedB6 = true;
		B6 = "!";
	}

	public static void setOwnValueB7() {
		isOwnedB7 = true;
		B7 = "!";
	}

	public static void setOwnValueB8() {
		isOwnedB8 = true;
		B8 = "!";
	}

	public static void setOwnValueB9() {
		isOwnedB9 = true;
		B9 = "!";
	}

	public static void setOwnValueB10() {
		isOwnedB10 = true;
		B10 = "!";
	}

	public static void setOwnValueB11() {
		isOwnedB11 = true;
		B11 = "!";
	}

	public static void setOwnValueB12() {
		isOwnedB12 = true;
		B12 = "!";
	}

	public static void setOwnValueB13() {
		isOwnedB13 = true;
		B13 = "!";
	}

	public static void setOwnValueB14() {
		isOwnedB14 = true;
		B14 = "!";
	}

	public static void setOwnValueB15() {
		isOwnedB15 = true;
		B15 = "!";
	}

	public static void setOwnValueB16() {
		isOwnedB16 = true;
		B16 = "!";
	}

	public static void setOwnValueB17() {
		isOwnedB17 = true;
		B17 = "!";
	}

	public static void setOwnValueB18() {
		isOwnedB18 = true;
		B18 = "!";
	}

	public static void setOwnValueC1() {
		isOwnedC1 = true;
		C1 = "!";
	}

	public static void setOwnValueC2() {
		isOwnedC2 = true;
		C2 = "!";
	}

	public static void setOwnValueC3() {
		isOwnedC3 = true;
		C3 = "!";
	}

	public static void setOwnValueC4() {
		isOwnedC4 = true;
		C4 = "!";
	}

	public static void setOwnValueC5() {
		isOwnedC5 = true;
		C5 = "!";
	}

	public static void setOwnValueC6() {
		isOwnedC6 = true;
		C6 = "!";
	}

	public static void setOwnValueC7() {
		isOwnedC7 = true;
		C7 = "!";
	}

	public static void setOwnValueC8() {
		isOwnedC8 = true;
		C8 = "!";
	}

	public static void setOwnValueC9() {
		isOwnedC9 = true;
		C9 = "!";
	}

	public static void setOwnValueC10() {
		isOwnedC10 = true;
		C10 = "!";
	}

	public static void setOwnValueC11() {
		isOwnedC11 = true;
		C11 = "!";
	}

	public static void setOwnValueC12() {
		isOwnedC12 = true;
		C12 = "!";
	}

	public static void setOwnValueC13() {
		isOwnedC13 = true;
		C13 = "!";
	}

	public static void setOwnValueC14() {
		isOwnedC14 = true;
		C14 = "!";
	}

	public static void setOwnValueC15() {
		isOwnedC15 = true;
		C15 = "!";
	}

	public static void setOwnValueC16() {
		isOwnedC16 = true;
		C16 = "!";
	}

	public static void setOwnValueC17() {
		isOwnedC17 = true;
		C17 = "!";
	}

	public static void setOwnValueC18() {
		isOwnedC18 = true;
		C18 = "!";
	}

	public static void setOwnValueD1() {
		isOwnedD1 = true;
		D1 = "!";
	}

	public static void setOwnValueD2() {
		isOwnedD2 = true;
		D2 = "!";
	}

	public static void setOwnValueD3() {
		isOwnedD3 = true;
		D3 = "!";
	}

	public static void setOwnValueD4() {
		isOwnedD4 = true;
		D4 = "!";
	}

	public static void setOwnValueD5() {
		isOwnedD5 = true;
		D5 = "!";
	}

	public static void setOwnValueD6() {
		isOwnedD6 = true;
		D6 = "!";
	}

	public static void setOwnValueD7() {
		isOwnedD7 = true;
		D7 = "!";
	}

	public static void setOwnValueD8() {
		isOwnedD8 = true;
		D8 = "!";
	}

	public static void setOwnValueD9() {
		isOwnedD9 = true;
		D9 = "!";
	}

	public static void setOwnValueD10() {
		isOwnedD10 = true;
		D10 = "!";
	}

	public static void setOwnValueD11() {
		isOwnedD11 = true;
		D11 = "!";
	}

	public static void setOwnValueD12() {
		isOwnedD12 = true;
		D12 = "!";
	}

	public static void setOwnValueD13() {
		isOwnedD13 = true;
		D13 = "!";
	}

	public static void setOwnValueD14() {
		isOwnedD14 = true;
		D14 = "!";
	}

	public static void setOwnValueD15() {
		isOwnedD15 = true;
		D15 = "!";
	}

	public static void setOwnValueD16() {
		isOwnedD16 = true;
		D16 = "!";
	}

	public static void setOwnValueD17() {
		isOwnedD17 = true;
		D17 = "!";
	}

	public static void setOwnValueD18() {
		isOwnedD18 = true;
		D18 = "!";
	}
}