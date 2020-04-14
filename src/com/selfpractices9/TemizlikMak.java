package com.selfpractices9;

public abstract class TemizlikMak {

	String color;

	public TemizlikMak(String color) {
		this.color = color;
	}

	public void yikama() {
		System.out.println("Butun makinalar yikar");
	}

	public abstract void temizlik();

}
class CamasirMak extends TemizlikMak {
    String marka;
    
    public CamasirMak(String color, String marka) {
        super(color);
        this.marka = marka;
        
    }
    @Override
    public void temizlik() {
        System.out.println("Resistansi surekli bozuluyor");       
    }
    public void yikama() {
        System.out.println("Camasir makinasi iyi yikamiyor");
    }
    
    
}
class BulasikMak extends TemizlikMak{
    int yil;
    
    public BulasikMak(String color, int yil) {
        super(color);
        this.yil = yil;
    
    }
    @Override
    public void temizlik() {
        System.out.println("Guzel temizliyor");
        
    }
}