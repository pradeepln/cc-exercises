package exercise02;

import java.util.Objects;

public class ChemicalElement implements Comparable<ChemicalElement> {

	private static final boolean[] ALKALI_METALS = new boolean[120];
	static {
		ALKALI_METALS[3] = true;
		ALKALI_METALS[11] = true;
		ALKALI_METALS[19] = true;
		ALKALI_METALS[37] = true;
		ALKALI_METALS[55] = true;
		ALKALI_METALS[87] = true;
	}
	
	private int atomicNumber;
	private String name, symbol;

	public ChemicalElement(int atomicNumber, String name, String symbol) {
		if (atomicNumber <= 0) {
			throw new IllegalArgumentException("hey, you can't pass 0 or -ve number for atomic number!!");
		}
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
	}
	
	
	public boolean isAlkaliMetal() {
		return ALKALI_METALS[atomicNumber];
	}

	public boolean isTransitionMetal() {
		return (this.atomicNumber >= 21 && this.atomicNumber <= 31)
				|| (this.atomicNumber >= 39 && this.atomicNumber <= 48)
				|| (this.atomicNumber >= 72 && this.atomicNumber <= 80)
				|| (this.atomicNumber >= 104 && this.atomicNumber <= 112);
	}

	public boolean isMetal() {

		switch (atomicNumber) {
			case 13:
			case 49:
			case 50:
			case 81:
			case 82:
			case 83:
			case 113:
			case 114:
			case 115:
			case 116:
				return true;
			default:
				return false;
		}
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(atomicNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		return atomicNumber == other.atomicNumber;
	}


	@Override
	public int compareTo(ChemicalElement other) {
		return this.atomicNumber - other.atomicNumber;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", name=" + name + ", symbol=" + symbol + "]";
	}

}
