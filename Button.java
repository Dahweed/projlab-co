package shokoban;

public class Button extends TileElement {
	private Trap trap;
	
	public void Accept(Object o, Direction d) {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");//itt úgy kéne, hogy annyi tab, ahányaid fgv hívás az adott dialógusba és a visszatérésnél is, csak nem tudom, hogy lenne az...
		System.out.println("[:Button].Accept(o,d):");
		
		if(this.getObject() != null)//amíg van a következő mezőn láda vagy munkás, addig hívjuk a push-t
			o.push(o, d);
		
		o.visit(this, d);
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].Accept(o,d):");		
	}
	
	public void Accept(Crate c, Direction d) {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");//itt úgy kéne, hogy annyi tab, ahányaid fgv hívás az adott dialógusba és a visszatérésnél is, csak nem tudom, hogy lenne az...
		System.out.println("[:Button].Accept(c,d):");
		
		if(this.getObject() != null)//amíg van a következő mezőn láda vagy munkás, addig hívjuk a push-t
			c.push(c, d);
		
		c.visit(this, d);
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].Accept(c,d):");		
	}
	
	public void Remove(Crate c) {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");
		System.out.println("[:Button].Remove(c):");
		
		//fgv törzs
		Switch(trap);
		c.setTile(null); //ebbe azért nem vagyok biztos
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].Remove(c):");
	}
	
	public void Switch(Trap t) {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");
		System.out.println("[:Button].Switch(t):");
		
		if(t.getActive())
			t.setActive(true); //aktívra állítjuk a csapdát
		else
			t.setActive(false); //inaktívra állítjuk a csapdát
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].Switch(c):");
	}

	public Trap getTrap() {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");
		System.out.println("[:Button].getTrap():");
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].getTrap():");
		
		return trap;
	}

	public void setTrap(Trap trap) {
		//bemegyünk a fgv-be
		System.out.println(">");
		System.out.println("	");
		System.out.println("[:Button].setTrap(trap):");
		
		this.trap = trap;
		
		//visszatérünk a fgv-ből
		System.out.println("<");
		System.out.println("	");
		System.out.println("[:Button].setTrap(trap):");		
	}
	
}
